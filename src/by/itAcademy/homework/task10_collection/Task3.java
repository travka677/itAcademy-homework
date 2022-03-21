package by.itAcademy.homework.task10_collection;
/*
3.	Вывести учеников из списка в обратном порядке. (2 варианта решения).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task3 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Daniil");
        students.add("Pavel");
        students.add("Masha");
        students.add("Veronika");

        System.out.println("Variant 1:");
        printReversedList1(students);

        System.out.println("\nVariant 2:");
        printReversedList2(students);

    }

    public static void printReversedList1(List<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    public static void printReversedList2(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
