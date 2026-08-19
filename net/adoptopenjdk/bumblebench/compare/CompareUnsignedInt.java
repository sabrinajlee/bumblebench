package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    // 16 values evenly spaced across the full unsigned int range.
    // Power-of-2 length so (i + k) & 0x0F is a single AND, no division.
    private static final int[] VALUES = {
        0x00000000, 0x55555555, 0xAAAAAAAA, 0xFFFFFFFF
    };

    private static volatile int value = 0;
    private static volatile int a = 0xFFFFFFFF;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        final int[] vals = VALUES;
        int local_val = value;
        int local_a = a;

        for (int i = 0; i < numIterations; i++) {
            int temp = 0;
            temp += Integer.compareUnsigned(local_a, vals[ i        & 0x03]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  1)  & 0x03]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  2)  & 0x03]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  3)  & 0x03]);
            local_val += temp;
            local_a += 0x9e3779b9;
        }

        value = local_val;
        return numIterations;
    }

}
