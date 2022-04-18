package oop.characters;

public class Hero extends Character {

    private String name;

    public Hero(int hp, int attackDamage, String name, int defense) {
        super(hp, attackDamage, defense);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int spAttack() {
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
        return spAttackDamage;
    }

    @Override
    public void spDefend() {

    }
}

