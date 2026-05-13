package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    // greater
    private static final int A_DEFAULT = 500;
    private static final int B_DEFAULT = 100;
    private static final int A_INC = 30;
    private static final int B_INC = 5;
    // equal
    private static final int C_DEFAULT = 0x7FFFFFF0;
    private static final int D_DEFAULT = 0x7FFFFFF0;
    private static final int C_INC = -32;
    private static final int D_INC = -32;
    // less
    private static final int E_DEFAULT = Integer.MIN_VALUE;
    private static final int F_DEFAULT = Integer.MIN_VALUE + 1000000;
    private static final int E_INC = 50;
    private static final int F_INC = 500;

    // private static volatile int a = option("a", A_DEFAULT);
    // private static volatile int b = option("b", B_DEFAULT);
    private static volatile int value = 0;
    private static volatile int res = 0;
    
    // Separate evolving state for each case
    private static volatile int a1 = A_DEFAULT;
    private static volatile int a2 = B_DEFAULT;
    private static volatile int c1 = C_DEFAULT;
    private static volatile int c2 = D_DEFAULT;
    private static volatile int e1 = E_DEFAULT;
    private static volatile int e2 = F_DEFAULT;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        for (long i = 0; i < numIterations; i++) {
            int arg1, arg2;
            switch((int) i%3){
                case 0:
                    arg1 = a1;
                    arg2 = a2;
                    res = Integer.compareUnsigned(arg1, arg2);
                    a1 += A_INC;
                    a2 += B_INC;
                    break;
                case 1:
                    arg1 = c1;
                    arg2 = c2;
                    res = Integer.compareUnsigned(arg1, arg2);
                    c1 += C_INC;
                    c2 += D_INC;
                    break;
                case 2:
                    arg1 = e1;
                    arg2 = e2;
                    res = Integer.compareUnsigned(arg1, arg2);
                    e1 += E_INC;
                    e2 += F_INC;
                    break;
                default:
                    res = 0;
                    break;
            }
            value += res;
        }
        return numIterations;
    } 

    
}
