package by.itAcademy.homework.les12_exception;
/*
2.	Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[3];

        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }
}
