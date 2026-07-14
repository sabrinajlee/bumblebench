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
        int local_val = value;
        
        for (int i = 0; i < numIterations; i++) {
            local_val += Integer.compareUnsigned(local_a | 0x01, local_a | 0x02)
                       + Integer.compareUnsigned(local_a | 0x03, local_b | 0x04)
                       + Integer.compareUnsigned(local_a | 0x05, i | 0x06)
                       + Integer.compareUnsigned(local_b | 0x07, local_a | 0x08)
                       + Integer.compareUnsigned(local_b | 0x09, local_b | 0x10);
            local_val += Integer.compareUnsigned(local_b | 0x11, i | 0x12)
                       + Integer.compareUnsigned(i | 0x13, local_a | 0x14)
                       + Integer.compareUnsigned(i | 0x15, local_b | 0x16)
                       + Integer.compareUnsigned(i | 0x17, i | 0x18)
                       + Integer.compareUnsigned(local_a | 0x19, local_a | 0x20);
            local_val += Integer.compareUnsigned(local_a | 0x21, local_b | 0x22)
                       + Integer.compareUnsigned(local_a | 0x23, i | 0x24)
                       + Integer.compareUnsigned(local_b | 0x25, local_a | 0x26)
                       + Integer.compareUnsigned(local_b | 0x27, local_b | 0x28)
                       + Integer.compareUnsigned(local_b | 0x29, i | 0x30);
            local_val += Integer.compareUnsigned(i | 0x31, local_a | 0x32)
                       + Integer.compareUnsigned(i | 0x33, local_b | 0x34)
                       + Integer.compareUnsigned(i | 0x35, i | 0x36)
                       + Integer.compareUnsigned(local_a | 0x37, local_a | 0x38)
                       + Integer.compareUnsigned(local_a | 0x39, local_b | 0x40);
            local_val += Integer.compareUnsigned(local_a | 0x41, i | 0x42)
                       + Integer.compareUnsigned(local_b | 0x43, local_a | 0x44)
                       + Integer.compareUnsigned(local_b | 0x45, local_b | 0x46)
                       + Integer.compareUnsigned(local_b | 0x47, i | 0x48)
                       + Integer.compareUnsigned(i | 0x49, local_a | 0x50);
            local_val += Integer.compareUnsigned(i | 0x51, local_b | 0x52)
                       + Integer.compareUnsigned(i | 0x53, i | 0x54)
                       + Integer.compareUnsigned(local_a | 0x55, local_a | 0x56)
                       + Integer.compareUnsigned(local_a | 0x57, local_b | 0x58)
                       + Integer.compareUnsigned(local_a | 0x59, i | 0x60);
            local_val += Integer.compareUnsigned(local_b | 0x61, local_a | 0x62)
                       + Integer.compareUnsigned(local_b | 0x63, local_b | 0x64)
                       + Integer.compareUnsigned(local_b | 0x65, i | 0x66)
                       + Integer.compareUnsigned(i | 0x67, local_a | 0x68)
                       + Integer.compareUnsigned(i | 0x69, local_b | 0x70);
            local_val += Integer.compareUnsigned(i | 0x71, i | 0x72)
                       + Integer.compareUnsigned(local_a | 0x73, local_a | 0x74)
                       + Integer.compareUnsigned(local_a | 0x75, local_b | 0x76)
                       + Integer.compareUnsigned(local_a | 0x77, i | 0x78)
                       + Integer.compareUnsigned(local_b | 0x79, local_a | 0x80);
            local_val += Integer.compareUnsigned(local_b | 0x81, local_b | 0x82)
                       + Integer.compareUnsigned(local_b | 0x83, i | 0x84)
                       + Integer.compareUnsigned(i | 0x85, local_a | 0x86)
                       + Integer.compareUnsigned(i | 0x87, local_b | 0x88)
                       + Integer.compareUnsigned(i | 0x89, i | 0x90);
            local_val += Integer.compareUnsigned(local_a | 0x91, local_a | 0x92)
                       + Integer.compareUnsigned(local_a | 0x93, local_b | 0x94)
                       + Integer.compareUnsigned(local_a | 0x95, i | 0x96)
                       + Integer.compareUnsigned(local_b | 0x97, local_a | 0x98)
                       + Integer.compareUnsigned(local_b | 0x99, local_b | 0x01);
            
            local_a += local_a_inc;
            local_b += local_b_inc;
        }
        
        a = local_a;
        b = local_b;
        value = local_val;
        
        return numIterations;
    }

}
