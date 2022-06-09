package com.ironhack.homework_1.Clases.Character;

public abstract  class Character {
    private int id;
    private String name;
    private double hp;
    private boolean isAlive;

    public Character(int id, String name, double hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        if(hp < 0){
            this.hp = 0;
            setAlive(false);
        } else {
            this.hp = hp;
        }

    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract double attack();
}
