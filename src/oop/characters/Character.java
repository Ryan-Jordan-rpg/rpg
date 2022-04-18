package oop.characters;

public abstract class Character implements Attackable, Defendable, Rollable {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int defense;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;

    public Character(int hp, int attackDamage, int defense) {
        this.hp = hp;
        this.defense = defense;
        this.attackDamage = attackDamage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

    public void defend() {

        if (!compare()) {
            System.out.println("Attack miss");
        } else {
            System.out.println("Attacked for " + (attackDamage - defense) + " damage");
        }
    }

    public int roll() {
        return (int) Math.floor(Math.random() * 30 + 1);
    }

    public boolean compare() {
        int attackRoll = roll();
        int defenseRoll = roll();
        if (attackRoll > defenseRoll) {
            return true;
        } else {
            return false;
        }
    }
}