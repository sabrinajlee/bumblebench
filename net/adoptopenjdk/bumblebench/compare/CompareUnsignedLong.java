package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedLong extends MicroBench {
    private static final long A_DEFAULT = -1;
    private static final long B_DEFAULT = 1;
    private static final long A_VALUE = option("aValue", A_DEFAULT);
    private static final long B_VALUE = option("bValue", B_DEFAULT);

    private static long value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        for (long i = 0; i < numIterations; i++) {
            value += Long.compareUnsigned(A_VALUE, B_VALUE);
        }
        return numIterations;
    }
}
