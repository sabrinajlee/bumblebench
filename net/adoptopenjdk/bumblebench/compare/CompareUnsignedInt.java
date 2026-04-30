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
        for (long i = 0; i < numIterations; i++) {
            value += Integer.compareUnsigned(a, b);
            a += A_INC;
            b += B_INC;
        }
        return numIterations;
    } 
}
