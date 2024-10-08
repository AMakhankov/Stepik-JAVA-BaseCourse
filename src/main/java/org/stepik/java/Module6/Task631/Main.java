package org.stepik.java.Module6.Task631;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}

