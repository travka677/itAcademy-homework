package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;

public abstract class Enemy extends Character {

    public Enemy(String name, Health health, int damage) {
        super(name, health, damage);
    }

    abstract public void attackHero(Hero h);

}
