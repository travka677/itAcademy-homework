package by.itAcademy.homework.les15_io;
/*
5. Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
Прочитать записанный файл, распечатать числа и их среднее арифметическое.

Решение без DataOutput/DataInputStream
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Task5 {
    private static final int AMOUNT = 20;
    private static final int LOWER_RANGE = 255;
    private static final int UPPER_RANGE = 1000;

    public static void main(String[] args) {
        File file = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "Java practice" + File.separator + "File1.txt");

        writeRandomIntegers(file);
        int[] numbers = restoreIntegers(file);

        System.out.println("Input: ");
        printIntegers(numbers);

        System.out.println("\nAverage = " + average(numbers));
    }

    public static void writeRandomIntegers(File file) {
        Random random = new Random();
        int randomNum;

        try (FileOutputStream fos = new FileOutputStream(file)) {
            for (int i = 1; i <= AMOUNT; i++) {
                randomNum = random.nextInt(UPPER_RANGE) + LOWER_RANGE;

                fos.write(randomNum);
                fos.write(randomNum >> 8);
                fos.write(randomNum >> 16);
                fos.write(randomNum >> 24);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static int[] restoreIntegers(File file) {
        int[] integers = new int[AMOUNT];
        int index = 0;

        try (FileInputStream fis = new FileInputStream(file)) {

            while (true) {
                int b1 = fis.read();
                int b2 = fis.read();
                int b3 = fis.read();
                int b4 = fis.read();

                if (b1 == -1 || b2 == -1 || b3 == -1 || b4 == -1) {
                    break;
                }
                int number = b1 | (b2 << 8) | (b3 << 16) | (b4 << 24);
                integers[index++] = number;
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
        return integers;
    }

    public static void printIntegers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int average(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / AMOUNT;
    }
}
