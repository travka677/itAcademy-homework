package by.itAcademy.homework.les13_string;
/*
6. Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.

Пример: aaabbcdeef ->abcdef
 */

public class Task6 {
    public static void main(String[] args) {
        String str = "aaabbcdeef";

        StringBuilder stringBuilder = new StringBuilder(str.charAt(0) + "");

        boolean flag = true;
        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < stringBuilder.length(); j++) {
                if (str.charAt(i) == stringBuilder.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stringBuilder.append(str.charAt(i));
            }
            flag = true;
        }

        System.out.println(stringBuilder);

//        StringBuilder stringBuilder = new StringBuilder(str);
//
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            for (int j = i+1; j < stringBuilder.length(); j++) {
//                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
//                    stringBuilder.deleteCharAt(j);
//                    j--;
//                }
//            }
//        }
//        System.out.println(stringBuilder);
    }
}
