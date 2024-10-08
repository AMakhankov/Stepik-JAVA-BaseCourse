package org.stepik.java.Task411;

public class Test {

    public static void main(String[] args) {

        System.out.println(sqrt(121));
        System.out.println(sqrt(-121));

    }

    public static double sqrt(double x){
        if (x < 0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }

}
