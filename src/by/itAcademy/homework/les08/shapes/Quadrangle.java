package by.itAcademy.homework.les08.shapes;

import by.itAcademy.homework.les08.interfaces.Height;

public abstract class Quadrangle extends Shape implements Height {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    // Конструктор для произвольного четырехугольника
    public Quadrangle(double sideA, double sideB, double sideC, double sideD) {
        this(sideA, sideB, sideC);

        if (sideD > 0) {
            this.sideD = sideD;
        } else {
            System.err.println("Невозможная сторона");
        }
    }

    // Конструктор для равнобедренной трапеции
    public Quadrangle(double sideA, double sideB, double sideC) {
        this(sideA, sideB);

        if (sideC > 0) {
            this.sideC = sideC;
        } else {
            System.err.println("Невозможная сторона");
        }
    }

    // Конструктор для прямоугольника, параллелограмма
    public Quadrangle(double sideA, double sideB) {
        this(sideA);

        if (sideB > 0) {
            this.sideB = sideB;
        } else {
            System.err.println("Невозможная сторона");
        }
    }

    // Конструктор для квадрата и ромба
    public Quadrangle(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        } else {
            System.err.println("Невозможная сторона");
        }
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getSideD() {
        return sideD;
    }
}
