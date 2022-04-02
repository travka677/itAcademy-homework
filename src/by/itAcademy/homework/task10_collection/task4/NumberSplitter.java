package by.itAcademy.homework.task10_collection.task4;

public class NumberSplitter {

    private NumberSplitter() {

    }

    // Split the number into digits and add it to the stack
    public static void split(int number, StackOfDigits stack) {
        for (int i = number; i > 0; i /= 10) {
            try {
                stack.push(i % 10);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Stack is over");
                break;
            }
        }
    }

    // Recreate the number from the stack
    public static int recreateNumber(StackOfDigits stack) {
        int number = 0;
        int[] digits = stack.getStack();
        int index = stack.getTop();

        for (int i = 0; i <= index; i++, number *= 10) {
            number += digits[i];
        }
        return number / 10;
    }
}
