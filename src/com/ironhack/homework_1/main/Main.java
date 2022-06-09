package com.ironhack.homework_1.main;


import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Party.CustomizedParty;
import com.ironhack.homework_1.Clases.Party.Party;
import com.ironhack.homework_1.Clases.Party.RandomParty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.ironhack.homework_1.Clases.Properties.CustomizedProperties.createCustomizedWarrior;
import static com.ironhack.homework_1.Clases.Properties.CustomizedProperties.createCustomizedWizard;

public class Main {

    public static void main(String[] args) throws IOException {

        //CsvReader lectorCSV = new CsvReader();
        //lectorCSV.readCSV("nameTeam1", "nameTeam2", "pathFile");

        // Let's start!
        System.out.println("Bienevenido al ... de JavaPotters");
        Scanner scanner = new Scanner(System.in);

        int numMemberParty;
        String nameTeam1 = "";
        String nameTeam2 = "";
        Party team1 = null;
        Party team2 = null;

        int option;
        do{
            System.out.println("Please, select one option: \n" +
                    "1. Choose 1 to create a full random party \n" +
                    "2. Choose 2 to create a customized party \n" +
                    "3. Choose 3 to import your own CSV file\n");
            option = scanner.nextInt();
        } while (option != 1 && option != 2 && option != 3);


            switch(option){
                case 1:
                    System.out.println("You have chosen to create a full random party");
                    System.out.println("How many players between 1-5 does each team have?");

                    numMemberParty = scanner.nextInt();
                    while (numMemberParty < 1 || numMemberParty > 5){
                        System.out.println("This number isn't valid \n How many players between 1-5 does each team have?");
                        numMemberParty = scanner.nextInt();
                    }

                    // Team 1 -------------------------------------------
                    System.out.println("What do you want your team 1 to be called?");
                    nameTeam1 = scanner.next();
                    System.out.println("The name of the team 1 is: " + nameTeam1);
                    team1 = new RandomParty(numMemberParty, nameTeam1);
                    team1.printParty();
                    //System.out.println("id team 1 ->"+team1.getPartyID());                    ;

                    // Team 2 -------------------------------------------
                    System.out.println(("What do you want your team 2 to be called?"));
                    nameTeam2 = scanner.next();
                    System.out.println("The name of the team 2 is: " + nameTeam2);
                    team2 = new RandomParty(numMemberParty, nameTeam2);
                    team2.printParty();
                    //System.out.println("id team 2 ->"+team2.getPartyID());

                    //scanner.close();
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

                case 3:
                    System.out.println("You have chosen to import you CSV file");
                    System.out.println("Which is your path's file?");
                    String pathFile = scanner.next();
                    System.out.println("What do you want your team 1 to be called?");
                    nameTeam1 = scanner.next();
                    System.out.println("What do you want your team 1 to be called?");
                    nameTeam2 = scanner.next();

                    /*

                    CsvReader lectorCSV = new CsvReader();
                    lectorCSV.readCSV(nameTeam1, nameTeam2, pathFile);*/

                    break;
                default:
                    team1 = new RandomParty(5, "Random Team 1");
                    team2 = new RandomParty(5, "Random Team 2");
                    break;

            }

        System.out.println("Let the battle begin!" );

        /*System.out.println("---------------Team 1 ------------------");
        team1.printParty();
        System.out.println("id team 1 ->"+team1.getPartyID());
        System.out.println("name team 1 ->"+team1.getNameParty());

        System.out.println("---------------Team 2 ------------------");
        team2.printParty();
        System.out.println("id team 2 ->"+team2.getPartyID());
        System.out.println("name team 2 ->"+team2.getNameParty());*/

        System.out.println(team1.getNumMembersParty());
        System.out.println(team2.getNumMembersParty());

        ArrayList<Character> cemetery = new ArrayList<>();

        while(team1.isTeamLive() && team2.isTeamLive()){
            //Scanner scanner = new Scanner(System.in);

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
            System.out.println("Which player of team 2 do you want to fight? Please insert his ID number" );
            int id2 = scanner.nextInt();
            Character character2 = team2.getCharacter(id2);
            while (character2 == null){
                System.out.println("ERROR! ID invalid. Party Team 2 is made up of the following characters");
                team2.printParty();
                System.out.println("Which player of team 2 do you want to fight? Please insert his ID number" );

                id2 = scanner.nextInt();
                character2 = team2.getCharacter(id2);
            }

            int numPelea = 1;
            int numBatalla = 1;

            //Pelea-------------
            while (character1.isAlive() && character2.isAlive()){
                double attack1 = character1.attack();
                double attack2 = character2.attack();

                System.out.println(character1.getName()+" ha atacado con una fuerza de " + attack1 + " puntos a "+
                                character2.getName());
                System.out.println(character2.getName()+" ha atacado con una fuerza de " + attack2 + " puntos a "+
                        character1.getName());

                character1.setHp(character1.getHp()-attack2);
                character2.setHp(character2.getHp()-attack1);
                System.out.println(character1.getName()+" tiene " + character1.getHp() + " HealtPoints.");
                System.out.println(character2.getName()+" tiene "  + character2.getHp() + " HealtPoints.");
                System.out.println("--------END FIGHT N."+numPelea+"-------------");
                numPelea++;
            }

            if (!character1.isAlive() && !character2.isAlive()){
                cemetery.add(character1);
                team1.deleteCharacter(character1);
                cemetery.add(character2);
                team2.deleteCharacter(character2);
                System.out.println(character1.getName()+" and "+character2.getName()+
                        " are dead. Both teams have lost");
            } else if(!character1.isAlive()){
                cemetery.add(character1);
                team1.deleteCharacter(character1);
                System.out.println(character1.getName()+" is dead. Team 1 has lost :( \n"
                        + nameTeam2 +" is the winner of this battle!");
            } else if(!character2.isAlive()){
                cemetery.add(character2);
                team2.deleteCharacter(character2);
                System.out.println(character1.getName()+" is dead. Team 2 has lost :( \n"
                        + nameTeam1 +" is the winner of this battle!");
            }
            System.out.println("* * * * * * * * * * * END OF BATTLE "+numBatalla+"* * * * * * * * * * *\n");
            System.out.println("Team 1 is alive? "+ team1.isTeamLive() + ". Number of member: "+ team1.getNumMembersParty());
            System.out.println("team 2 is alive? "+ team2.isTeamLive()+ ". Number of member: "+ team2.getNumMembersParty());
            System.out.println("\n ✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟ Cemetery ✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟ :" );
            cemetery.forEach(System.out::println);
            numBatalla++;

        }

        scanner.close();
        System.out.println("* * * * * * * * * * * GAME OVER * * * * * * * * * * *\n");

    }



}

