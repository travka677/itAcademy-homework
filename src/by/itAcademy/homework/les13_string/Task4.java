package by.itAcademy.homework.les13_string;
/*
4. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
   в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка
   должна быть в верхнем.
 */

import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        try {
            String initials = createInitials("Ким", "даниил", "евгеньевич");
            System.out.println(initials);
        } catch (NullPointerException ex) {
            System.err.println("Name cannot be null");
        }
    }

    public static String createInitials(String secondName, String firstName, String lastName) {
        if (secondName == null || firstName == null && lastName == null) {
            throw new NullPointerException();
        }

        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.
                append(secondName.toUpperCase(Locale.ROOT).charAt(0)).
                append(".").
                append(firstName.toUpperCase(Locale.ROOT).charAt(0)).
                append(".").
                append(lastName.toUpperCase(Locale.ROOT).charAt(0)).
                toString();
    }
}
