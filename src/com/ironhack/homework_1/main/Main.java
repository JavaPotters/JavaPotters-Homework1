package com.ironhack.homework_1.main;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.CsvReader;
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

    public static void main(String[] args) throws IOException {
/*

        CsvReader lectorCSV = new CsvReader();
        lectorCSV.readCSV();

 */

        // Aquí comienza el juego:
        System.out.println("Bienevenido al ... de JavaPotters");
        Scanner scanner = new Scanner(System.in);

        int numMemberParty;
        String nameTeam1 = "";
        String nameTeam2 = "";
        Party team1;
        Party team2;

        int option;
        do{
            System.out.println("Please, select one option: \n" +
                    "1. Choose 1 to create a full random party \n" +
                    "2. Choose 2 to create a customized party \n");
            option = scanner.nextInt();
        } while (option != 1 && option != 2);


            switch(option){
                case 1:
                    System.out.println("You have chosen to create a full random party");
                    System.out.println("How many players between 1-5 does each team have?");

                    numMemberParty = scanner.nextInt();
                    while (numMemberParty < 0 || numMemberParty > 5){
                        System.out.println("This number isn't valid \n How many players between 1-5 does each team have?");
                        numMemberParty = scanner.nextInt();
                    }

                    // Team 1 -------------------------------------------
                    System.out.println("What do you want your team 1 to be called?");
                    nameTeam1 = scanner.next();
                    System.out.println("The name of the team 1 is: " + nameTeam1);
                    team1 = new RandomParty(numMemberParty, nameTeam1);
                    team1.printParty();

                    // Team 2 -------------------------------------------
                    System.out.println(("What do you want your team 2 to be called?"));
                    nameTeam2 = scanner.next();
                    System.out.println("The name of the team 2 is: " + nameTeam2);
                    team2 = new RandomParty(numMemberParty, nameTeam2);
                    team2.printParty();

                    scanner.close();
                    break;

                case 2:
                    System.out.println("You have chosen to create your own custom party");
                    System.out.println("How many players between 1-5 does each team have?");
                    numMemberParty = scanner.nextInt();
                    while (numMemberParty < 0 || numMemberParty > 5){
                        System.out.println("This number isn't valid \n How many players between 1-5 does each team have?");
                        numMemberParty = scanner.nextInt();
                    }

                    // Team 1 -------------------------------------------
                    System.out.println("What do you want your team 1 to be called?");
                    nameTeam1 = scanner.next();
                    System.out.println("The name of the team 1 is: " + nameTeam1);
                    team1 = new CustomizedParty(numMemberParty, nameTeam1);

                    for(int i = 1; i <= numMemberParty; i++){
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Please select: \n" +
                                "1. If you want to create a wizard \n" +
                                "2. If you want to create a warrior \n");
                        option = scanner2.nextInt();
                        while (option != 1 && option != 2){
                            System.out.println("Invalid number");
                            System.out.println("Please select: \n" +
                                    "1. If you want to create a wizard \n" +
                                    "2. If you want to create a warrior \n");
                            option = scanner2.nextInt();
                        }switch(option){
                            case 1:
                                System.out.println("Creating a wizard...");
                                Character wizard = createCustomizedWizard();
                                team1.addWizard((Wizard) wizard);
                                System.out.println("Wizard successfully created!");
                                break;
                            case 2:
                                System.out.println("Creating a warrior...");
                                Character warrior = createCustomizedWarrior();
                                team1.addWarrior((Warrior) warrior);
                                System.out.println("Warrior successfully created!");
                                break;
                            }

                        System.out.println("Number of characters created: " +i+ "    Total team number: "+numMemberParty);
                        }
                    System.out.println("The "+nameTeam1+" team's party has been successfully created");
                    team1.printParty();

                    // Team 2 -------------------------------------------
                    System.out.println("What do you want your team 2 to be called?");
                    nameTeam2 = scanner.next();
                    System.out.println("The name of the team 2 is: " + nameTeam2);
                    team2 = new CustomizedParty(numMemberParty, nameTeam2);

                    for(int i = 1; i <= numMemberParty; i++){
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Please select: \n" +
                                "1. If you want to create a wizard \n" +
                                "2. If you want to create a warrior \n");
                        option = scanner2.nextInt();
                        while (option != 1 && option != 2){
                            System.out.println("Invalid number");
                            System.out.println("Please select: \n" +
                                    "1. If you want to create a wizard \n" +
                                    "2. If you want to create a warrior \n");
                            option = scanner2.nextInt();
                        }switch(option){
                            case 1:
                                System.out.println("Creating a wizard...");
                                Character wizard = createCustomizedWizard();
                                team2.addWizard((Wizard) wizard);
                                System.out.println("Wizard successfully created!");
                                break;
                            case 2:
                                System.out.println("Creating a warrior...");
                                Character warrior = createCustomizedWarrior();
                                team2.addWarrior((Warrior) warrior);
                                System.out.println("Warrior successfully created!");
                                break;
                        }

                        System.out.println("Number of characters created: " +i+ "   Total team number: "+numMemberParty);
                    }
                    System.out.println(("The "+nameTeam2+" team's party has been successfully created"));
                    team2.printParty();


                    break;
                default:
                    team1 = new RandomParty(5, "Random Team 1");
                    team2 = new RandomParty(5, "Random Team 2");
            }

        System.out.println("Let the battle begin!" );
        while(team1.isTeamLive() && team2.isTeamLive()){

            // Team 1---------------------------------------
            System.out.println("Which player of team 1 do you want to fight? Please insert his ID number" );
            int id1 = scanner.nextInt();
            Character character1 = team1.getCharacter(id1);
            while (character1 == null){
                System.out.println("ERROR! ID invalid. Party Team 1 is made up of the following characters");
                team1.printParty();
                System.out.println("Which player of team 1 do you want to fight? Please insert his ID number" );

                id1 = scanner.nextInt();
                character1 = team1.getCharacter(id1);
            }

            // Team 2---------------------------------------
            System.out.println("Which player of team 1 do you want to fight? Please insert his ID number" );
            int id2 = scanner.nextInt();
            Character character2 = team2.getCharacter(id2);
            while (character2 == null){
                System.out.println("ERROR! ID invalid. Party Team 2 is made up of the following characters");
                team2.printParty();
                System.out.println("Which player of team 2 do you want to fight? Please insert his ID number" );

                id2 = scanner.nextInt();
                character2 = team2.getCharacter(id2);
            }


            //Pelea-------------
            while (character1.isAlive() || character2.isAlive()){
                double attack1 = character1.attack();
                double attack2 = character2.attack();

                character1.setHp(character1.getHp()-attack2);
                character2.setHp(character2.getHp()-attack1);
            }

            if (!character1.isAlive() && !character2.isAlive()){
                team1.deleteCharacter(character1);
                team2.deleteCharacter(character2);
                System.out.println("Characters 1 and 2 are dead. both teams have lost");
            } else if(!character1.isAlive()){
                team1.deleteCharacter(character1);
                System.out.println("Character 1 is dead. Team 1 has lost :( \n"
                        + nameTeam2 +" is the winner of this battle");
            } else if(!character2.isAlive()){
                team2.deleteCharacter(character2);
                System.out.println("Character 2 is dead. Team 2 has lost :( \n"
                        + nameTeam1 +" is the winner of this battle");
            }

        }

        scanner.close();

    }


}

