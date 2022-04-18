package oop.game;


import oop.characters.*;
import oop.characters.Character;
import util.Input;
import util.RollHelper;

import java.util.Random;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        String heroChoice = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");

        Character hero;
        Character enemy= new Zombie();


        if (heroChoice.equalsIgnoreCase("warrior")) {
            hero = new Warrior("Warrior");
        } else if (heroChoice.equalsIgnoreCase("knight")) {
            hero = new Knight("Knight");
        }else {
            hero = new Mage(2000, 150, "zappy boi aka Samuel Moore",5);
        }

        hero.attack();
        hero.setAttacker(true);
        enemy.defend();
         GamePlay.turn(hero, enemy);
//        int heroRoll = RollHelper.getRoll();
//        int enemyRoll = RollHelper.getRoll();
//
//        if (RollHelper.isHigherRoll(heroRoll, enemyRoll)){
//            hero.attack();
//        }
//        hero.setAttacker(!hero.isAttacker());
//        enemy.setAttacker(!enemy.isAttacker());

    }

//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        String heroName = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");
//
//        Hero hero;
////        WE DONT KNOW WHICH HERO WILL BE CHOSEN UNTIL RUNTIME
//        if (heroName.equalsIgnoreCase("warrior")) {
//            hero = new Warrior("Warrior");
//        } else {
//            hero = new Knight("Knight");
//        }
//
////        WE DONT KNOW WHICH HERO ATTACKS UNTIL RUN TIME
//        hero.attack();
//
//        Enemy[] enemies = {new Zombie(), new Dragon()};
//
//        int randomIndex = random.nextInt(enemies.length);
//        Enemy enemyToAttack = enemies[randomIndex];
//
//        System.out.println(enemyToAttack.getClass().getName());
//    }


}