package by.itAcademy.homework.task10_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
7.	Использовать Алгоритмы. Не используя вспомогательных объектов,
переставить отрицательные элементы сгенерированного списка в конец, а положительные – в начало этого списка.
 */
public class Task7 {
    public static void main(String[] args) {
        List<Integer> list;

        list = createRandomList(-10, 30, 15);

        System.out.println(list);
        System.out.println(reverse(list));
    }

    public static List<Integer> createRandomList(int lowerBound, int upperBound, int capacity) {
        List<Integer> list = new ArrayList<>(capacity);
        Random random = new Random();
        int from;
        int to;

        if (lowerBound > 0 && upperBound > 0) {
            from = lowerBound * (-1);
            to = upperBound - lowerBound;
        } else {
            from = lowerBound < 0 ? lowerBound * (-1) : lowerBound;
            to = lowerBound < 0 ? upperBound + (lowerBound * (-1)) : upperBound + lowerBound;
        }

        for (int i = 0; i < capacity; i++) {
            int rand = random.nextInt(to + 1) - from;
            list.add(rand);
        }

        return list;
    }

    public static List<Integer> reverse(List<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);

        return list;
    }
}
