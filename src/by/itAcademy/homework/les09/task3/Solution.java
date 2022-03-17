package by.itAcademy.homework.les09.task3;
/*
3.	Дан класс Solution, параметризированный T. Ограничьте параметр T.
T должен быть наследником класса ClassForGenerics и одновременно реализовывать интерфейс InterfaceForGenerics.
Менять можно только класс Solution.
 */

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
}
