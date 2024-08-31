package org.stepik.java.Task5extra.Task2;

//Написать программу которая на вход принимает путь до файлика
// формата data.csv и число максимального потребления
//Программа должна в новый файлик рядом с входным вывести
// информацию о всех экологичных пользователях
//Экологичным считается тот кто КАЖДЫЙ природный ресурс
// потребляет меньше изначально заданного числа

import java.io.*;

public class ecoFriendlyUsers {

    public static void main(String[] args) {
        final int LIMIT_CONSUMPTION = 300;
        String filePath = "F:\\data.csv";
        String pathToCreate = "F:\\result.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            FileWriter writer = new FileWriter(pathToCreate);
            reader.readLine();
            writer.write("id|name|waterCountDay|waterCountNight|gasCount|electroCountDay|electroCountNight" + "\n");

            String line;

            while ((line = reader.readLine()) != null) {
                if (isEcoFriendly(line, LIMIT_CONSUMPTION)) {
                    writer.write(line + "\n");
                }
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isEcoFriendly(String line, int limitConsumption) {
        String[] data = line.split("\\|");
        UserResources consumption = new UserResources(
                Integer.parseInt(data[2]),
                Integer.parseInt(data[3]),
                Integer.parseInt(data[4]),
                Integer.parseInt(data[5]),
                Integer.parseInt(data[6])
        );
        return consumption.isEcoFriendly(limitConsumption);
    }
}
