package by.itAcademy.homework.les12_exception.task5;
/*
5.	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
указав в качестве причины отловленное.
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new IOException(new MyException());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
