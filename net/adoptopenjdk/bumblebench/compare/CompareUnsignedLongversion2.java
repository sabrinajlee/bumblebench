package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedLongversion2 extends MicroBench {
    // Diverse test values including edge cases to prevent JIT optimization
    private static final long[] TEST_VALUES = {
        0, 1, -1,
        Long.MIN_VALUE, Long.MAX_VALUE,
        0x7FFFFFFF, 0x80000000,
        0x12345678, 0x87654321,
        42, -42, 1000000, -1000000
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
            
            local_val += Long.compareUnsigned(local_a, 12345)
                        + Long.compareUnsigned(val1, 67890)
                        + Long.compareUnsigned(local_b, 0)
                        + Long.compareUnsigned(val2, 3454)
                        + Long.compareUnsigned(local_a + val1, 23234);
            
            local_a += val1;
            local_b += val2;
        }
        
        a = local_a;
        b = local_b;
        value = local_val;
        
        return numIterations;
    }

}
