package by.itAcademy.homework.les08.shapes;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double sideA, double sideB) {
        super(sideA, sideB);

        setSideC(sideA);

        if (2 * sideA <= sideB || sideA + sideB <= sideA) {
            System.err.println("Треугольник с такими сторонами не может быть построен");
        }
    }

    @Override
    public double calculateArea() {
        return (getSideB() / 4) * (Math.sqrt(4 * Math.pow(getSideA(), 2) - Math.pow(getSideB(), 2)));
    }

    public double calculateHeight() {
        return Math.sqrt(Math.pow(getSideA(), 2) - (Math.pow(getSideB(), 2) / 4));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        return builder.append("[ ").
                append(getClass().getName()).
                append(" { sideA = ").
                append(getSideA()).
                append(", sideB = ").
                append(getSideB()).
                append(", sideC = ").
                append(getSideC()).
                append(", height = ").
                append(" } ]").toString();
    }
}
