package by.itAcademy.homework.les08.shapes;

public class RightTriangle extends Triangle {

    public RightTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double calculateArea() {
        return getSideA() / 2 * getSideB();
    }

    @Override
    public double calculateHeight() {
        double a = getSideA();
        double b = getSideB();

        return (a * b) / (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
