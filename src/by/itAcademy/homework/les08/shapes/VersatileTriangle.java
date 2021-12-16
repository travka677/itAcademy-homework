package by.itAcademy.homework.les08.shapes;

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
                append(" } ]").toString();
    }
}
