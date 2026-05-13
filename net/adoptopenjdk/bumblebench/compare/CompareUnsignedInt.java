package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    private static final int A_DEFAULT = 0x7FFFFFF0;
    private static final int B_DEFAULT = 0x80000010;
    private static final int A_INC = 32;
    private static final int B_INC = -32;
    private static volatile int a = option("a", A_DEFAULT);
    private static volatile int b = option("b", B_DEFAULT);

    private static volatile int value = 0;
    private static volatile int res = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        for (long i = 0; i < numIterations; i++) {
            try {
                res = Integer.compareUnsigned(a, b);
                if (res < -1 || res > 1){
                    throw new Exception("Returned value is not in range [-1,1]");
                }
                value += res;
                a += A_INC;
                b += B_INC;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return numIterations;
    } 

    
}
