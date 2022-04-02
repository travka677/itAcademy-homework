package by.itAcademy.homework.les14_regexp;
/*
1. Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
Возможные домены верхнего уровня: .org .com
 */

public class Task1 {
    public static void main(String[] args) {
        String email = "danikkim19@gmail.com";
        String regexp = "[a-zA-Z]\\w*@\\w+(\\.com|\\.org)";

        String message = email.matches(regexp) ? "Is email address" : "Isn't email address";

        System.out.println(message);

    }
}
