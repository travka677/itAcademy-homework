package by.itAcademy.homework.les03;

// 4. Создать массив из 3 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
//   Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 90 + 10);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        if (numbers[0] < numbers[1] && numbers[1] < numbers[2]) {
            System.out.println("\nМассив является строго возрастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью.");
        }
    }
}
