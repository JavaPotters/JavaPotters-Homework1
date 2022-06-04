package com.ironhack.homework_1.main;

public class Warrior extends Character implements Attacker {

    private double stamina;
    private double strength;

    public Warrior(int id, String name, int hp, boolean isAlive, double stamina, double strength) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;

    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public void attack() {

        if (strength >= 5) {
            heavyAttack();
        }else {
            weakAttack();
        }
    }

    private void heavyAttack() {

    }
    private void weakAttack() {

    }


}