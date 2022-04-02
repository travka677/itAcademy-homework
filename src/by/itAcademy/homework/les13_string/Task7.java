package by.itAcademy.homework.les13_string;
/*
7. Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями.
Если число выходит за размер 10 символов вернуть все нули.
Пример getString(22) -> 0000000022
Найти 3 способа решения задачи и определить наиболее быстрый способ.
 */

import java.util.Formatter;

public class Task7 {
    private static final int SIZE = 10;
    private static final String formatOutput = "%0" + SIZE + "d";

    public static void main(String[] args) {
        System.out.println(getString1(1111111));
        System.out.println(getString2(234));
        System.out.println(getString3(98722));
    }

    public static String getString1(long number) {
        return numberIsBig(number) ? nullify(number) : String.format(formatOutput, number);
    }

    public static String getString2(long number) {
        if (numberIsBig(number)) {
            return nullify(number);
        } else {
            StringBuilder stringBuilder = new StringBuilder(number + "");
            for (int i = 0; i < SIZE - numberLength(number); i++) {
                stringBuilder.insert(0, '0');
            }
            return stringBuilder.toString();
        }
    }

    public static String getString3(long number) {
        if (numberIsBig(number)) {
            return nullify(number);
        } else {
            Formatter formatter = new Formatter();
            return formatter.format(formatOutput, number).toString();
        }
    }

    public static String nullify(long number) {
        String str = String.valueOf(number);
        return str.replaceAll("\\d", "0");
    }

    public static boolean numberIsBig(long number) {
        return numberLength(number) >= SIZE;
    }

    public static int numberLength(long number) {
        String str = String.valueOf(number);
        return str.length();
    }
}
