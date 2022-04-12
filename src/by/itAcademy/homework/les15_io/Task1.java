package by.itAcademy.homework.les15_io;

// 1. Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) {
        File file = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "SongList.txt");

        try (BufferedReader bf = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))){
            String s;
            while ((s = bf.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
