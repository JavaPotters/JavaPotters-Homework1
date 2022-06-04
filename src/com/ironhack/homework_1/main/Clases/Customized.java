package com.ironhack.homework_1.main.Clases;


import java.util.Scanner;

public class Customized {
    public static Wizard createCustomizedWizard(){
        int id = (int)(Math.random());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del Wizard");
        String name = scanner.nextLine();
        System.out.println("Por favor ingrese los puntos de vida");
        int hp = scanner.nextInt();
        System.out.println("Por favor ingrese la mana");
        double mana = scanner.nextDouble();
        System.out.println("Por favor ingrese la inteligence");
        double inteligence = scanner.nextDouble();
        Wizard wizard = new Wizard(id, name, hp, true, mana, inteligence);
        return wizard;
    }

    public static Warrior createCustomizedWarrior(){

        int id = (int)(Math.random());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del Warrior");
        String name = scanner.nextLine();
        System.out.println("Por favor ingrese los puntos de vida");
        int hp = scanner.nextInt();
        System.out.println("Por favor ingrese la stamina");
        double stamina = scanner.nextDouble();
        System.out.println("Por favor ingrese la strength");
        double strength = scanner.nextDouble();
        Warrior warrior = new Warrior(id, name, hp, true, stamina, strength);
        return warrior;
    }
}
