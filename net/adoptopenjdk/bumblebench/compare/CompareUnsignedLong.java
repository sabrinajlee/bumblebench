package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedLong extends MicroBench {
    // 16 values evenly spaced across the full unsigned long range.
    // Power-of-2 length so (i + k) & 0x0F is a single AND, no division.
    private static final long[] VALUES = {
        0x0000000000000000L, 0x1111111111111111L, 0x2222222222222222L, 0x3333333333333333L,
        0x4444444444444444L, 0x5555555555555555L, 0x6666666666666666L, 0x7777777777777777L,
        0x8888888888888888L, 0x9999999999999999L, 0xAAAAAAAAAAAAAAAAL, 0xBBBBBBBBBBBBBBBBL,
        0xCCCCCCCCCCCCCCCCL, 0xDDDDDDDDDDDDDDDDL, 0xEEEEEEEEEEEEEEEEL, 0xFFFFFFFFFFFFFFFFL
    };

    private static volatile int value = 0;
    private static volatile long a = 0xFFFFFFFFFFFFFFFFL;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        final long[] vals = VALUES;
        int local_val = value;
        long local_a = a;

        for (int i = 0; i < numIterations; i++) {
            int temp = 0;
            temp += Long.compareUnsigned(local_a, vals[ i        & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  1)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  2)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  3)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  4)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  5)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  6)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  7)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  8)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  9)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 10)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 11)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 12)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 13)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 14)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 15)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[ i        & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  1)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  2)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  3)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  4)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  5)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  6)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  7)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  8)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  9)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 10)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 11)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 12)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 13)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 14)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 15)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[ i        & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  1)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  2)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  3)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  4)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  5)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  6)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  7)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  8)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i +  9)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 10)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 11)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 12)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 13)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 14)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[(i + 15)  & 0x0F]);
            temp += Long.compareUnsigned(local_a, vals[ i        & 0x0F]);
            local_val += temp;
            local_a += 0x9e3779b97f4a7c15L;
        }

        value = local_val;
        return numIterations;
    }

}