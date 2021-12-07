package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;
import by.itAcademy.homework.les07.stuff.Shield;

/*
Класс Warrior
У Warrior есть щит
 */
public class Warrior extends Hero {
    private Shield shield;

    public Warrior(String name, Health health, int damage, Shield shield) {
        super(name, health, damage);
        this.shield = shield;
    }

    @Override
    public void attackEnemy(Enemy e) {
        System.out.println(getName() + " attacks " + e.getName());
        e.takeDamage(getDamage());
    }

    @Override
    public void takeDamage(int damage) {
        if (shield.getStrength() > 0) {
            shield.takeDamage(damage);
            System.out.println("Shield strength = " + shield.getStrength());
        } else {
            super.takeDamage(damage);
        }
    }
}
