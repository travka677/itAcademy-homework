package by.itAcademy.homework.les07;

import by.itAcademy.homework.les07.characteristics.Health;
import by.itAcademy.homework.les07.characteristics.Mana;
import by.itAcademy.homework.les07.characters.*;
import by.itAcademy.homework.les07.stuff.Shield;

public class BattleGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("Warrior", new Health(45), 6, new Shield(10));
        Enemy zombie = new Zombie("Zombie", new Health(15), 3, 1);
        Hero mage = new Mage("Mage", new Health(40), 4, new Mana(3), 5);
        Enemy dragon = new Dragon("Dragon", new Health(35), 4, new Mana(3), 6);
        Hero archer = new Archer("Archer", new Health(32), 3, new Mana(3), 3);

        Enemy[] enemies = new Enemy[2];
        enemies[0] = zombie;
        enemies[1] = dragon;

        startBattle(archer, enemies);
        printWinner(enemies);
    }

    public static void startBattle(Hero hero, Enemy[] enemies) {
        while (hero.isAlive() && enemiesAlive(enemies)) {
            for (Enemy enemy: enemies) {
                if (enemy.isAlive() && hero.isAlive()) {
                    enemy.attackHero(hero);
                    System.out.println(hero.getName() + " has " + hero.getHealth().getAmount() + " health\n");
                    if (!hero.isAlive()) {
                        System.out.println(hero.getName() + " is dead");
                    } else {
                        hero.attackEnemy(enemy);
                        System.out.println(enemy.getName() + " has " + enemy.getHealth().getAmount() + " health\n");
                        if (!enemy.isAlive()) {
                            System.out.println(enemy.getName() + " is dead");
                        }
                    }
                }
            }
        }
    }

    public static boolean enemiesAlive(Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            if (enemy.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public static void printWinner(Enemy[] enemies) {
        if (enemiesAlive(enemies)) {
            System.out.println("Enemies have won");
        } else {
            System.out.println("Hero has won");
        }
    }
}
