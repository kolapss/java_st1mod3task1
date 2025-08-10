package com.kolaps;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String filename = "test.txt";

        try {
            String str = FileEditor.readFromFile(filename);
            FileEditor.writeToFile(filename, "Test01");
        } catch (FileOperationException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}