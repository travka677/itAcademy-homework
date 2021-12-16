package by.itAcademy.homework.les08.shapes;

import by.itAcademy.homework.les08.interfaces.Uniformity;

public abstract class Shape implements Uniformity {

    private double area;
    private double perimeter;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public boolean compareAreas(Shape shape) {
        return shape.calculateArea() == this.calculateArea();
    }

    @Override
    public boolean comparePerimeters(Shape shape) {
        return shape.calculatePerimeter() == this.calculatePerimeter();
    }
}
