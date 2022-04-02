package by.itAcademy.homework.task10_collection.task4;

import java.util.Scanner;

public class Reader {
    private Scanner input;

    public Reader() {
        input = new Scanner(System.in);
    }

    // Reading correct number
    public int readInteger() {
        System.out.println("Enter a number");

        while (!input.hasNextInt()) {
            System.out.println("Enter an integer");
            input.next();
        }
        return input.nextInt();
    }
}
