package by.itAcademy.homework.les07.stuff;

public class Shield {
    private int strength;

    public Shield(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void takeDamage(int damage) {
        strength -= damage;
    }
}
