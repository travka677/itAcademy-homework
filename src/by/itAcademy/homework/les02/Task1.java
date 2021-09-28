package by.itAcademy.homework.les02;

// 1. Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
//    Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
//    Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
//    Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("word 1 >> ");
        String word1 = sc.next();

        System.out.print("word 2 >> ");
        String word2 = sc.next();

        if (word1.equals(word2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (word1.length() == word2.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        } else {
            System.out.println("Совершенно разные слова");
        }
    }
}
