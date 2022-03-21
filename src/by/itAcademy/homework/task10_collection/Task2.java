package by.itAcademy.homework.task10_collection;
/*
2.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();

        Task1.fillOutTheListWithRandomMarks(marks);
        System.out.println("All marks: \n" + marks);

        try {
            System.out.println("Max mark = " + maxMark(marks));
        } catch (NullPointerException ex) {
            System.err.println("List is empty");
        }
    }

    public static Integer maxMark(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();

        if (listIterator.hasNext()) {
            Integer max = listIterator.next();

            while (listIterator.hasNext()) {
                Integer mark = listIterator.next();
                if (mark > max) {
                    max = mark;
                }
            }
            return max;
        }
        return null;
    }

}
