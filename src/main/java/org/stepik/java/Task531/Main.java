package org.stepik.java.Task531;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(inByte, StandardCharsets.US_ASCII));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation here
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        int nextByte = inputStreamReader.read();
        while (nextByte != - 1) {
            sb.append((char) nextByte);
            nextByte = inputStreamReader.read();
        }
        return sb.toString();
    }

}
