package com.ironhack.homework_1.Clases.Properties;

import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

public class RandomProperties {

    public static Wizard createRandomWizard() {
        int id = (int)(Math.random()*100);
        String name = "";
        int hp = (int)(Math.random()*(100-50)+50);
        double mana = (double) (Math.random()*(50-10)+10);
        double inteligence = (double) (Math.random()*(50-1)+1);
        Wizard wizard = new Wizard(id, name, hp, true, mana, inteligence);
        return wizard;
    }

    public static Warrior createRandomWarrior() {
        int id = (int)(Math.random()*100);
        String name = " ";
        int hp = (int)(Math.random()*(200-100)+100);
        double stamina = (double) (Math.random()*(50-10)+10);
        double strength = (double) (Math.random()*(10-1)+1);
        Warrior warrior = new Warrior(id, name, hp, true, stamina, strength);
        return warrior;
    }
}
