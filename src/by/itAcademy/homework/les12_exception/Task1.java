package by.itAcademy.homework.les12_exception;
/*
1.	Объявите переменную со значением null. Вызовите метод у этой переменной.
Отловите возникшее исключение.
 */

public class Task1 {
    public static void main(String[] args) {
        Long number = null;

        try {
            System.out.println(number.toString());
        } catch (RuntimeException e) {
            System.err.println(e);
        }
    }
}
