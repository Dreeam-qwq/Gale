package org.galemc.gale.util.function;

import java.util.function.BooleanSupplier;

public final class MemoizedBooleanSupplier implements BooleanSupplier {

    private final BooleanSupplier internal;
    private int value;

    public MemoizedBooleanSupplier(BooleanSupplier internal) {
        this.internal = internal;
    }

    @Override
    public boolean getAsBoolean() {
        int value = this.value;
        if (value != 0) {
            // Already determined
            return value > 0;
        }
        // Undetermined
        boolean result = this.internal.getAsBoolean();
        this.value = result ? 1 : -1;
        return result;
    }

}
