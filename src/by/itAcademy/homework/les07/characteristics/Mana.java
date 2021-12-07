package by.itAcademy.homework.les07.characteristics;

public class Mana {
    private int amount;
    private final int maxAmount;

    public Mana(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void increase(int amount) {
        this.amount += amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }
}
