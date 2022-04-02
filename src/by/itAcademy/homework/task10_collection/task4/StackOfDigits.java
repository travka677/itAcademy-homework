package by.itAcademy.homework.task10_collection.task4;
/*
4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
•	Задать размер стека.
•	Внести цифру в стек.
•	Извлечь цифру из стека.

Вывести число, у которого цифры идут в обратном порядке.
 */

public class StackOfDigits {
    private int[] stack;
    private int top;

    public StackOfDigits(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public int[] getStack() {
        return stack;
    }

    public int getTop() {
        return top;
    }

    // Add the element to the top of the stack
    public void push(int digit) {
        stack[++top] = digit;
    }

    // Get the element and replace it with 0
    public int pop() {
        if (top == stack.length) {
            top = stack.length - 1;
        }
        int number = stack[top];
        stack[top--] = 0;
        return number;
    }
}
