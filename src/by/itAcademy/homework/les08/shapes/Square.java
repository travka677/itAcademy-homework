package by.itAcademy.homework.les08.shapes;

public class Square extends Quadrangle {

    public Square(double sideA) {
        super(sideA);
        setSideB(sideA);
        setSideC(sideA);
        setSideD(sideA);
    }

    @Override
    public double calculateArea() {
        return Math.pow(getSideA(), 2);
    }

    @Override
    public double calculatePerimeter() {
        return getSideA() * 4;
    }

    @Override
    public double calculateHeight() {
        return getSideA();
    }
}
