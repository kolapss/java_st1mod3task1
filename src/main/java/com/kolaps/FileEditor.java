package com.kolaps;

import java.io.*;

public class FileEditor {

    public static void writeToFile(String fileName, String data) throws FileOperationException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            throw new FileOperationException("Ошибка при записи в файл: " + fileName, e);
        }
    }

    public static String readFromFile(String fileName) throws FileOperationException {
        StringBuilder str = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                str.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new FileOperationException("Ошибка при чтении файла: " + fileName, e);
        }
        return str.toString();
    }
}
