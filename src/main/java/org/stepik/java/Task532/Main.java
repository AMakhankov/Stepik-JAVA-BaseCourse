package org.stepik.java.Task532;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result = result + scanner.nextDouble();
                } else {
                    scanner.next();
                }
            }
            System.out.printf("%.6f", result);
        }
    }
    
}
