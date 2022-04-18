package oop.game;

import oop.characters.Character;
import util.RollHelper;

public class GamePlay {
    public static void turn(Character hero, Character enemy){

        System.out.println("-----------------------------------");

        int heroRoll = RollHelper.getRoll();
        int enemyRoll = RollHelper.getRoll();

        System.out.println("Hero's roll: " + heroRoll);
        System.out.println("Enemy's roll: " + enemyRoll);

        if (hero.isAttacker()) {
            System.out.println("Hero is attacking!");
            if (RollHelper.isHigherRoll(heroRoll, enemyRoll)) {
                enemy.setHp(enemy.getHp() - hero.attack());
                System.out.println("Enemy's HP is: " + enemy.getHp());
            }
        } else {
            System.out.println("Enemy is attacking!");
            if (RollHelper.isHigherRoll(enemyRoll, heroRoll)) {
                hero.setHp(hero.getHp() - enemy.attack());
                System.out.println("Hero's HP is: " + hero.getHp());
            }
        }
        hero.setAttacker(!hero.isAttacker());
        enemy.setAttacker(!enemy.isAttacker());
    }
}
