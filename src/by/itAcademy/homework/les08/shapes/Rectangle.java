package by.itAcademy.homework.les08.shapes;

public class Rectangle extends Quadrangle {

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
        setSideC(sideA);
        setSideD(sideB);
    }

    @Override
    public double calculateArea() {
        return getSideA() * getSideB();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * getSideA() + 2 * getSideB();
    }

    @Override
    public double calculateHeight() {
        return getSideA();
    }
}
