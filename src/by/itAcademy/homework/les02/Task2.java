package by.itAcademy.homework.les02;

// 2. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
//    Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("sum >> ");
        // время работы цикла зависит от количества данных в потоке
        while (!sc.hasNextInt()) {
            // читаем из потока и достаем
            sc.next();
            System.out.print("sum >> ");
        }
        int sum = sc.nextInt();

        switch (sum % 10) {
            case 1:
                if (sum == 11) {
                    System.out.println(sum + " рублей");
                } else {
                    System.out.println(sum + " рубль");
                }
                break;
            case 2:
            case 3:
            case 4:
                if (sum == 12 || sum == 13 || sum == 14) {
                    System.out.println(sum + " рублей");
                } else {
                    System.out.println(sum + " рубля");
                }
                break;
            default:
                System.out.println(sum + " рублей");
        }
    }
}
