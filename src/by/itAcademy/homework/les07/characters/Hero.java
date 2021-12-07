package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;

public abstract class Hero extends Character {

    public Hero(String name, Health health, int damage) {
        super(name, health, damage);
    }

    abstract public void attackEnemy(Enemy e);
}
