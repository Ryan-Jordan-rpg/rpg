package oop.characters;

public class Enemy extends Character {

    public Enemy(int hp, int attackDamage, int defense) {
        super(hp, attackDamage, defense);
    }

    @Override
    public void attack() {
        System.out.println("Enemy Attack!");
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    @Override
    public void defend() {

    }

    @Override
    public void spDefend() {

    }

    @Override
    public int roll() {
        return 0;
    }
}