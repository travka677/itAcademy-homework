package by.itAcademy.homework.task10_collection;

// 6.	Имеется текст. Следует составить для него частотный словарь.

import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        String text = "  The modern English alphabet is a Latin alphabet consisting of 26 letters, each having an upper- and lower-case form. " +
                "It originated around the 7th century from Latin script. " +
                "Since then, letters have been added or removed to give the current Modern English alphabet of 26 letters. " +
                "The word alphabet is a compound of the first two letters of the Greek alphabet, alpha and beta.  ";

        text = text.trim();

        String[] words = text.split("\\W+");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> dictionary = new TreeMap<>();

        int count = 0;

        for (String s : words) {
            for (String word : words) {
                if (s.equals(word)) {
                    count++;
                }
            }
            dictionary.put(s, count);
            count = 0;
        }

        System.out.println(dictionary);
    }
}
