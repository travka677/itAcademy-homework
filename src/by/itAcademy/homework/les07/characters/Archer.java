package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;
import by.itAcademy.homework.les07.characteristics.Mana;
import by.itAcademy.homework.les07.interfaces.ManaAPI;

public class Archer extends Hero implements ManaAPI {
    private final Mana mana;
    private final int FREEZE_TIME;

    public Archer(String name, Health health, int damage, Mana mana, int FREEZE_TIME) {
        super(name, health, damage);
        this.mana = mana;
        this.FREEZE_TIME = FREEZE_TIME;
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
    public boolean isAccumulated() {
        return mana.getAmount() >= mana.getMaxAmount();
    }

    @Override
    public void ult(Character ch) {
        for (int i = 0; i < FREEZE_TIME; i++) {
            System.out.println(getName() + " attacks " + ch.getName());
            ch.takeDamage(getDamage());
        }
    }
}
