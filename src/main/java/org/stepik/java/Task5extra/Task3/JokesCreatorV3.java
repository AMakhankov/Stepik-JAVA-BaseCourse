package org.stepik.java.Task5extra.Task3;

//Программа, в которую можно было бы ввести путь (абсолютный) до папки,
// программа должна создать по одному файлу с названием "joke.java" с
// кодом программы hello world  в каждой вложенной папке, и в каждой
// папке вложенной во вложенные, пока папки не закончатся (дальше переходить к мамкам)
// ЧЕРЕЗ ВИЗИТОРА в отдельном классе

import java.io.IOException;
import java.nio.file.*;

public class JokesCreatorV3 {

    public static void main(String[] args) throws IOException {
        String path = "F:\\jokes";
        Path folder = Paths.get(path);
        String text = "Hello World!";

        createJokeFileInAllFolders(folder, text);
    }

    public static void createJokeFileInAllFolders(Path folder, String text) throws IOException {
        Files.walkFileTree(folder, new JokeFileVisitor(text));
    }
}
