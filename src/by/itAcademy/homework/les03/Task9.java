package by.itAcademy.homework.les03;

// 9. Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.

public class Task9 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                System.out.println("Не является");
                return;
            }
        }
        System.out.println("Является");
    }
}
