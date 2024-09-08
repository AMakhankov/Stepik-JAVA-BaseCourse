package org.stepik.java.Module6.Task6Extra;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


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

//    public Long getId() {
//        return id;
//    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public Integer getHours() {
        return hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public static String reportHistory(List<Report> reports, String studentUserName, int count) {
        String result = (reports.stream()
                .filter(r -> r.studentUserName.contains(studentUserName))
                .sorted(Comparator.comparing(Report::getDate).reversed())
                .limit(count)
                .sorted(Comparator.comparing(Report::getDate))
                .map(r -> r.getStudentUserName() + "\n" +
                        r.getDate() + "\n" +
                        r.getHours() + "\n" +
                        r.getTitle() + "\n")
                .collect(Collectors.joining("-----------------\n"))
        );
        return result;
    }

//    @Override
//    public String toString() {
//        return studentUserName + "/n" +
//                date + "/n" +
//                hours + "/n" +
//                title + "/n" +
//                "-----------------\n";
//    }
}

