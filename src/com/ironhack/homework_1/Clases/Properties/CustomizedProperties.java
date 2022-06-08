package com.ironhack.homework_1.Clases.Properties;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

import java.util.Scanner;

public class CustomizedProperties {
    public static Character createCustomizedWizard(){
        int id = (int)(Math.random()*100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del Wizard");
        String name = scanner.nextLine();
        System.out.println("Por favor ingrese los puntos de vida");
        int hp = scanner.nextInt();
        while(hp>100 || hp<50){
            System.out.println("Por favor ingrese un número entre 50 y 100");
            hp = scanner.nextInt();
        }
        System.out.println("Por favor ingrese la mana");
        double mana = scanner.nextDouble();
        while(mana>50 || mana<10){
            System.out.println("Por favor ingrese un número entre 10 y 50");
            mana = scanner.nextDouble();
        }
        System.out.println("Por favor ingrese la inteligence");
        double intelligence = scanner.nextDouble();
        while(intelligence>50 || intelligence<1){
            System.out.println("Por favor ingrese un número entre 1 y 50");
            intelligence = scanner.nextDouble();
        }
        scanner.close();
        Character wizard = new Wizard(id, name, hp, true, mana, intelligence);
        return wizard;
    }

    public static Character createCustomizedWarrior(){
        Scanner scanner = new Scanner(System.in);
        int id = (int)(Math.random()*100);
        System.out.println("Por favor ingrese el nombre del Warrior");
        String name = scanner.nextLine();
        System.out.println("Por favor ingrese los puntos de vida");
        int hp = scanner.nextInt();
        while(hp>200 || hp<100){
            System.out.println("Por favor ingrese un número entre 100 y 200");
            hp = scanner.nextInt();
        }
        System.out.println("Por favor ingrese la stamina");
        double stamina = scanner.nextDouble();
        while(stamina>50 || stamina<10){
            System.out.println("Por favor ingrese un número entre 10 y 50");
            stamina = scanner.nextDouble();
        }
        System.out.println("Por favor ingrese la strength");
        double strength = scanner.nextDouble();
        while(strength>10 || strength<1){
            System.out.println("Por favor ingrese un número entre 1 y 10");
            strength = scanner.nextDouble();
        }
        scanner.close();
        Character warrior = new Warrior(id, name, hp, true, stamina, strength);
        return warrior;
    }
}
