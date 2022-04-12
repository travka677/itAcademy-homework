package by.itAcademy.homework.les15_io;

// 2. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        File file = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "Text.txt");

        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String str;

            while ((str = br.readLine()) != null) {
                String[] splitted = str.split("\\W+");
                for (String word : splitted) {
                    if (word.toLowerCase(Locale.ROOT).matches("([aeiouy])\\w*")) {
                        words.add(word);
                    }
                }
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }

        System.out.println(words);
    }
}
