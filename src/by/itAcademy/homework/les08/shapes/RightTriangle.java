package by.itAcademy.homework.les08.shapes;

public class RightTriangle extends Triangle {

    // Прямоугольгый треугольник задается двумя катетами по умолчанию
    public RightTriangle(double sideA, double sideB) {
        super(sideA, sideB);
        setSideC(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
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
                append(String.format("%.2f", getSideC())).
                append(" } ]").toString();
    }
}
