package org.stepik.java.Task5extra.Task3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class JokeFileVisitor extends SimpleFileVisitor<Path> {

    public String textInFile;

    public JokeFileVisitor(String textInFile) {
        this.textInFile = textInFile;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path folder, BasicFileAttributes attrs) throws IOException {
        try (FileWriter writer = new FileWriter((folder) + "\\joke.java")) {
            writer.write(textInFile);
        }
        return FileVisitResult.CONTINUE;
    }
}
