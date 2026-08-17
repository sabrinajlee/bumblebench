package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    // 16 values evenly spaced across the full unsigned int range.
    // Power-of-2 length so (i + k) & 15 is a single AND, no division.
    private static final int[] VALUES = {
        0x00000000, 0x11111111, 0x22222222, 0x33333333,
        0x44444444, 0x55555555, 0x66666666, 0x77777777,
        0x88888888, 0x99999999, 0xAAAAAAAA, 0xBBBBBBBB,
        0xCCCCCCCC, 0xDDDDDDDD, 0xEEEEEEEE, 0xFFFFFFFF
    };

    private static volatile int value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        final int[] vals = VALUES;
        int local_a = value;

        for (int i = 0; i < numIterations; i++) {
            local_a += Integer.compareUnsigned(local_a, vals[ i        & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  1)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  2)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  3)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  4)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  5)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  6)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  7)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  8)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  9)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 10)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 11)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 12)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 13)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 14)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 15)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[ i        & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  1)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  2)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  3)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  4)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  5)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  6)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  7)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  8)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  9)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 10)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 11)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 12)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 13)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 14)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 15)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[ i        & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  1)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  2)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  3)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  4)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  5)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  6)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  7)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  8)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  9)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 10)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 11)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 12)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 13)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 14)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i + 15)  & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[ i        & 15]);
            local_a += Integer.compareUnsigned(local_a, vals[(i +  1)  & 15]);
        }

        value = local_a;
        return numIterations;
    }

}
