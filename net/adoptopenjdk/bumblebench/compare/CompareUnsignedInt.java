package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    // 16 values evenly spaced across the full unsigned int range.
    // Power-of-2 length so (i + k) & 0x0F is a single AND, no division.
    private static final int[] VALUES = {
        0x00000000, 0x11111111, 0x22222222, 0x33333333,
        0x44444444, 0x55555555, 0x66666666, 0x77777777,
        0x88888888, 0x99999999, 0xAAAAAAAA, 0xBBBBBBBB,
        0xCCCCCCCC, 0xDDDDDDDD, 0xEEEEEEEE, 0xFFFFFFFF
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
            temp += Integer.compareUnsigned(local_a, vals[ i        & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  1)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  2)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  3)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  4)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  5)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  6)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  7)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  8)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  9)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 10)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 11)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 12)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 13)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 14)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 15)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[ i        & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  1)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  2)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  3)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  4)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  5)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  6)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  7)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  8)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  9)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 10)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 11)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 12)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 13)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 14)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 15)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[ i        & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  1)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  2)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  3)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  4)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  5)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  6)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  7)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  8)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i +  9)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 10)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 11)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 12)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 13)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 14)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[(i + 15)  & 0x0F]);
            temp += Integer.compareUnsigned(local_a, vals[ i        & 0x0F]);
            local_val += temp;
            local_a += 0x9e3779b9;
        }

        value = local_val;
        return numIterations;
    }

}
