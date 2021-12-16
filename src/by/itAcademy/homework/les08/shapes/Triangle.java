package by.itAcademy.homework.les08.shapes;

import by.itAcademy.homework.les08.interfaces.Height;
import by.itAcademy.homework.les08.shapes.Shape;

public abstract class Triangle extends Shape implements Height {

    private double sideA;
    private double sideB;
    private double sideC;

    // Конструктор для разностороннего треугольника
    public Triangle(double sideA, double sideB, double sideC) {
        this(sideA, sideB);

        if (sideC <= 0) {
            System.err.println("Невозможная сторона");
        } else {
            this.sideC = sideC;
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.err.println("Треугольник с такими сторонами не может быть построен");
        }

    }

    // Конструктор для равнобедренного треугольника
    public Triangle(double sideA, double sideB) {
        this(sideA);

        if (sideB <= 0) {
            System.err.println("Невозможная сторона");
        } else {
            this.sideB = sideB;
        }
    }

    // Конструктор для равностороннего треугольника
    public Triangle(double sideA) {
        if (sideA <= 0) {
            System.err.println("Невозможная сторона");
        } else {
            this.sideA = sideA;
        }
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

    public void setSideA(double sideA) {
        if (sideB + sideC > sideA) {
            this.sideA = sideA;
        } else {
            System.out.println("Невозможная сторона");
        }
    }

    public void setSideB(double sideB) {
        if (sideA + sideC > sideB) {
            this.sideB = sideB;
        } else {
            System.err.println("Невозможная сторона");
        }
    }

    public void setSideC(double sideC) {
        if (sideB + sideA > sideC) {
            this.sideC = sideC;
        } else {
            System.err.println("Невозможная сторона");
        }
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;

        return Math.sqrt(p *(p - sideA)*(p - sideB)*(p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public abstract double calculateHeight();

}
