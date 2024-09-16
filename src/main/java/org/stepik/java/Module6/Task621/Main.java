package org.stepik.java.Module6.Task621;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(0);
        num2.add(1);
        num2.add(2);

        Set<Integer> result = symmetricDifference(num1, num2);
        System.out.println(result);

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> result = new HashSet<>();

        set1.forEach(e -> {
            if (!set2.contains(e)) {
                result.add(e);
            }
        });

        set2.forEach(e -> {
            if (!set1.contains(e)) {
                result.add(e);
            }
        });

        return result;
    }
}
