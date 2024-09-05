package org.stepik.java.Module6.Task6Extra;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/*
задача: написать метод reportHistory(List<Report> reports, String studentUserName, int count)
reports - содержит отчеты всех учеников за все время
count - ограничение по количеству
Метод должен возвращать строку с информацией о последних count отчетов в хронологическом порядке
Строку отформатировать по примеру
*/

public class Report {

    private Long id;

    private String studentUserName;

    private Integer hours;

    private LocalDate date;

    private String title;

    public Report(Long id, String studentUserName, Integer hours, LocalDate date, String title) {
        this.id = id;
        this.studentUserName = studentUserName;
        this.hours = hours;
        this.date = date;
        this.title = title;
    }

    public static String reportHistory(List<Report> reports, String studentUserName, int count) {
        return reports.stream()
                .filter(r -> r.studentUserName.contains(studentUserName))
                .sorted(Comparator.comparing(e -> e.date))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream();
                        }
                ))
                .limit(count)
                .sorted(Comparator.comparing(r -> r.date))
                .map(Object::toString).collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() {
        return studentUserName + "\n" +
                date + "\n" +
                hours + "\n" +
                title + "\n" +
                "-----------------";
    }
}