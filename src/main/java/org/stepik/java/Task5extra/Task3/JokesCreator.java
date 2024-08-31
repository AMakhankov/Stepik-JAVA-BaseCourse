package org.stepik.java.Task5extra.Task3;

//Программа, в которую можно было бы ввести путь (абсолютный) до папки,
// программа должна создать по одному файлу с названием "joke.java" с
// кодом программы hello world  в каждой вложенной папке, и в каждой
// папке вложенной во вложенные, пока папки не закончатся (дальше переходить к мамкам)

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class JokesCreator {

    public static void main(String[] args) throws IOException {
        String path = "F:\\jokes";
        Path folder = Paths.get(path);
        String text = "Hello World!";

        createJokeFileInAllFolders(folder, text);
    }

    //вынести в отдельный метод создание файла

    public static void createJokeFile(Path path, String text) throws IOException {

        File jokeFile = new File(path.toFile(), "joke.java");
        try (FileWriter writer = new FileWriter(jokeFile)) {
            writer.write(text);
        }
    }

    public static void createJokeFileInAllFolders(Path path, String text) throws IOException {

        File currentFolder = path.toFile();
        File[] folders = currentFolder.listFiles();

        if (folders == null) return;

        createJokeFile(path, text);

        for (File folder : folders) {
            if (folder.isDirectory()) {
                createJokeFileInAllFolders(folder.toPath(), text);
            }
        }
    }
}
