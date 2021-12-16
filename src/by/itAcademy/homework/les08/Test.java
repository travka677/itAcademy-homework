package by.itAcademy.homework.les08;

/*
Создать иерархию классов, описывающих геометрические фигуры на плоскости.

- Можно пользоваться результатами предыдущего ДЗ.
- В иерархии должно быть не менее 10 классов/интерфейсов и хотя бы 2 уровня вложенности.
- Продемонстрировать переопределение методов в иерархии.
- Продемонстрировать добавление собственных методов в классах-наследниках (можно с помощью интерфейсов).
Например, расчёт диагонали в прямоугольнике, расчёт высоты в треугольнике.
- При разработке иерархии держать в уме принцип инкапсуляции, выбирать корректные имена классов и методов,
пользоваться преимуществами полиморфизма.
- Отдавайте предпочтение интерфейсам, а не абстрактным классам.
- При переопределении методов обязательно использовать аннотацию @Override
- Не создавать лишних классов в системе (полностью дублирующих или не содержащих назначения)
- Каждый класс должен выполнять своё назначение.

- Создать общие методы:
1. Рассчитывающий площадь фигуры.
2. Принимающий в качестве параметра фигуру и определяющий, равны ли площади текущей и полученной фигуры.

- Создать класс ShapeUtils со статическими методами:

1. Определяющим, является ли фигура прямоугольником.
2. Определяющим, является ли фигура треугольником.

- Для каждого неабстрактного класса переопределить метод toString() класса для представления информации о классах в строковой форме.

- В этом задании нет одного правильного решения, подойдите к нему творчески.

 */

import by.itAcademy.homework.les08.shapes.*;
import by.itAcademy.homework.les08.useful_classes.ShapeUtils;

public class Test {
    public static void main(String[] args) {

        Triangle triangle0 = new VersatileTriangle(4,5,7);
        System.out.println(triangle0.calculatePerimeter());
        System.out.println(triangle0.calculateArea());
        System.out.println(triangle0.calculateHeight());

        Triangle triangle1 = new RightTriangle(3,8, 6);
        System.out.println(triangle1.calculatePerimeter());
        System.out.println(triangle1.calculateArea());
        System.out.println(triangle0.compareAreas(triangle1));

        IsoscelesTriangle triangle2 = new IsoscelesTriangle(3,4);
        System.out.println(triangle2.calculatePerimeter());
        System.out.println(triangle2.calculateArea());
        System.out.println(triangle2.calculateHeight());

        Quadrangle quadrangle1 = new Square(5);
        System.out.println(quadrangle1.calculateArea());
        System.out.println(quadrangle1.calculatePerimeter());

        Quadrangle quadrangle2 = new Rectangle(4, 8);

        System.out.println(quadrangle1.compareAreas(quadrangle2));

        System.out.println(ShapeUtils.isTriangle(triangle2));

        System.out.println(triangle2);
    }
}
