package org.stepik.java.Task5extra.Task2;

//Написать программу которая на вход принимает путь до файлика
// формата data.csv и число максимального потребления
//Программа должна в новый файлик рядом с входным вывести
// информацию о всех экологичных пользователях
//Экологичным считается тот кто КАЖДЫЙ природный ресурс
// потребляет меньше изначально заданного числа

import java.io.*;
import java.util.List;

public class ecoFriendlyUsers {

    public static void main(String[] args) {
        final int LIMIT_CONSUMPTION = 300;
        String filePath = "F:\\data.csv";
        String pathToCreate = "F:\\result.csv";

        Reader dataReader = new MyFileReader(filePath);

        try {
            List<ResourceConsumption> ecoFriendlyUsers = dataReader.readLines(LIMIT_CONSUMPTION);
            try (FileWriter writer = new FileWriter(pathToCreate)) {
                writer.write("id|name|waterCountDay|waterCountNight|gasCount|electroCountDay|electroCountNight\n");
                for (ResourceConsumption user : ecoFriendlyUsers) {
                    writer.write(user.toString() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
