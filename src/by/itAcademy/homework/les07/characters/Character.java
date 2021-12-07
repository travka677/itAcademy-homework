package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;
import by.itAcademy.homework.les07.interfaces.Mortal;

public abstract class Character implements Mortal {
    private final String name;
    private final Health health;
    private final int damage;

    public Character(String name, Health health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public Health getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health.decrease(damage);
    }

    @Override
    public boolean isAlive() {
        return health.getAmount() > 0;
    }
}
