package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    private static volatile int a = option("a", -1);
    private static volatile int b = option("b", 1);
    private static final int A_INC = -5;
    private static final int B_INC = 15;
    private static volatile int value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        int local_a = a; int local_a_inc = A_INC;
        int local_b = b; int local_b_inc = B_INC;
        
        for (int i = 0; i < numIterations; i++) {
            int local_val = Integer.compareUnsigned(local_a | 0x01, local_a | 0x02);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x03, local_b | 0x04);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x05, i | 0x06);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x07, local_a | 0x08);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x09, local_b | 0x10);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x11, i | 0x12);
                local_val = local_val + Integer.compareUnsigned(i | 0x13, local_a | 0x14);
                local_val = local_val + Integer.compareUnsigned(i | 0x15, local_b | 0x16);
                local_val = local_val + Integer.compareUnsigned(i | 0x17, i | 0x18);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x19, local_a | 0x20);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x21, local_b | 0x22);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x23, i | 0x24);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x25, local_a | 0x26);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x27, local_b | 0x28);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x29, i | 0x30);
                local_val = local_val + Integer.compareUnsigned(i | 0x31, local_a | 0x32);
                local_val = local_val + Integer.compareUnsigned(i | 0x33, local_b | 0x34);
                local_val = local_val + Integer.compareUnsigned(i | 0x35, i | 0x36);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x37, local_a | 0x38);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x39, local_b | 0x40);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x41, i | 0x42);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x43, local_a | 0x44);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x45, local_b | 0x46);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x47, i | 0x48);
                local_val = local_val + Integer.compareUnsigned(i | 0x49, local_a | 0x50);
                local_val = local_val + Integer.compareUnsigned(i | 0x51, local_b | 0x52);
                local_val = local_val + Integer.compareUnsigned(i | 0x53, i | 0x54);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x55, local_a | 0x56);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x57, local_b | 0x58);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x59, i | 0x60);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x61, local_a | 0x62);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x63, local_b | 0x64);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x65, i | 0x66);
                local_val = local_val + Integer.compareUnsigned(i | 0x67, local_a | 0x68);
                local_val = local_val + Integer.compareUnsigned(i | 0x69, local_b | 0x70);
                local_val = local_val + Integer.compareUnsigned(i | 0x71, i | 0x72);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x73, local_a | 0x74);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x75, local_b | 0x76);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x77, i | 0x78);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x79, local_a | 0x80);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x81, local_b | 0x82);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x83, i | 0x84);
                local_val = local_val +  Integer.compareUnsigned(i | 0x85, local_a | 0x86);
                local_val = local_val + Integer.compareUnsigned(i | 0x87, local_b | 0x88);
                local_val = local_val + Integer.compareUnsigned(i | 0x89, i | 0x90);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x91, local_a | 0x92);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x93, local_b | 0x94);
                local_val = local_val + Integer.compareUnsigned(local_a | 0x95, i | 0x96);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x97, local_a | 0x98);
                local_val = local_val + Integer.compareUnsigned(local_b | 0x99, local_b | 0x01);
            
            local_a += local_a_inc;
            local_b += local_b_inc;
        }
        
        a = local_a;
        b = local_b;
        //value = local_val;
        
        return numIterations;
    }

}
