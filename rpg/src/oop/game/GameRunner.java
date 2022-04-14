package oop.game;


import oop.characters.*;
import oop.characters.Character;
import util.Input;

import java.util.Random;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        String heroChoice = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");

        Attackable hero;

        if (heroChoice.equalsIgnoreCase("warrior")) {
            hero = new Warrior("Warrior");
        } else if (heroChoice.equalsIgnoreCase("knight")) {
            hero = new Knight("Knight");
        }else {
            hero = new Mage(2000, 150, "zappy boi aka Samuel Moore");
        }

        hero.attack();

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
//
//
//
//
//
//    }


}