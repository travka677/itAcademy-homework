package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;
import by.itAcademy.homework.les07.characteristics.Mana;
import by.itAcademy.homework.les07.interfaces.ManaAPI;

/*
Класс Mage
Mage накапливает ульту и его способность заключается в том, что он отнимает определенное количество здоровья у врага
(поле HEALTH_TO_DECREASE) и забирает его себе
 */

public class Mage extends Hero implements ManaAPI {
    private final Mana mana;
    private final int HEALTH_TO_DECREASE;

    public Mage(String name, Health health, int damage, Mana mana, int HEALTH_TO_DECREASE) {
        super(name, health, damage);
        this.mana = mana;
        this.HEALTH_TO_DECREASE = HEALTH_TO_DECREASE;
    }

    @Override
    public void attackEnemy(Enemy e) {
        if (isAccumulated()) {
            System.out.println(getName() + " is ulting!!!");
            ult(e);
            mana.setAmount(0);
        } else {
            System.out.println(getName() + " attacks " + e.getName());
            e.takeDamage(getDamage());
            accumulate();
        }

    }

    @Override
    public void accumulate() {
        mana.increase(1);
    }

    @Override
    public void ult(Character ch) {
        if (ch.isAlive()) {
            if (ch.getHealth().getAmount() >= HEALTH_TO_DECREASE) {
                ch.takeDamage(HEALTH_TO_DECREASE);
                getHealth().increase(HEALTH_TO_DECREASE);
                System.out.println(getName() + " has " + getHealth().getAmount() + " health");
            } else {
                ch.takeDamage(ch.getHealth().getAmount());
                getHealth().increase(ch.getHealth().getAmount());
                accumulate();
            }
        }
    }

    @Override
    public boolean isAccumulated() {
        return mana.getAmount() >= mana.getMaxAmount();
    }

}
