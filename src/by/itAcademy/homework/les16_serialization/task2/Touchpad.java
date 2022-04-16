package by.itAcademy.homework.les16_serialization.task2;

import java.io.Serializable;
import java.util.Objects;

public class Touchpad implements Serializable {
    private double width;
    private double length;

    public Touchpad(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Touchpad touchpad = (Touchpad) o;
        return Double.compare(touchpad.width, width) == 0 && Double.compare(touchpad.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }
}
