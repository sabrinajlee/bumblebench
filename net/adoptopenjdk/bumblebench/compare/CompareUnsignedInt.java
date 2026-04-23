package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    private static final int A_DEFAULT = -1;
    private static final int B_DEFAULT = 1;
    private static final int A_VALUE = option("aValue", A_DEFAULT);
    private static final int B_VALUE = option("bValue", B_DEFAULT);

    private static int value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        for (long i = 0; i < numIterations; i++) {
            value += Integer.compareUnsigned(A_VALUE, B_VALUE);
        }
        return numIterations;
    } 
}