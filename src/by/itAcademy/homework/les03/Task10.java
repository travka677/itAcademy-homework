package by.itAcademy.homework.les03;

// 10. Написать алгоритм расчета факториала , используя циклы (for и while).

public class Task10 {
    public static void main(String[] args) {

        int n = 4;
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
