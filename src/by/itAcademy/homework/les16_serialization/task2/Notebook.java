package by.itAcademy.homework.les16_serialization.task2;

import jdk.jfr.DataAmount;

import java.util.Objects;

@DataAmount
public class Notebook extends Computer {
    private Touchpad touchpad;
    transient private double weight;

    public Notebook(double weight, double width, double height) {
        touchpad = new Touchpad(width, height);
        this.weight = weight;
    }

    public Notebook(String model, String typeOfProcessor, int ramAmount, double price, double weight, double width, double height) {
        super(model, typeOfProcessor, ramAmount, price);
        touchpad = new Touchpad(width, height);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model=" + getModel() +
                "typeOfProcessor=" + getTypeOfProcessor() +
                "ramAmount=" + getRamAmount() +
                "price=" + getPrice() +
                "touchpad=" + touchpad +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Notebook notebook = (Notebook) o;
        return Double.compare(notebook.weight, weight) == 0 && touchpad.equals(notebook.touchpad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), touchpad, weight);
    }
}
