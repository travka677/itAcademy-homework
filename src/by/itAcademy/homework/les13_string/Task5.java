package by.itAcademy.homework.les13_string;
// 5. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.

public class Task5 {
    public static void main(String[] args) {
        String text = "Подсчитать количество    слов в   тексте  ";

        String[] words = text.split("\\s++");
        System.out.println(words.length);
    }
}
