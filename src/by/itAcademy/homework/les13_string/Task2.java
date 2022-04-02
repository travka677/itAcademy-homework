package by.itAcademy.homework.les13_string;
// 2. Заменить все грустные смайлы :( в строке на весёлые :)

public class Task2 {
    public static void main(String[] args) {
        String str = "Hi :) bye :( this is task : 2 :(:(";

        System.out.println(str.replace(":(", ":)"));
    }
}
