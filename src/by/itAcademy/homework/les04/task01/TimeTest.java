package by.itAcademy.homework.les04.task01;

import by.itAcademy.homework.les04.task01.Time;

public class TimeTest {
    public static void main(String[] args) {

        Time time = new Time(20, 34, 11);

        time.print();
        System.out.println("Time in seconds = " + time.timeInSeconds());

    }
}
