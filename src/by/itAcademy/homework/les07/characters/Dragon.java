package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;
import by.itAcademy.homework.les07.characteristics.Mana;
import by.itAcademy.homework.les07.interfaces.ManaAPI;

public class Dragon extends Enemy implements ManaAPI {
    private Mana mana;
    private final int DAMAGE_TO_ULT;

    public Dragon(String name, Health health, int damage, Mana mana, int DAMAGE_TO_ULT) {
        super(name, health, damage);
        this.mana = mana;
        this.DAMAGE_TO_ULT = DAMAGE_TO_ULT;
    }

    @Override
    public void attackHero(Hero h) {
        if (isAccumulated()) {
            System.out.println(getName() + " is ulting!!!");
            ult(h);
            mana.setAmount(0);
        } else {
            System.out.println(getName() + " attacks " + h.getName());
            h.takeDamage(getDamage());
            accumulate();
        }



    }

    @Override
    public void ult(Character ch) {
        ch.takeDamage(DAMAGE_TO_ULT);
    }

    @Override
    public void accumulate() {
        mana.increase(1);
    }

    @Override
    public boolean isAccumulated() {
        return mana.getAmount() >= mana.getMaxAmount();
    }
}
