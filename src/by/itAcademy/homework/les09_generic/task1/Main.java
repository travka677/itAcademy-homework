package by.itAcademy.homework.les09_generic.task1;

import by.itAcademy.homework.les09_generic.task2.PairUtil;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "hi");

        System.out.println(pair);
        System.out.println(PairUtil.swap(pair));
    }
}
