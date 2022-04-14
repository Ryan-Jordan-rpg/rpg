package oop.characters;

import oop.characters.Character;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(150, 25, name);
    }

    @Override
    public void attack() {
        System.out.println("Warrior attack!");
    }


}