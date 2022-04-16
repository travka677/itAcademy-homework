package by.itAcademy.homework.les16_serialization.task2;

import java.io.Serializable;
import java.util.Objects;

public class Computer implements Serializable {
    private String model;
    private String typeOfProcessor;
    private int ramAmount;
    private double price;

    public Computer(String model, String typeOfProcessor, int ramAmount, double price) {
        this.model = model;
        this.typeOfProcessor = typeOfProcessor;
        this.ramAmount = ramAmount;
        this.price = price;
    }

    public Computer() {

    }

    public String getModel() {
        return model;
    }

    public String getTypeOfProcessor() {
        return typeOfProcessor;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", typeOfProcessor='" + typeOfProcessor + '\'' +
                ", ramAmount=" + ramAmount +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramAmount == computer.ramAmount && Double.compare(computer.price, price) == 0 && model.equals(computer.model) && typeOfProcessor.equals(computer.typeOfProcessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, typeOfProcessor, ramAmount, price);
    }
}
