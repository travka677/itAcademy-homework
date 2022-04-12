package by.itAcademy.homework.les15_io;
/*
Задан файл с java-кодом.
Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
 */

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task7 {
    public static void main(String[] args) {
        File file1 = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "Java practice" + File.separator + "File1.txt");
        File file2 = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "Java practice" + File.separator + "File2.txt");

        reverseWriter(file1, file2);
    }

    public static void reverseWriter(File file1, File file2) {
        try (BufferedReader br = new BufferedReader(new FileReader(file1, StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file2, StandardCharsets.UTF_8, false))) {

            String str;

            while ((str = br.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(str);
                bw.write(stringBuilder.reverse().toString());
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
