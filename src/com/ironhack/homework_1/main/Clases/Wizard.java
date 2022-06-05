package com.ironhack.homework_1.main.Clases;

import com.ironhack.homework_1.main.Interface.Attacker;

public class Wizard extends Character implements Attacker {

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


    public double attack() {
        double damageAttack;

        if (mana >= 5) {
            damageAttack = fireBall();
        }else {
            damageAttack = staffHit();
        }
        return damageAttack;
    }

    private double fireBall()  {
        this.mana = this.mana- 5;
        return intelligence;

    }
    private double staffHit() {
        this.mana = this.mana  + 1;
        return 2;

    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }
}

