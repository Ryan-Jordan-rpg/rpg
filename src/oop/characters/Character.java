package oop.characters;

public abstract class Character implements Attackable, Defendable, Rollable {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int defense;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;
    protected  int spcDefence = 20;
    protected boolean isAttacker;

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

    public boolean isAttacker() {
        return isAttacker;
    }

    public void setAttacker(boolean attacker) {
        isAttacker = attacker;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public int attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
            return attackDamage;
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
            return baseAttackDamage;
        }
    }

    public void defend() {
        System.out.println("Defend " + baseDefense+ " against attack");
//        if (!compare()) {
//            System.out.println("Attack miss");
//        } else {
//            int damageTaken =( attackDamage - this.defense);
//            System.out.println("Attacked for " + damageTaken + " damage");
//            this.hp -= damageTaken;
//            System.out.println(this.hp);
//        }
    }

    public  void spDefend(){
        System.out.println("Defend " + spcDefence+ " against attack");
    };

    public int roll() {
        int roll = (int) Math.floor(Math.random() * 30 + 1);

        return roll;
    }

    public boolean compare() {
        int attackRoll = roll();
        int defenseRoll = roll();
//        System.out.println( attackRoll+" " +defenseRoll);
        if (attackRoll > defenseRoll) {
            return true;
        } else {
            return false;
        }
    }
}