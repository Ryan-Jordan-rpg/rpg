package oop.characters;

public class Enemy extends Character {

    public Enemy(int hp, int attackDamage, int defense) {
        super(hp, attackDamage, defense);
    }

    @Override
    // public int attack() {
        // System.out.println("Enemy Attack!");
    // }


    public int spAttack() {
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
        return spAttackDamage;
    }


    @Override
    public void spDefend() {

    }

//    @Override
//    public void defend() {
//
//        if (!compare()) {
//            System.out.println("Attack miss");
//        } else {
//            int damageTaken =( Hero.baseAttackDamage - this.defense);
//            System.out.println("Attacked for " + damageTaken + " damage");
//            this.hp -= damageTaken;
//            System.out.println(this.hp);
//        }
//    }

}