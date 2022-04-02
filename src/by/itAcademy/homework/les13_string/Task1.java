package by.itAcademy.homework.les13_string;
/* 1. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
*/

public class Task1 {
    public static void main(String[] args) {
        //System.out.println(stringConcat());
        System.out.println(stringBuilderConcat());
    }

    public static long stringConcat() {
        String str = "";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += "he";
        }

        return System.currentTimeMillis() - startTime;
    }

    public static long stringBuilderConcat() {
        StringBuilder stringBuilder = new StringBuilder();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("he");
        }

        return System.currentTimeMillis() - startTime;
    }

}
