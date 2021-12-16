package by.itAcademy.homework.les08.useful_classes;

import by.itAcademy.homework.les08.shapes.Quadrangle;
import by.itAcademy.homework.les08.shapes.Shape;
import by.itAcademy.homework.les08.shapes.Triangle;

public class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isQuadrangle(Shape shape) {
        return shape instanceof Quadrangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }
}
