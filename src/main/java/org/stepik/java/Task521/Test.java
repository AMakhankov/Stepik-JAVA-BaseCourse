package org.stepik.java.Task521;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) throws IOException {
        byte[] input = {0x33, 0x45, 0x01};
        InputStream inputStream = new ByteArrayInputStream(input);
        System.out.println(checkSumOfStream(inputStream));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        // your implementation here
        int sumBytes = 0;
        int currentByte = inputStream.read();
        while (currentByte != -1) {
            sumBytes = Integer.rotateLeft(sumBytes, 1) ^ currentByte;
            currentByte = inputStream.read();
        }
        return sumBytes;
    }
}
