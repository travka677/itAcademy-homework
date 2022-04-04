package by.itAcademy.homework.les14_regexp;
/*
Написать метод, который проверяет, является ли строка адресом IPv4.
Пример корректных IPv4
0.0.0.0
0.0.1.0
255.0.0.1
255.55.255.255
192.168.0.1

Не корректный
001.0.0.0
256.1.1.1
1.1.1.1.
-1.0.-1.1
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String str = "255.55.255.255";

        Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.matches());
    }
}
