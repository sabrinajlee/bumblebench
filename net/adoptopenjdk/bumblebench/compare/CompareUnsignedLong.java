package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedLong extends MicroBench {
    // Diverse test values including edge cases to prevent JIT optimization
    private static final long[] TEST_VALUES = {
        0L, 1L, -1L,
        Long.MIN_VALUE, Long.MAX_VALUE,
        0x7FFFFFFFFFFFFFFFL, 0x8000000000000000L,  // 64-bit sign boundary
        0x123456789ABCDEF0L, 0xFEDCBA9876543210L,  // 64-bit mixed bits
        42L, -42L, 1000000L, -1000000L,
        0x100000000L, -0x100000000L                // Values beyond 32-bit range
    };
    
    private static volatile long a = option("a", -1);
    private static volatile long b = option("b", 1);
    private static volatile long value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        long local_a = a;
        long local_b = b;
        long local_val = value;
        
        for (int i = 0; i < numIterations; i++) {
            // Cycle through test values to get diverse comparisons
            long val1 = TEST_VALUES[i % TEST_VALUES.length];
            long val2 = TEST_VALUES[(i + 1) % TEST_VALUES.length];
            
            local_val += Long.compareUnsigned(local_a, local_b)
                        + Long.compareUnsigned(val1, val2)
                        + Long.compareUnsigned(local_a, val1)
                        + Long.compareUnsigned(val2, local_b)
                        + Long.compareUnsigned(local_a + val1, local_b + val2);
            
            local_a += val1;
            local_b += val2;
        }
        
        a = local_a;
        b = local_b;
        value = local_val;
        
        return numIterations;
    }

}
