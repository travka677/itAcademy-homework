package by.itAcademy.homework.les12_exception;
/*
6.	Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
    Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */

import java.io.IOException;

public class Task6 {
    public static void main(String[] args) {
        try {
            foo();
        } catch (IllegalArgumentException | IOException  | NullPointerException e) {
            e.printStackTrace();
        }
    }

    static void foo() throws NullPointerException, IOException, IllegalArgumentException {
        int random = (int)(Math.random() * 3);

        switch (random) {
            case 0: throw new NullPointerException();
            case 1: throw new IOException();
            case 2: throw new IllegalArgumentException();
        }
    }
}
