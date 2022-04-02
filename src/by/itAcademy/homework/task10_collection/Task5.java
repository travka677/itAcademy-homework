package by.itAcademy.homework.task10_collection;
/*
5.	Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.
 */

import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Set<Integer> evenNumbers = new HashSet<>();
        Set<Integer> doublePositiveFigures = new HashSet<>();

        // Set of even numbers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        // Set of double figures
        for (int i = 10; i <= 99; i++) {
            doublePositiveFigures.add(i);
        }

        System.out.println("Set of even numbers: " + evenNumbers);
        System.out.println("Set of double positive figures: " + doublePositiveFigures);

        System.out.println("Intersection: " + intersection(evenNumbers, doublePositiveFigures));
        System.out.println("Union: " + unify(evenNumbers, doublePositiveFigures));

    }

    // Intersection of two sets
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.retainAll(set2);

        return newSet;
    }

    // Union of two sets
    public static Set<Integer> unify(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<>(set1);
        newSet.addAll(set2);

        return newSet;
    }
}
