package org.stepik.java.Module6.Task643;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        final int LIMIT = 10;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.lines()
                .flatMap(currentLine -> Arrays.stream(currentLine.toLowerCase()
                        .split("[^a-zA-Zа-яА-Я0-9']+")))
                .collect(Collectors.groupingBy(line -> line, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey))
                .limit(LIMIT)
                .forEach(r -> System.out.println(r.getKey()));
    }
}