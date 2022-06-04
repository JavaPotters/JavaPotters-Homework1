package com.ironhack.homework_1.main;

import com.ironhack.homework_1.main.Clases.Party;
import com.ironhack.homework_1.main.Clases.Warrior;
import com.ironhack.homework_1.main.Clases.Wizard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do{
            System.out.println("Por favor seleccionar: \n" +
                    "1. Si quieres una full party random \n" +
                    "2. Si crear tu propio personaje \n");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println("Has elegido crear una full party ramdon");
                    System.out.println("Cuantos jugadores tiene cada equipo?");
                    int numMemberParty = scanner.nextInt();
                    Party team1 = new Party(numMemberParty);
                    Party team2 = new Party(numMemberParty);
                    break;
                case 2:
                    System.out.println("Has elegido crear tu personaje");

                    do{
                        System.out.println("Por favor seleccionar: \n" +
                                "1. Si quieres crear un Wizard \n" +
                                "2. Si quieres crear un Warrior \n");
                        option = scanner.nextInt();

                        switch(option){
                            case 1:
                                System.out.println("Creando un mago");
                                Wizard wizard = crearWizard();
                                break;
                            case 2:
                                System.out.println("Creando un guerrero");
                                //Warrior warrior = new Warrior();
                                break;
                            default:
                                System.out.println("Opcion erronea");
                        }
                    } while (option != 1 && option != 2);

                    ///
                    break;
                default:
                    System.out.println("Opcion erronea");
            }
        } while (option != 1 && option != 2);

        scanner.close();
    }

    public static Wizard crearWizard(){
        int id = (int)(Math.random()*10+1);
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


}

