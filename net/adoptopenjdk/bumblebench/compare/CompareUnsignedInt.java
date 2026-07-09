package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    // Diverse test values including edge cases to prevent JIT optimization
    private static final int[] TEST_VALUES = {
        0, 1, -1,
        Integer.MIN_VALUE, Integer.MAX_VALUE,
        0x7FFFFFFF, 0x80000000,
        0x12345678, 0x87654321,
        42, -42, 1000000, -1000000
    };
    
    private static volatile int a = option("a", -1);
    private static volatile int b = option("b", 1);
    private static volatile int value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        int local_a = a;
        int local_b = b;
        int local_val = value;
        
        for (int i = 0; i < numIterations; i++) {
            // Cycle through test values to get diverse comparisons
            int val1 = TEST_VALUES[i % TEST_VALUES.length];
            int val2 = TEST_VALUES[(i + 1) % TEST_VALUES.length];
            
            local_val += Integer.compareUnsigned(i, local_b)
                        + Integer.compareUnsigned(val1, val2)
                        + Integer.compareUnsigned(local_a, val1)
                        + Integer.compareUnsigned(val2, i)
                        + Integer.compareUnsigned(i + val1, local_b + val2)
                        + Integer.compareUnsigned(val2, val2)
                        + Integer.compareUnsigned(local_a, val1)
                        + Integer.compareUnsigned(val2, local_b)
                        + Integer.compareUnsigned(local_b - val1, local_b - i)
                        + Integer.compareUnsigned(val1, local_b -val2)
                        + Integer.compareUnsigned(local_a, val1 + val2)
                        + Integer.compareUnsigned(local_b, local_b)
                        + Integer.compareUnsigned(val2 + val1, local_b + val2)
                        + Integer.compareUnsigned(val1, val2 - i)
                        + Integer.compareUnsigned(i, val1)
                        + Integer.compareUnsigned(val2, local_b)
                        + Integer.compareUnsigned(local_a + val1, local_b)
                        + Integer.compareUnsigned(val1 - local_a, val2 + local_a)
                        + Integer.compareUnsigned(local_a+ val1, val1)
                        + Integer.compareUnsigned(i - local_b, local_b)
                        + Integer.compareUnsigned(local_a - val1, val2)
                        + Integer.compareUnsigned(val1 + val2, val2)
                        + Integer.compareUnsigned(local_b, val1)
                        + Integer.compareUnsigned(val2, local_b + local_b)
                        + Integer.compareUnsigned(val2 + val1, local_b - val2)
                        + Integer.compareUnsigned(local_a, local_b)
                        + Integer.compareUnsigned(val1, val2)
                        + Integer.compareUnsigned(local_a, val1)
                        + Integer.compareUnsigned(val2, i)
                        + Integer.compareUnsigned(i + val1, local_b + val2)
                        + Integer.compareUnsigned(val2, val2)
                        + Integer.compareUnsigned(local_a, val1)
                        + Integer.compareUnsigned(val2, local_b)
                        + Integer.compareUnsigned(local_b - val1, local_b - val2)
                        + Integer.compareUnsigned(val1, local_b -val2)
                        + Integer.compareUnsigned(local_a, val1 + val2)
                        + Integer.compareUnsigned(local_b, local_b)
                        + Integer.compareUnsigned(val2 + val1, local_b + val2)
                        + Integer.compareUnsigned(val1, i - local_b)
                        + Integer.compareUnsigned(local_a, val1)
                        + Integer.compareUnsigned(val2, local_b)
                        + Integer.compareUnsigned(local_a + val1, local_b)
                        + Integer.compareUnsigned(val1 - local_a, i + local_a)
                        + Integer.compareUnsigned(i + val1, val1)
                        + Integer.compareUnsigned(val2 - local_b, local_b)
                        + Integer.compareUnsigned(val1 + val2, val2)
                        + Integer.compareUnsigned(local_b, val1)
                        + Integer.compareUnsigned(val2, local_b + local_b)
                        + Integer.compareUnsigned(val2 + val1, local_b - val2)
                        + Integer.compareUnsigned(val2 + i, i - val2);
            
            local_a += val1;
            local_b += val2;
        }
        
        a = local_a;
        b = local_b;
        value = local_val;
        
        return numIterations;
    }

}
