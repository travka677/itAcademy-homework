package by.itAcademy.homework.les14_regexp;
/*
4. Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
X - код оператора
Y - номер телефона
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String str = "+375294567854 +3464445534423  +375295678900 +37544ghj5467 +375330001122  hfd+375444567654  +3752934256990";

        Pattern pattern = Pattern.compile("(\\+375)(29|33|25|44|17)(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(str);

        System.out.println(str);
        while (matcher.find()) {
            String replacement = matcher.group(1) + " ("+ matcher.group(2) + ") " + matcher.group(3) + "-" + matcher.group(4) + "-" + matcher.group(5);
            str = str.replace(matcher.group(), replacement);
        }

        System.out.println(str);
    }
}
