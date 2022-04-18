package oop.game;

import oop.characters.Character;
import util.RollHelper;

public class GamePlay {
    public static void turn(Character hero, Character enemy){

        int heroRoll = RollHelper.getRoll();
        int enemyRoll = RollHelper.getRoll();

        if (RollHelper.isHigherRoll(heroRoll, enemyRoll)){
            hero.attack();
        }
        hero.setAttacker(!hero.isAttacker());
        enemy.setAttacker(!enemy.isAttacker());

    }
}
