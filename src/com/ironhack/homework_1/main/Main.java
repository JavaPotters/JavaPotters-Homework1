package com.ironhack.homework_1.main;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Party.CustomizedParty;
import com.ironhack.homework_1.Clases.Party.Party;
import com.ironhack.homework_1.Clases.Party.RandomParty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.ironhack.homework_1.Clases.Properties.CustomizedProperties.*;

public class Main {

    /*
    // To read the CSV File we'll need to create:
    public static final String SEPARATOR=";";
    public static final String QUOTE="\"";

     */

    public static void main(String[] args) throws IOException {

        // Code to read the CSV File

        /*
        BufferedReader br = null;

        try {

            br =new BufferedReader(new FileReader("unit1/characters.csv"));
            String line = br.readLine();
            while (null!=line) {
                String [] fields = line.split(SEPARATOR);
                System.out.println(Arrays.toString(fields));

                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (null!=br) {
                br.close();
            }
        }

         */

        // Aquí comienza el juego:
        System.out.println("Bienevenido al ... de JavaPotters");
        Scanner scanner = new Scanner(System.in);

        int option;
        do{
            System.out.println("Por favor seleccionar: \n" +
                    "1. Si quieres una full party random \n" +
                    "2. Si quieres crear tus propios personajes \n");
            option = scanner.nextInt();
        } while (option != 1 && option != 2);

            int numMemberParty;
            String nameTeam1;
            String nameTeam2;
            Party team1;
            Party team2;
            switch(option){
                case 1:
                    System.out.println("Has elegido crear una full party random");
                    System.out.println("Cuantos jugadores entre 1-5 tiene cada equipo?");

                    numMemberParty = scanner.nextInt();
                    while (numMemberParty < 0 || numMemberParty > 5){
                        System.out.println("Ese numero no es valido \n Cuantos jugadores entre 1-5 tiene cada equipo?");
                        numMemberParty = scanner.nextInt();
                    }

                    // Team 1 -------------------------------------------
                    System.out.println("¿Cual quieres que sea el nombre del equipo 1?");
                    nameTeam1 = scanner.next();
                    System.out.println("El nombre del Team 1 es: " + nameTeam1);
                    team1 = new RandomParty(numMemberParty, nameTeam1);
                    team1.printParty();

                    // Team 2 -------------------------------------------
                    System.out.println("¿Cual quieres que sea el nombre del equipo 2?");
                    nameTeam2 = scanner.next();
                    System.out.println("El nombre del Team 2 es: " + nameTeam2);
                    team2 = new RandomParty(numMemberParty, nameTeam2);
                    team2.printParty();

                    scanner.close();
                    break;

                case 2:
                    System.out.println("Has elegido crear tus propios personajes!");
                    System.out.println("Cuantos jugadores entre 1-5 tiene cada equipo?");
                    numMemberParty = scanner.nextInt();
                    while (numMemberParty < 0 || numMemberParty > 5){
                        System.out.println("Ese numero no es valido \n Cuantos jugadores entre 1-5 tiene cada equipo?");
                        numMemberParty = scanner.nextInt();
                    }

                    // Team 1 -------------------------------------------
                    System.out.println("¿Cual quieres que sea el nombre del equipo 1?");
                    nameTeam1 = scanner.next();
                    System.out.println("El nombre del Team 1 es: " + nameTeam1);
                    team1 = new CustomizedParty(numMemberParty, nameTeam1);

                    for(int i = 1; i <= numMemberParty; i++){
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Por favor seleccionar: \n" +
                                "1. Si quieres crear un Wizard \n" +
                                "2. Si quieres crear un Warrior \n");
                        option = scanner2.nextInt();
                        while (option != 1 && option != 2){
                            System.out.println("Numero invalido");
                            System.out.println("Por favor seleccionar: \n" +
                                    "1. Si quieres crear un Wizard \n" +
                                    "2. Si quieres crear un Warrior \n");
                            option = scanner2.nextInt();
                        }switch(option){
                            case 1:
                                System.out.println("Creando un mago...");
                                Character wizard = createCustomizedWizard();
                                team1.addWizard((Wizard) wizard);
                                System.out.println("Mago creado exitosamente!");
                                break;
                            case 2:
                                System.out.println("Creando un guerrero...");
                                Character warrior = createCustomizedWarrior();
                                team1.addWarrior((Warrior) warrior);
                                System.out.println("Guerrero creado exitosamente!");
                                break;
                            }

                        System.out.println("Numero de personajes creados: " +i+ "    Numero total del equipo: "+numMemberParty);
                        }
                    System.out.println("La party del team "+nameTeam1+" se ha creado exitosamante");
                    team1.printParty();

                    // Team 2 -------------------------------------------
                    System.out.println("¿Cual quieres que sea el nombre del equipo 2?");
                    nameTeam2 = scanner.next();
                    System.out.println("El nombre del Team 2 es: " + nameTeam2);
                    team2 = new CustomizedParty(numMemberParty, nameTeam2);

                    for(int i = 1; i <= numMemberParty; i++){
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Por favor seleccionar: \n" +
                                "1. Si quieres crear un Wizard \n" +
                                "2. Si quieres crear un Warrior \n");
                        option = scanner2.nextInt();
                        while (option != 1 && option != 2){
                            System.out.println("Numero invalido");
                            System.out.println("Por favor seleccionar: \n" +
                                    "1. Si quieres crear un Wizard \n" +
                                    "2. Si quieres crear un Warrior \n");
                            option = scanner2.nextInt();
                        }switch(option){
                            case 1:
                                System.out.println("Creando un mago...");
                                Character wizard = createCustomizedWizard();
                                team2.addWizard((Wizard) wizard);
                                System.out.println("Mago creado exitosamente!");
                                break;
                            case 2:
                                System.out.println("Creando un guerrero...");
                                Character warrior = createCustomizedWarrior();
                                team2.addWarrior((Warrior) warrior);
                                System.out.println("Guerrero creado exitosamente!");
                                break;
                        }

                        System.out.println("Numero de personajes creados: " +i+ "    Numero total del equipo: "+numMemberParty);
                    }
                    System.out.println("La party del team "+nameTeam2+" se ha creado exitosamante");
                    team2.printParty();


                    break;
                default:
                    team1 = new RandomParty(5, "Random Team 1");
                    team2 = new RandomParty(5, "Random Team 2");
            }

        System.out.println("Que comience la batalla" );
        while(team1.isTeamLive() && team2.isTeamLive()){
            System.out.println("¿Qué jugador quieres que luche en primer lugar para el equipo 1? Por favor ingresa el id" );
        }
        //for (int i = 1; i<= 2; i++){
        //    int idPersonaje = scanner.nextInt();
        //}




    }


}

