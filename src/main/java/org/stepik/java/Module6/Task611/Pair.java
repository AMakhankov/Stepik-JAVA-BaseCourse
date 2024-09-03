package org.stepik.java.Module6.Task611;

import java.util.Objects;

class Pair<T, U> {

    T first;
    U second;

    public Pair(T firstParameter, U secondParameter) {
        this.first = firstParameter;
        this.second = secondParameter;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
