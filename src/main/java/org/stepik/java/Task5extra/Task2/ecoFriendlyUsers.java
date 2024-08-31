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

    private static boolean isEcoFriendly(String lines, int limitConsumption) {

        String[] data = lines.split("\\|");
//        int waterCount = Integer.parseInt(data[2]);
//        int gasCount1 = Integer.parseInt(data[3]);
//        int gasCount2 = Integer.parseInt(data[4]);
//        int electricalCount1 = Integer.parseInt(data[5]);
//        int electricalCount2 = Integer.parseInt(data[6]);

        for (int i = 2; i < data.length; i++) {
            int consumption = Integer.parseInt(data[i]);
            if (consumption > limitConsumption) {
                return false;
            }
        }
        return true;

//        return waterCount <= limitConsumption &&
//                (gasCount1 + gasCount2) <= limitConsumption &&
//                (electricalCount1 + electricalCount2) <= limitConsumption;
    }
}
