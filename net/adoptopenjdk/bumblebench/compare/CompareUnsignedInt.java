package net.adoptopenjdk.bumblebench.compare;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class CompareUnsignedInt extends MicroBench {
    private static volatile int value = 0;

    @Override
    protected long doBatch(long numIterations) throws InterruptedException {
        int local_value = value;

        for (int i = 0; i < numIterations; i++) {
            local_value = local_value + Integer.compareUnsigned(local_value | 0x11111101, local_value | 0x22222202);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x33333303, local_value | 0x44444404);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x55555505, local_value | 0x66666606);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x77777707, local_value | 0x88888808);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x99999909, local_value | 0xAAAAA010);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xBBBBB111, local_value | 0xCCCCC212);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xDDDDD313, local_value | 0xEEEEE414);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xFFFFF515, local_value | 0x11111616);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x22222717, local_value | 0x33333818);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x44444919, local_value | 0x55555020);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x66666121, local_value | 0x77777222);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x88888323, local_value | 0x99999424);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xAAAAA525, local_value | 0xBBBBB626);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xCCCCC727, local_value | 0xDDDDD828);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xEEEEE929, local_value | 0xFFFFF030);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x11111131, local_value | 0x22222232);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x33333333, local_value | 0x44444434);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x55555535, local_value | 0x66666636);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x77777737, local_value | 0x88888838);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x99999939, local_value | 0xAAAAA040);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xBBBBB141, local_value | 0xCCCCC242);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xDDDDD343, local_value | 0xEEEEE444);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xFFFFF545, local_value | 0x11111646);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x22222747, local_value | 0x33333848);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x44444949, local_value | 0x55555050);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x66666151, local_value | 0x77777252);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x88888353, local_value | 0x99999454);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xAAAAA555, local_value | 0xBBBBB656);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xCCCCC757, local_value | 0xDDDDD858);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xEEEEE959, local_value | 0xFFFFF060);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x11111161, local_value | 0x22222262);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x33333363, local_value | 0x44444464);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x55555565, local_value | 0x66666666);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x77777767, local_value | 0x88888868);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x99999969, local_value | 0xAAAAA070);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xBBBBB171, local_value | 0xCCCCC272);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xDDDDD373, local_value | 0xEEEEE474);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xFFFFF575, local_value | 0x11111676);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x22222777, local_value | 0x33333878);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x44444979, local_value | 0x55555080);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x66666181, local_value | 0x77777282);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x88888383, local_value | 0x99999484);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xAAAAA585, local_value | 0xBBBBB686);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xCCCCC787, local_value | 0xDDDDD888);
            local_value = local_value + Integer.compareUnsigned(local_value | 0xEEEEE989, local_value | 0xFFFFF090);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x11111191, local_value | 0x22222292);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x33333393, local_value | 0x44444494);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x55555595, local_value | 0x66666696);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x77777797, local_value | 0x88888898);
            local_value = local_value + Integer.compareUnsigned(local_value | 0x99999999, local_value | 0xAAAAA001);
        }

        value = local_value;

        return numIterations;
    }

}
