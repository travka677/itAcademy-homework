package by.itAcademy.homework.les02;

// 4*. Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
//      Программа должна определять, является ли введённая дата реальной и выводить результат.
//   Использовать следующую информацию:
//      Январь, март, май, июль, август, октябрь, декабрь - 31 день
//      Апрель, июнь, сентябрь, ноябрь - 30 дней
//      Февраль - 28 дней в обычный год, 29 дней в високосный

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        day = enterFromConsole("day >> ");
        month = enterFromConsole("month >> ");
        year = enterFromConsole("year >> ");

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day <= 31) {
                    System.out.println("Correct date");
                } else {
                    System.out.println("Incorrect date");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day <= 30) {
                    System.out.println("Correct date");
                } else {
                    System.out.println("Incorrect date");
                }
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    if (day <= 29) {
                        System.out.println("Correct date");
                    } else {
                        System.out.println("Incorrect date");
                    }
                } else {
                    if (day <= 28) {
                        System.out.println("Correct date");
                    } else {
                        System.out.println("Incorrect date");
                    }
                }
        }
    }

    public static int enterFromConsole(String message) {
        Scanner sc = new Scanner(System.in);
        int value;

        do {
            System.out.print(message);
            while (!sc.hasNextInt()) {
                System.out.println("Incorrect date. Please, enter a decimal number");
                System.out.println(message);
                sc.next();
            }
            value = sc.nextInt();
        } while (value <= 0);

        return  value;
    }
}
