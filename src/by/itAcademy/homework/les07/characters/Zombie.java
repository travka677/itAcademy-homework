package by.itAcademy.homework.les07.characters;

import by.itAcademy.homework.les07.characteristics.Health;
/*
Класс Zombie
Zombie имеет шанс воскреснуть. Конструктор класса принимает целое число(от 1 до 3). Чем больше число,
тем выше шанс воскреснуть
 */

public class Zombie extends Enemy {
    private final int HEALTH_AFTER_RESURRECTION;
    private final int PROBABILITY_OF_RESURRECTION;

    /*
    Переменная PROBABILITY_OF_RESURRECTION представляет возможность зомби воскреснуть и принимает значения от 1 до 3
    Чем выше значение, тем больше такая вероятность
     */
    public Zombie(String name, Health health, int damage, int probabilityOfResurrection) {
        super(name, health, damage);
        HEALTH_AFTER_RESURRECTION = health.getMAX_AMOUNT();
        if (probabilityOfResurrection > 0 && probabilityOfResurrection <= 3) {
            PROBABILITY_OF_RESURRECTION = probabilityOfResurrection;
        } else {
            // Если значение выходит за рамки, то присваивается значение по умолчанию 2
            this.PROBABILITY_OF_RESURRECTION = 2;
        }
    }


    // Попытка смоделировать вероятность
    public boolean canResurrect() {
        int r = (int) (Math.random() * 10);

        switch (PROBABILITY_OF_RESURRECTION) {
            case 1: {
                if (r < 3) {
                    getHealth().setAmount(HEALTH_AFTER_RESURRECTION);
                    System.out.println("Zombie is rising");
                    return true;
                }
            }
            case 2: {
                if (r < 5) {
                    getHealth().setAmount(HEALTH_AFTER_RESURRECTION);
                    System.out.println("Zombie is rising");
                    return true;
                }
            }
            case 3: {
                if (r < 7) {
                    getHealth().setAmount(HEALTH_AFTER_RESURRECTION);
                    System.out.println("Zombie is rising");
                    return true;
                }
            }
            default:
                return false;
        }
    }

    @Override
    public void attackHero(Hero h) {
        System.out.println(getName() + " attacks " + h.getName());
        h.takeDamage(getDamage());

    }

    @Override
    public boolean isAlive() {
        if (getHealth().getAmount() <= 0) {
            return canResurrect();
        } else {
            return true;
        }
    }
}
