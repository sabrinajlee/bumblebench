package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    private static final int A_DEFAULT = -1;
    private static final int B_DEFAULT = 1;
    private static final int A_INC = -5;
    private static final int B_INC = 15;
    private static volatile int a = option("a", A_DEFAULT);
    private static volatile int b = option("b", B_DEFAULT);

    private static volatile int value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        int local_a = a; int local_a_inc = A_INC;
        int local_b = b; int local_b_inc = B_INC;
        int local_val = value;
        for (long i = 0; i < numIterations; i++) {
            local_val += Integer.compareUnsigned(local_a_inc, local_b_inc)
	    + Integer.compareUnsigned(local_a, local_b-1)
                   + Integer.compareUnsigned(local_a, local_b+1)
                   + Integer.compareUnsigned(local_a+1, local_b)
                   + Integer.compareUnsigned(local_a-1, local_b);
            local_a += local_a_inc;
            local_b += local_b_inc;
        }
        a = local_a; b = local_b;
        value = local_val;
        return numIterations;
    }
}
