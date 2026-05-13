package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedLong extends MicroBench {
    // greater
    private static final long A_DEFAULT = 500;
    private static final long B_DEFAULT = 100;
    private static final long A_INC = 30;
    private static final long B_INC = 5;
    // equal
    private static final long C_DEFAULT = 0x7FFFFFF0;
    private static final long D_DEFAULT = 0x7FFFFFF0;
    private static final long C_INC = -32;
    private static final long D_INC = -32;
    // less
    private static final long E_DEFAULT = Long.MIN_VALUE;
    private static final long F_DEFAULT = Long.MIN_VALUE + 1000000;
    private static final long E_INC = 50;
    private static final long F_INC = 500;

    // private static volatile long a = option("a", A_DEFAULT);
    // private static volatile long b = option("b", B_DEFAULT);
    private static volatile long value = 0;
    private static volatile long res = 0;
    
    // Separate evolving state for each case
    private static volatile long a1 = A_DEFAULT;
    private static volatile long a2 = B_DEFAULT;
    private static volatile long c1 = C_DEFAULT;
    private static volatile long c2 = D_DEFAULT;
    private static volatile long e1 = E_DEFAULT;
    private static volatile long e2 = F_DEFAULT;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        for (long i = 0; i < numIterations; i++) {
            long arg1, arg2;
            switch((int) i%3){
                case 0:
                    arg1 = a1;
                    arg2 = a2;
                    res = Long.compareUnsigned(arg1, arg2);
                    a1 += A_INC;
                    a2 += B_INC;
                    break;
                case 1:
                    arg1 = c1;
                    arg2 = c2;
                    res = Long.compareUnsigned(arg1, arg2);
                    c1 += C_INC;
                    c2 += D_INC;
                    break;
                case 2:
                    arg1 = e1;
                    arg2 = e2;
                    res = Long.compareUnsigned(arg1, arg2);
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