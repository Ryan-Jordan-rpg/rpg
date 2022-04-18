package oop.characters;

import oop.characters.Character;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(150, 25, name, 15);
    }

    @Override
    public void attack() {
        System.out.println("Warrior attack!");
    }


}