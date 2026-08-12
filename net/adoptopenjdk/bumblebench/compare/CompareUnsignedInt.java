package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    private static volatile int a = option("a", 1000003);
    private static volatile int b = option("b", 1000003);
    private static final int A_INC = 1000003;
    private static final int B_INC = 999983;
    private static volatile int value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        int local_a = a; int local_a_inc = A_INC;
        int local_b = b; int local_b_inc = B_INC;
        int local_value = value;

        for (int i = 0; i < numIterations; i++) {
            local_value = local_value + Integer.compareUnsigned(local_a | 0x01, (local_b + local_value) | 0x02);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x03, local_b | 0x04);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x05, (local_b + local_value) | 0x06);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x07, local_b | 0x08);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x09, (local_b + local_value) | 0x10);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x11, local_b | 0x12);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x13, (local_b + local_value) | 0x14);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x15, local_b | 0x16);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x17, (local_b + local_value) | 0x18);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x19, local_b | 0x20);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x21, (local_b + local_value) | 0x22);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x23, local_b | 0x24);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x25, (local_b + local_value) | 0x26);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x27, local_b | 0x28);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x29, (local_b + local_value) | 0x30);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x31, local_b | 0x32);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x33, (local_b + local_value) | 0x34);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x35, local_b | 0x36);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x37, (local_b + local_value) | 0x38);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x39, local_b | 0x40);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x41, (local_b + local_value) | 0x42);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x43, local_b | 0x44);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x45, (local_b + local_value) | 0x46);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x47, local_b | 0x48);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x49, (local_b + local_value) | 0x50);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x51, local_b | 0x52);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x53, (local_b + local_value) | 0x54);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x55, local_b | 0x56);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x57, (local_b + local_value) | 0x58);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x59, local_b | 0x60);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x61, (local_b + local_value) | 0x62);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x63, local_b | 0x64);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x65, (local_b + local_value) | 0x66);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x67, local_b | 0x68);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x69, (local_b + local_value) | 0x70);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x71, local_b | 0x72);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x73, (local_b + local_value) | 0x74);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x75, local_b | 0x76);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x77, (local_b + local_value) | 0x78);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x79, local_b | 0x80);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x81, (local_b + local_value) | 0x82);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x83, local_b | 0x84);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x85, (local_b + local_value) | 0x86);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x87, local_b | 0x88);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x89, (local_b + local_value) | 0x90);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x91, local_b | 0x92);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x93, (local_b + local_value) | 0x94);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x95, local_b | 0x96);
            local_value = local_value + Integer.compareUnsigned(local_a | 0x97, (local_b + local_value) | 0x98);
            local_value = local_value + Integer.compareUnsigned((local_a + local_value) | 0x99, local_b | 0x01);
            

            local_a += local_a_inc;
            local_b += local_b_inc;
        }

        a = local_a;
        b = local_b;
        value = local_value;

        return numIterations;
    }

}
