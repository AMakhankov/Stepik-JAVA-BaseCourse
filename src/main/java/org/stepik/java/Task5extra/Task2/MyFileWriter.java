package org.stepik.java.Task5extra.Task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFileWriter implements Writer {
    private final String filePath;

    public MyFileWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void writeLines(List<UserResourcesConsumption> users) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("waterCountDay|waterCountNight|gasCount|electroCountDay|electroCountNight\n");
            for (UserResourcesConsumption user : users) {
                writer.write(user.toNormalFormat() + "\n");
            }
        }
    }
}