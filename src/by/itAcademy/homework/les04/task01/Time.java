package by.itAcademy.homework.les04.task01;

// 1. Создать класс, описывающий промежуток времени.
// Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
// Создать метод для получения полного количества секунд в объекте
// Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
// Создать метод для вывода данных.
// Написать программу для тестирования возможностей класса.

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int hours, int minutes, int seconds) {
        if (hours >= 0 && minutes >= 0 && seconds >= 0) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public Time(int seconds) {
        if (seconds >= 0) {
            this.seconds = seconds;
        }
    }

    public int timeInSeconds() {
        return seconds + minutes * 60 + hours * 60 * 60;
    }

    public void print() {
        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
    }
}
