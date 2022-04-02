package by.itAcademy.homework.les13_string;
/*
3. Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и
 заканчивается этим словом.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println(checkString("MacBook Air is a good MacBook", "MacBook"));
    }

    public static boolean checkString(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }
}
