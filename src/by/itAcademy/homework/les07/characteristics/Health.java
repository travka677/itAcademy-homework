package by.itAcademy.homework.les07.characteristics;

public class Health {
    private final int MAX_AMOUNT;
    private int amount;

    public Health(int amount) {
        MAX_AMOUNT = amount;
        this.amount = MAX_AMOUNT;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMAX_AMOUNT() {
        return MAX_AMOUNT;
    }

    public void increase(int amount) {
        this.amount += amount;
    }

    public void decrease(int amount) {
        this.amount -= amount;
    }
}
