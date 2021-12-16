package by.itAcademy.homework.les08.shapes;

import by.itAcademy.homework.les08.shapes.Triangle;

public class VersatileTriangle extends Triangle {

    public VersatileTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double calculateHeight() {
        double p = calculatePerimeter() / 2;

        double a = getSideA();
        double b = getSideB();
        double c = getSideC();

        return (2 / a) * (Math.sqrt(p* (p - a) * (p - b) * (p - c)));
    }
}
