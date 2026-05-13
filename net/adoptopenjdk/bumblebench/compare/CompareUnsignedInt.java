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
    private static volatile int arg1;
    private static volatile int arg2;
    private static volatile int inc1;
    private static volatile int inc2;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        for (long i = 0; i < numIterations; i++) {
            switch((int) i%3){
                case 0:
                    arg1 = A_DEFAULT;
                    arg2 = B_DEFAULT;
                    inc1 = A_INC;
                    inc2 = B_INC;
                case 1:
                    arg1 = C_DEFAULT;
                    arg2 = D_DEFAULT;
                    inc1 = C_INC;
                    inc2 = D_INC;
                case 2:
                    arg1 = E_DEFAULT;
                    arg2 = F_DEFAULT;
                    inc1 = E_INC;
                    inc2 = F_INC;
                default:
            }
            try {
                res = Integer.compareUnsigned(arg1, arg2);
                if (res < -1 || res > 1){
                    throw new Exception("Returned value is not in range [-1,1]");
                }
                value += res;
                arg1 += inc1;
                arg1 += inc2;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return numIterations;
    } 

    
}
