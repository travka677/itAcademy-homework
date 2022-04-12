package by.itAcademy.homework.les15_io;

// 4. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        File file = new File(File.separator + "Users" + File.separator + "daniilkim" + File.separator + "Desktop" + File.separator + "Java" + File.separator + "SongList.txt");

        System.out.println(maxAmount(file));
    }

    public static List<Integer> maxAmount(File file) {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String str;
            Pattern pattern = Pattern.compile("\\d+");
            int maxLength = 0;

            while ((str = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    int length = matcher.group().length();
                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
                numbers.add(maxLength);
                maxLength = 0;
            }

        } catch (IOException exception) {
            System.err.println(exception);
        }

        return numbers;
    }
}
