package org.stepik.java.Task5extra.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader implements Reader{
    private final String filePath;

    public MyFileReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<UserResourcesConsumption> readLines() throws IOException {
        List<UserResourcesConsumption> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                int waterCountDay = Integer.parseInt(data[2]);
                int waterCountNight = Integer.parseInt(data[3]);
                int gasCount = Integer.parseInt(data[4]);
                int electroCountDay = Integer.parseInt(data[5]);
                int electroCountNight = Integer.parseInt(data[6]);

                UserResourcesConsumption resourceConsumption = new UserResourcesConsumption(
                        waterCountDay, waterCountNight, gasCount, electroCountDay, electroCountNight
                );

                result.add(resourceConsumption);
            }
        }
        return result;
    }
}
