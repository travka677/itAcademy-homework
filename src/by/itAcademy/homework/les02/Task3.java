package by.itAcademy.homework.les02;

// 3. Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
// Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
// то этот год не високосный, за исключением годов, делящихся на 400.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        do {
            System.out.println("Please, enter a decimal number");
            System.out.print("year >> ");
            while (!sc.hasNextInt()) {
                System.out.println("Please, enter a decimal number");
                System.out.print("year >> ");
                sc.next();
            }
            year = sc.nextInt();

        } while (year <= 0);

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }
}
