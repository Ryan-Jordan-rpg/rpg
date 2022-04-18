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

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    @Override
    public void defend() {
        System.out.println("You defend the enemy damage");
    }

    @Override
    public void spDefend() {

    }

    @Override
    public int roll() {
        return 0;
    }
}