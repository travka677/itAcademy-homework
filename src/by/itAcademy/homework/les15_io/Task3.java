package by.itAcademy.homework.les15_io;
/*
3. Задан файл с текстом, найти и вывести в консоль все слова,
для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        File file = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "Text.txt");

        printWords(getWordsFromFile(file));
    }

    public static List<String> getWordsFromFile(File file) {
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String str;

            while ((str = br.readLine()) != null) {
                String[] splitted = str.split("\\W+");
                words.addAll(Arrays.asList(splitted));
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }

        return words;

    }

    public static void printWords(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            String word1 = list.get(i).toLowerCase(Locale.ROOT);
            String word2 = list.get(i+1).toLowerCase(Locale.ROOT);

            if (word1.length() > 0 && word2.length() > 0) {
                if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
                    System.out.println(list.get(i) + " " + list.get(i+1));
                }
            }

        }
    }
}
