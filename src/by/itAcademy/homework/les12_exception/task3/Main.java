package by.itAcademy.homework.les12_exception.task3;
/*
3.	Создать собственный класс-исключение - наследник класса Exception.
    Создать метод, выбрасывающий это исключение.
    Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
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
        throw new MyException();
    }
}
