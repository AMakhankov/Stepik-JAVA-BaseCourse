package org.stepik.java.Task5extra.Task3;

//Программа, в которую можно было бы ввести путь (абсолютный) до папки,
// программа должна создать по одному файлу с названием "joke.java" с
// кодом программы hello world  в каждой вложенной папке, и в каждой
// папке вложенной во вложенные, пока папки не закончатся (дальше переходить к мамкам)
// ЧЕРЕЗ ВИЗИТОРА

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


public class JokesCreatorV2 {

    public static void main(String[] args) throws IOException {
        String path = "F:\\jokes";
        Path folder = Paths.get(path);
        String text = "Hello World!";

        Files.walkFileTree(folder, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path folder, BasicFileAttributes attrs) throws IOException {
                createJokeFileInAllFolders(folder, text);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    public static void createJokeFileInAllFolders(Path folder, String text) throws IOException {
        Path filePath = folder.resolve("joke.java");
        Files.writeString(filePath, text);
        System.out.println("Created: " + filePath);
    }
}
