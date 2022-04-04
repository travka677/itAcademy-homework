package by.itAcademy.homework.les14_regexp;
/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры,
например <p id ="p1">, и замену их на простые теги абзацев <p>.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String str = "hello<s> my friend<p><p> <s>  <p id = \"g\"><p id = \"fgds\">  <p id = \"hh4323\">";

        Pattern pattern = Pattern.compile("<p id = \"[a-zA-Z]\\w*\">");
        Matcher matcher = pattern.matcher(str);

        System.out.println(str);

        str = matcher.replaceAll("<p>");
        System.out.println(str);

    }
}
