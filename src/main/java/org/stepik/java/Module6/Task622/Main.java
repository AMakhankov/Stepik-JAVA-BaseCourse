package org.stepik.java.Module6.Task622;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String numbers = "5 10 3 4 8 16 15 14 13 10";
        ByteArrayInputStream bais = new ByteArrayInputStream(numbers.getBytes(StandardCharsets.UTF_8));
        System.setIn(bais);

        ArrayList<Integer> listOfOddInt = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int x;
        int element = 0;
        while (scanner.hasNextInt()) {
            x = scanner.nextInt();
            if (element % 2 == 1) {
                listOfOddInt.add(x);
            }
            element++;
        }
        int size = listOfOddInt.size();
        for (int j = size - 1; j >= 0; j--) {
            System.out.print(listOfOddInt.get(j));
            if (j > 0) {
                System.out.print(" ");
            }
        }
    }
}
