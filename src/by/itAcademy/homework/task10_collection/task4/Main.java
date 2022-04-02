package by.itAcademy.homework.task10_collection.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int number = reader.readInteger();

        StackOfDigits stack = new StackOfDigits(7);
        NumberSplitter.split(number, stack);

        System.out.println(Arrays.toString(stack.getStack()));

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(stack.pop());
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Stack is empty");
        }

        System.out.println(Arrays.toString(stack.getStack()));

        System.out.println(NumberSplitter.recreateNumber(stack));
    }

}
