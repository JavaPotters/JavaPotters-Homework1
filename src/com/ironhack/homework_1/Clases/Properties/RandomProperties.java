package com.ironhack.homework_1.Clases.Properties;

import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

public class RandomProperties {

    public static Wizard createRandomWizard() {
        int id = (int)(Math.random()*100);
        String name = generarNombresAleatorios();
        int hp = (int)(Math.random()*(100-50)+50);
        double mana = Math.round((double) (Math.random()*(50-10)+10));
        double inteligence = Math.round((double) (Math.random()*(50-1)+1));
        Wizard wizard = new Wizard(id, name, hp, true, mana, inteligence);
        return wizard;
    }

    public static Warrior createRandomWarrior() {
        int id = (int)(Math.random()*100);
        String name = generarNombresAleatorios();
        int hp = (int)(Math.random()*(200-100)+100);
        double stamina = Math.round((double) (Math.random()*(50-10)+10));
        double strength = Math.round((double) (Math.random()*(10-1)+1));
        Warrior warrior = new Warrior(id, name, hp, true, stamina, strength);
        return warrior;
    }

    public static String generarNombresAleatorios() {
        String nombresAleatorios;

        String[] nombres = {"Sakura94", "Aisofin", "fusof", "Ratoncilla", "Baldwin", "Baltasar", "Barry", "Bartolo",
                "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
                "Caritina", "Carlota", "Baltazar"};

        nombresAleatorios = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];

        return nombresAleatorios;
    }
}
