package com.currencycloud.sdk.core;

import java.util.Optional;

/**
 * Wrapper for Optional values that tracks whether the field was explicitly set.
 * This allows distinguishing between "not present" and "present but null" for
 * patch semantics.
 */
public final class Patch<T> {

    private final Optional<T> value;
    private final boolean wasSet;

    private Patch(Optional<T> value, boolean wasSet) {
        this.value = value;
        this.wasSet = wasSet;
    }

    public static <T> Patch<T> notSet() {
        return new Patch<>(Optional.empty(), false);
    }

    public static <T> Patch<T> of(T value) {
        return new Patch<>(Optional.ofNullable(value), true);
    }

    public static <T> Patch<T> of(Optional<T> value) {
        return new Patch<>(value, true);
    }

    public Optional<T> getValue() {
        return value;
    }

    public boolean isUndefined() {
        return !wasSet;
    }

    public boolean isNull() {
        return wasSet && value.isEmpty();
    }

    public boolean isDefined() {
        return wasSet && value.isPresent();
    }

    public boolean wasSet() {
        return wasSet;
    }

    public T orElse(T other) {
        return value.orElse(other);
    }
}
