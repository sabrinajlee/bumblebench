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
            int temp = Integer.compareUnsigned(local_a | 0x01, local_b | 0x02);
            temp = temp + Integer.compareUnsigned(local_a | 0x03, local_b | 0x04);
            temp = temp + Integer.compareUnsigned(local_a | 0x05, local_b | 0x06);
            temp = temp + Integer.compareUnsigned(local_a | 0x07, local_b | 0x08);
            temp = temp + Integer.compareUnsigned(local_a | 0x09, local_b | 0x10);
            temp = temp + Integer.compareUnsigned(local_a | 0x11, local_b | 0x12);
            temp = temp + Integer.compareUnsigned(local_a | 0x13, local_b | 0x14);
            temp = temp + Integer.compareUnsigned(local_a | 0x15, local_b | 0x16);
            temp = temp + Integer.compareUnsigned(local_a | 0x17, local_b | 0x18);
            temp = temp + Integer.compareUnsigned(local_a | 0x19, local_b | 0x20);
            temp = temp + Integer.compareUnsigned(local_a | 0x21, local_b | 0x22);
            temp = temp + Integer.compareUnsigned(local_a | 0x23, local_b | 0x24);
            temp = temp + Integer.compareUnsigned(local_a | 0x25, local_b | 0x26);
            temp = temp + Integer.compareUnsigned(local_a | 0x27, local_b | 0x28);
            temp = temp + Integer.compareUnsigned(local_a | 0x29, local_b | 0x30);
            temp = temp + Integer.compareUnsigned(local_a | 0x31, local_b | 0x32);
            temp = temp + Integer.compareUnsigned(local_a | 0x33, local_b | 0x34);
            temp = temp + Integer.compareUnsigned(local_a | 0x35, local_b | 0x36);
            temp = temp + Integer.compareUnsigned(local_a | 0x37, local_b | 0x38);
            temp = temp + Integer.compareUnsigned(local_a | 0x39, local_b | 0x40);
            temp = temp + Integer.compareUnsigned(local_a | 0x41, local_b | 0x42);
            temp = temp + Integer.compareUnsigned(local_a | 0x43, local_a | 0x44);
            temp = temp + Integer.compareUnsigned(local_a | 0x45, local_b | 0x46);
            temp = temp + Integer.compareUnsigned(local_a | 0x47, local_b | 0x48);
            temp = temp + Integer.compareUnsigned(local_a | 0x49, local_b | 0x50);
            temp = temp + Integer.compareUnsigned(local_a | 0x51, local_b | 0x52);
            temp = temp + Integer.compareUnsigned(local_a | 0x53, local_b | 0x54);
            temp = temp + Integer.compareUnsigned(local_a | 0x55, local_b | 0x56);
            temp = temp + Integer.compareUnsigned(local_a | 0x57, local_b | 0x58);
            temp = temp + Integer.compareUnsigned(local_a | 0x59, local_b | 0x60);
            temp = temp + Integer.compareUnsigned(local_a | 0x61, local_b | 0x62);
            temp = temp + Integer.compareUnsigned(local_a | 0x63, local_b | 0x64);
            temp = temp + Integer.compareUnsigned(local_a | 0x65, local_b | 0x66);
            temp = temp + Integer.compareUnsigned(local_a | 0x67, local_b | 0x68);
            temp = temp + Integer.compareUnsigned(local_a | 0x69, local_b | 0x70);
            temp = temp + Integer.compareUnsigned(local_a | 0x71, local_b | 0x72);
            temp = temp + Integer.compareUnsigned(local_a | 0x73, local_b | 0x74);
            temp = temp + Integer.compareUnsigned(local_a | 0x75, local_b | 0x76);
            temp = temp + Integer.compareUnsigned(local_a | 0x77, local_b | 0x78);
            temp = temp + Integer.compareUnsigned(local_a | 0x79, local_b | 0x80);
            temp = temp + Integer.compareUnsigned(local_a | 0x81, local_b | 0x82);
            temp = temp + Integer.compareUnsigned(local_a | 0x83, local_b | 0x84);
            temp = temp + Integer.compareUnsigned(local_a | 0x85, local_b | 0x86);
            temp = temp + Integer.compareUnsigned(local_a | 0x87, local_b | 0x88);
            temp = temp + Integer.compareUnsigned(local_a | 0x89, local_b | 0x90);
            temp = temp + Integer.compareUnsigned(local_a | 0x91, local_b | 0x92);
            temp = temp + Integer.compareUnsigned(local_a | 0x93, local_b | 0x94);
            temp = temp + Integer.compareUnsigned(local_a | 0x95, local_b | 0x96);
            temp = temp + Integer.compareUnsigned(local_a | 0x97, local_b | 0x98);
            temp = temp + Integer.compareUnsigned(local_a | 0x99, local_b | 0x01);
            
            local_a += local_a_inc;
            local_b += local_b_inc;
        }
        
        a = local_a;
        b = local_b;
        //value = temp;
        
        return numIterations;
    }

}
