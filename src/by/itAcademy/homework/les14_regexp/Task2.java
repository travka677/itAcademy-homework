package by.itAcademy.homework.les14_regexp;
/*
2. Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String str = "0b0011 1x12df  0xsd13 0xab22 0X2334 0xabcd";

        Pattern pattern = Pattern.compile("0(x|X)[a-fA-F0-9]+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
