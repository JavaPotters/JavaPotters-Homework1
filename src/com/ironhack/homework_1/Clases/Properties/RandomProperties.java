package com.ironhack.homework_1.Clases.Properties;

import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

import java.util.ArrayList;
import java.util.List;

public class RandomProperties {

    private static List<String> namesList = new ArrayList<>();
    public static Wizard createRandomWizard() {
        int id = (int)(Math.random()*100);
        String name = generarNombresAleatorios();
        for(String nameList: namesList){
            if(nameList.equals(name)){
                name = name.concat("Jr");
            }
        }
        namesList.add(name);

        int hp = (int)(Math.random()*(100-50)+50);
        double mana = Math.round((double) (Math.random()*(50-10)+10));
        double inteligence = Math.round((double) (Math.random()*(50-1)+1));
        Wizard wizard = new Wizard(id, name, hp, true, mana, inteligence);
        return wizard;
    }

    public static Warrior createRandomWarrior() {
        int id = (int)(Math.random()*100);
        String name = generarNombresAleatorios();
        for(String nameList: namesList){
            if(nameList.equals(name)){
                name = name.concat(" Jr");
            }
        }
        namesList.add(name);
        int hp = (int)(Math.random()*(200-100)+100);
        double stamina = Math.round((double) (Math.random()*(50-10)+10));
        double strength = Math.round((double) (Math.random()*(10-1)+1));
        Warrior warrior = new Warrior(id, name, hp, true, stamina, strength);
        return warrior;
    }

    public static String generarNombresAleatorios() {
        String nombresAleatorios;

        String[] nombres = {"Sakura94", "Aisofin", "Fusof", "Ratoncilla", "Harry el Sucio", "La Jirafita",
                "Pony salvaje", "La potra", "Unicornia", "El zorro culisuelto", "La Vaina", "Panceta", "Pikachu",
                "Charmander", "Bulbasaur", "El pato Donald", "Psy duck", "Gatito Tom" , "Eevee", "El batman",
                "Spiderman", "Hulk", "Superman", "Chido"};
        nombresAleatorios = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
        return nombresAleatorios;
    }
}
