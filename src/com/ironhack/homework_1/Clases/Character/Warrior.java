package com.ironhack.homework_1.Clases.Character;

import com.ironhack.homework_1.Interface.Attacker;

import java.math.BigDecimal;

public class Warrior extends Character implements Attacker {

    private double stamina;
    private double strength;

    public Warrior(int id, String name, double hp, boolean isAlive, double stamina, double strength) {
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
    public double attack() {
        double damageAttack;
        if (stamina >= 5) {
             damageAttack = heavyAttack();
        }else {
            damageAttack = weakAttack();
        }
        return damageAttack;
    }

    private double heavyAttack() {
        this.stamina = this.stamina- 5;
        return strength;
    }
    private double weakAttack() {
        this.stamina = this.stamina  + 1;
        BigDecimal strengthDecimal = new BigDecimal(String.valueOf(strength/2));
        double strengthHalf = strengthDecimal.setScale(1).doubleValue();
        return strengthHalf;
    }

    @Override
    public String toString() {
        System.out.println("Warrior {" +
                "ID = " + getId() +
                ", Name = " + getName() +
                ", HP = " + getHp() +
                ", Stamina=" + getStamina() +
                ", strength=" + getStrength() +
                '}');
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
}