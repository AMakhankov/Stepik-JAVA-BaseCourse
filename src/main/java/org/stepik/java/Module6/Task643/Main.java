package org.stepik.java.Module6.Task643;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        final int LIMIT = 10;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> StreamOfLines = bufferedReader.lines(); //return and go ne pisat svoy comporator
        HashMap<String, Integer> resultMap = new HashMap<>();

        StreamOfLines.flatMap(currentLine -> Arrays.stream(currentLine.toLowerCase().split("[^a-zA-Zа-яА-Я0-9']+"))) //mojno bilo suda zalojit logiku filtracii ("")
                .filter(currentLine -> !currentLine.isBlank())
                .forEach(currentLine -> resultMap.put(currentLine, resultMap.getOrDefault(currentLine, 0) + 1));

        resultMap.entrySet()
                .stream()
                .sorted((r1, r2) -> {
                    if (r1.getValue() == r2.getValue()) {
                        return r1.getKey().compareTo(r2.getKey());
                    }
                    return r2.getValue() - r1.getValue();
                })
                .limit(LIMIT)
                .forEach(r -> System.out.println(r.getKey()));
    }
}