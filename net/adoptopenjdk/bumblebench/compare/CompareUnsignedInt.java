package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    private static volatile int value = 0;
    private static volatile int b_init = 1;
    private static final int A_INC = 0x9e3779b9; // large odd stride, covers 2^32 uniformly

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        int local_a = value;
        int local_b = b_init;

        for (int i = 0; i < numIterations; i++) {
            local_a += Integer.compareUnsigned(local_a + 0x00000000, local_b + 0x11111111);
            local_a += Integer.compareUnsigned(local_a + 0x22222222, local_b + 0x33333333);
            local_a += Integer.compareUnsigned(local_a + 0x44444444, local_b + 0x55555555);
            local_a += Integer.compareUnsigned(local_a + 0x66666666, local_b + 0x77777777);
            local_a += Integer.compareUnsigned(local_a + 0x88888888, local_b + 0x99999999);
            local_a += Integer.compareUnsigned(local_a + 0xAAAAAAAA, local_b + 0xBBBBBBBB);
            local_a += Integer.compareUnsigned(local_a + 0xCCCCCCCC, local_b + 0xDDDDDDDD);
            local_a += Integer.compareUnsigned(local_a + 0xEEEEEEEE, local_b + 0xFFFFFFFF);
            local_a += Integer.compareUnsigned(local_a + 0x11111110, local_b + 0x22222221);
            local_a += Integer.compareUnsigned(local_a + 0x33333332, local_b + 0x44444443);
            local_a += Integer.compareUnsigned(local_a + 0x55555554, local_b + 0x66666665);
            local_a += Integer.compareUnsigned(local_a + 0x77777776, local_b + 0x88888887);
            local_a += Integer.compareUnsigned(local_a + 0x99999998, local_b + 0xAAAAAAAA);
            local_a += Integer.compareUnsigned(local_a + 0xBBBBBBBA, local_b + 0xCCCCCCCC);
            local_a += Integer.compareUnsigned(local_a + 0xDDDDDDDC, local_b + 0xEEEEEEEE);
            local_a += Integer.compareUnsigned(local_a + 0xFFFFFFFE, local_b + 0x10000000);
            local_a += Integer.compareUnsigned(local_a + 0x12345678, local_b + 0x23456789);
            local_a += Integer.compareUnsigned(local_a + 0x3456789A, local_b + 0x456789AB);
            local_a += Integer.compareUnsigned(local_a + 0x56789ABC, local_b + 0x6789ABCD);
            local_a += Integer.compareUnsigned(local_a + 0x789ABCDE, local_b + 0x89ABCDEF);
            local_a += Integer.compareUnsigned(local_a + 0x9ABCDEF0, local_b + 0xABCDEF01);
            local_a += Integer.compareUnsigned(local_a + 0xBCDEF012, local_b + 0xCDEF0123);
            local_a += Integer.compareUnsigned(local_a + 0xDEF01234, local_b + 0xEF012345);
            local_a += Integer.compareUnsigned(local_a + 0xF0123456, local_b + 0x01234567);
            local_a += Integer.compareUnsigned(local_a + 0x13579BDF, local_b + 0x2468ACE0);
            local_a += Integer.compareUnsigned(local_a + 0x3579BDF1, local_b + 0x468ACE02);
            local_a += Integer.compareUnsigned(local_a + 0x579BDF13, local_b + 0x68ACE024);
            local_a += Integer.compareUnsigned(local_a + 0x79BDF135, local_b + 0x8ACE0246);
            local_a += Integer.compareUnsigned(local_a + 0x9BDF1357, local_b + 0xACE02468);
            local_a += Integer.compareUnsigned(local_a + 0xBDF13579, local_b + 0xCE02468A);
            local_a += Integer.compareUnsigned(local_a + 0xDF13579B, local_b + 0xE02468AC);
            local_a += Integer.compareUnsigned(local_a + 0xF13579BD, local_b + 0x02468ACE);
            local_a += Integer.compareUnsigned(local_a + 0x02468ACF, local_b + 0x13579BE0);
            local_a += Integer.compareUnsigned(local_a + 0x2468ACF1, local_b + 0x3579BE02);
            local_a += Integer.compareUnsigned(local_a + 0x468ACF13, local_b + 0x579BE024);
            local_a += Integer.compareUnsigned(local_a + 0x68ACF135, local_b + 0x79BE0246);
            local_a += Integer.compareUnsigned(local_a + 0x8ACF1357, local_b + 0x9BE02468);
            local_a += Integer.compareUnsigned(local_a + 0xACF13579, local_b + 0xBE02468A);
            local_a += Integer.compareUnsigned(local_a + 0xCF13579B, local_b + 0xE02468AC);
            local_a += Integer.compareUnsigned(local_a + 0xF13579BD, local_b + 0x02468ACF);
            local_a += Integer.compareUnsigned(local_a + 0x19283746, local_b + 0x2A394857);
            local_a += Integer.compareUnsigned(local_a + 0x3B4A5968, local_b + 0x4C5B6A79);
            local_a += Integer.compareUnsigned(local_a + 0x5D6C7B8A, local_b + 0x6E7D8C9B);
            local_a += Integer.compareUnsigned(local_a + 0x7F8E9DAC, local_b + 0x809FAEBF);
            local_a += Integer.compareUnsigned(local_a + 0x91A0BFD0, local_b + 0xA2B1C0E1);
            local_a += Integer.compareUnsigned(local_a + 0xB3C2D1F2, local_b + 0xC4D3E203);
            local_a += Integer.compareUnsigned(local_a + 0xD5E4F314, local_b + 0xE6F50425);
            local_a += Integer.compareUnsigned(local_a + 0xF7061536, local_b + 0x08172647);
            local_a += Integer.compareUnsigned(local_a + 0x19283758, local_b + 0x2A394869);
            local_a += Integer.compareUnsigned(local_a + 0x3B4A597A, local_b + 0x4C5B6A8B);
            local_b += A_INC;
        }

        value = local_a;
        b_init = local_b;

        return numIterations;
    }

}
