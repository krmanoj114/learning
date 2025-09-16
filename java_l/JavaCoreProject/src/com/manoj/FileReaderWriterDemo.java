package com.manoj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderWriterDemo {
    public static void main(String[] args) {
        Path path = null;
        try {
            path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
            System.out.println(path);
            String s = Files.readString(path);
            System.out.println(s); //This was posted on JD
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
