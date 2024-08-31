package org.stepik.java.Task522;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        byte[] input = {65, 13, 10, 10, 13};
        InputStream inputStream = new ByteArrayInputStream(input);
        System.setIn(inputStream);

        char charOfBackSlashN = 10;
        char charOfBackSlashR = 13;
        int currentByte = 0;
        int previousByte = System.in.read();
        while (previousByte != -1) {
            currentByte = System.in.read();
            if (previousByte != charOfBackSlashR || currentByte != charOfBackSlashN) {
                System.out.write(previousByte);
            }
            previousByte = currentByte;
        }
        System.out.flush();
    }
}
