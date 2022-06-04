package com.ironhack.homework_1.main;

public class Wizard extends Character implements Attacker{

    private double mana;
    private double intelligence;

    public Wizard(int id, String name, int hp, boolean isAlive, double mana, double intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;

    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void attack() {
        if (mana >= 5) {
            fireBall();
        }else {
            staffHit();
        }
    }

    private void fireBall() {

    }
    private void staffHit() {

    }

}

