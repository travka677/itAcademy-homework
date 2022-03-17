package by.itAcademy.homework.les12_exception;
/*
7.	Написать метод, который в 50% случаев бросает исключение.
    Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.
 */

public class Task7 {
    public static void main(String[] args) {
        try {
            foo();
            System.out.println("Some code");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("main");
    }

    static void foo() throws Exception {
        int random = (int) (Math.random() * 2);

        if (random == 0) {
            throw new Exception();
        }
    }
}
