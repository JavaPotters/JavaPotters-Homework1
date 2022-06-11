package com.ironhack.homework_1.Clases.Properties;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

import java.util.Scanner;

public class CustomizedProperties {
    private static int idCounter = 1;
    public static Character createCustomizedWizard(){

        int id = idCounter++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert wizard's name");
        String name = scanner.nextLine();
        System.out.println("Please insert healtpoints (between 50 and 100)");
        int hp = scanner.nextInt();
        while(hp>100 || hp<50){
            System.out.println("ERROR! Please insert healtpoints (between 50 and 100)");
            hp = scanner.nextInt();
        }
        System.out.println("Please insert mana (between 10 and 50)");
        double mana = scanner.nextDouble();
        while(mana>50 || mana<10){
            System.out.println("ERROR! Please insert mana (between 10 and 50)");
            mana = scanner.nextDouble();
        }
        System.out.println("Please insert intelligence (between 1 and 50)");
        double intelligence = scanner.nextDouble();
        while(intelligence>50 || intelligence<1){
            System.out.println("ERROR! Please insert intelligence (between 1 and 50)");
            intelligence = scanner.nextDouble();
        }
        Character wizard = new Wizard(id, name, hp, true, mana, intelligence);
        return wizard;
    }

    public static Character createCustomizedWarrior(){
        Scanner scanner = new Scanner(System.in);
        //int id = (int)(Math.random()*100);
        int id = idCounter++;
        System.out.println("Please insert warrior's name");
        String name = scanner.nextLine();
        System.out.println("Please insert healthpoints (between 100 and 200)");
        int hp = scanner.nextInt();
        while(hp>200 || hp<100){
            System.out.println("ERROR! Please insert healthpoints (between 100 and 200)");
            hp = scanner.nextInt();
        }
        System.out.println("Please insert stamina (between 10 and 50)");
        double stamina = scanner.nextDouble();
        while(stamina>50 || stamina<10){
            System.out.println("ERROR! Please insert stamina (between 10 and 50)");
            stamina = scanner.nextDouble();
        }
        System.out.println("Please insert strength (between 1 and 10)");
        double strength = scanner.nextDouble();
        while(strength>10 || strength<1){
            System.out.println("ERROR! Please insert strength (between 1 and 10)");
            strength = scanner.nextDouble();
        }
        Character warrior = new Warrior(id, name, hp, true, stamina, strength);
        return warrior;
    }
}
