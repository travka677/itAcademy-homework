package by.itAcademy.homework.les12_exception.task4;
/*
4.	Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
Добавить вконструктор своего класса возможность указания сообщения.
 */

public class Main {
    public static void main(String[] args) {
        try {
            foo();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    static void foo() throws MyException {
        throw new MyException("Exception");
    }

}
