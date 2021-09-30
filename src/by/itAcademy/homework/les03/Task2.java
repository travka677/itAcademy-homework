package by.itAcademy.homework.les03;

// 2. Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        int i = 0;
        for (int n = 13; i < numbers.length; n++) {
            if (n % 13 == 0 || n % 17 == 0) {
                numbers[i] = n;
                i++;
            }

        }

        for (int k = 0; k < numbers.length; k++) {
            System.out.println(numbers[k]);
        }
    }
}
