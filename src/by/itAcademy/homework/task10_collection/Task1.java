package by.itAcademy.homework.task10_collection;

/*
1.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task1 {
    private final static int MARKS_AMOUNT = 10;
    private final static int MIN_GOOD_MARK = 4;

    public static int getMarksAmount() {
        return MARKS_AMOUNT;
    }

    public static int getMinGoodMark() {
        return MIN_GOOD_MARK;
    }

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();

        fillOutTheListWithRandomMarks(marks);
        System.out.println("All marks: \n" + marks);

        deleteBadMarks(marks);
        System.out.println("Good marks: \n" + marks);
    }

    public static void fillOutTheListWithRandomMarks(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        Random random = new Random();

        while (listIterator.nextIndex() < MARKS_AMOUNT) {
            Integer mark = random.nextInt(MARKS_AMOUNT) + 1;
            listIterator.add(mark);
        }

    }

    public static void deleteBadMarks(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer mark = listIterator.next();

            if (mark < MIN_GOOD_MARK) {
                listIterator.remove();
            }
        }
    }

}
