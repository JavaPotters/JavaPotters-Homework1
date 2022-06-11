package com.ironhack.homework_1.Clases.Game;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Properties.CsvReader;
import com.ironhack.homework_1.Clases.Party.CustomizedParty;
import com.ironhack.homework_1.Clases.Party.Party;
import com.ironhack.homework_1.Clases.Party.RandomParty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.ironhack.homework_1.Clases.Properties.CustomizedProperties.createCustomizedWarrior;
import static com.ironhack.homework_1.Clases.Properties.CustomizedProperties.createCustomizedWizard;

public class Game {

    private int numMemberParty;
    private String nameTeam1 = "";
    private String nameTeam2 = "";
    private Party team1 = null;
    private Party team2 = null;

    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void play() throws IOException {
        // Let's start!
        System.out.println(" * * * * * * * Welcome to the JavaPotters Role Playing Game * * * * * * *\n");

        menuCreateParties();
        startBattle();

        System.out.println("* * * * * * * * * * * GAME OVER * * * * * * * * * * *\n");
    }

    private void menuCreateParties() throws IOException {

        // Choose an option to create a party, random, custom o from CSV
        int option;
        do{
            System.out.println("Please, select one option: \n" +
                    "1. Choose 1 to create a full random party \n" +
                    "2. Choose 2 to create a customized party \n" +
                    "3. Choose 3 to import your own CSV file\n");
            option = scanner.nextInt();
        } while (option != 1 && option != 2 && option != 3);

        // Switch depends on option chosen
        switch(option){
            case 1:
                System.out.println("You have chosen to create a full random party");
                System.out.println("How many players between 1-5 does each team have?");

                //write num members
                numMemberParty = scanner.nextInt();
                while (numMemberParty < 1 || numMemberParty > 5){
                    System.out.println("This number isn't valid \n How many players between 1-5 does each team have?");
                    numMemberParty = scanner.nextInt();
                }

                // Team 1 -------------------------------------------
                System.out.println("\nWhat do you want your team 1 to be called?");
                nameTeam1 = scanner.next();
                System.out.println("The name of the team 1 is: " + nameTeam1);
                team1 = new RandomParty(numMemberParty, nameTeam1);
                team1.printParty();
                //System.out.println("id team 1 ->"+team1.getPartyID());                    ;

                // Team 2 -------------------------------------------
                System.out.println(("\nWhat do you want your team 2 to be called?"));
                nameTeam2 = scanner.next();
                System.out.println("The name of the team 2 is: " + nameTeam2);
                team2 = new RandomParty(numMemberParty, nameTeam2);
                team2.printParty();
                break;

            case 2:
                //write num members
                System.out.println("You have chosen to create your own custom party");
                System.out.println("How many players between 1-5 does each team have?");
                numMemberParty = scanner.nextInt();
                while (numMemberParty < 0 || numMemberParty > 5){
                    System.out.println("This number isn't valid \n How many players between 1-5 does each team have?");
                    numMemberParty = scanner.nextInt();
                }

                // Team 1 -------------------------------------------
                System.out.println("\nWhat do you want your team 1 to be called?");
                nameTeam1 = scanner.next();
                System.out.println("The name of the team 1 is: " + nameTeam1);
                team1 = new CustomizedParty(numMemberParty, nameTeam1);

                //For num member chosen, create a character for team 1
                for(int i = 1; i <= numMemberParty; i++){

                    //Choose between wizard and warrior
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Please select: \n" +
                            "1. If you want to create a wizard \n" +
                            "2. If you want to create a warrior \n");
                    option = scanner2.nextInt();
                    while (option != 1 && option != 2){ //validation input
                        System.out.println("Invalid number");
                        System.out.println("Please select: \n" +
                                "1. If you want to create a wizard \n" +
                                "2. If you want to create a warrior \n");
                        option = scanner2.nextInt();

                        //Switch depends on option create wizard o warrior
                    }switch(option){
                        //Create wizard
                        case 1:
                            System.out.println("Creating a wizard...");
                            Character wizard = createCustomizedWizard();
                            team1.addWizard((Wizard) wizard);
                            System.out.println("Wizard successfully created!");
                            break;

                        //Create warrior
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
                System.out.println("\nWhat do you want your team 2 to be called?");
                nameTeam2 = scanner.next();
                System.out.println("The name of the team 2 is: " + nameTeam2);
                team2 = new CustomizedParty(numMemberParty, nameTeam2);

                //For num member chosen, create a character for team 2
                for(int i = 1; i <= numMemberParty; i++){
                    //Choose between wizard and warrior
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
                        //Create wizard
                        case 1:
                            System.out.println("Creating a wizard...");
                            Character wizard = createCustomizedWizard();
                            team2.addWizard((Wizard) wizard);
                            System.out.println("Wizard successfully created!");
                            break;

                        //Create warrior
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

                //Create a csv reader
                CsvReader lectorCSV = new CsvReader();

                // Write names teams
                System.out.println("What do you want your team 1 to be called?");
                nameTeam1 = scanner.next();
                System.out.println("What do you want your team 2 to be called?");
                nameTeam2 = scanner.next();

                // Create parties from CSV
                lectorCSV.createParties(nameTeam1, nameTeam2);

                System.out.println("The "+nameTeam1+" team's party has been successfully created");
                team1 = lectorCSV.getParty1();
                team1.printParty();

                System.out.println("\nThe "+nameTeam2+" team's party has been successfully created");
                team2 = lectorCSV.getParty2();
                team2.printParty();
                break;

        }
    }

    private void startBattle(){
        System.out.println("\nLet the battle begin!" );

        // Create array list cementery
        ArrayList<Character> cemetery = new ArrayList<>();

        //While at least one team is alive
        while(team1.isTeamLive() && team2.isTeamLive()){

            // Team 1 choose a character---------------------------------------
            System.out.println("\nWhich player of team 1 do you want to fight? Please insert his ID number" );
            int id1 = scanner.nextInt();
            Character character1 = team1.getCharacter(id1);
            //Validation input
            while (character1 == null){
                System.out.println("ERROR! ID invalid. Party Team 1 is made up of the following characters");
                team1.printParty();
                System.out.println("\nWhich player of team 1 do you want to fight? Please insert his ID number" );

                id1 = scanner.nextInt();
                character1 = team1.getCharacter(id1);
            }

            // Team 2 choose a character---------------------------------------
            System.out.println("Which player of team 2 do you want to fight? Please insert his ID number" );
            int id2 = scanner.nextInt();
            Character character2 = team2.getCharacter(id2);
            //Validation input
            while (character2 == null){
                System.out.println("ERROR! ID invalid. Party Team 2 is made up of the following characters");
                team2.printParty();
                System.out.println("\nWhich player of team 2 do you want to fight? Please insert his ID number" );

                id2 = scanner.nextInt();
                character2 = team2.getCharacter(id2);
            }

            //Count number fight
            int numPelea = 1;
            int numBatalla = 1;

            // Battle -----------------------------
            // While at least one character is alive
            while (character1.isAlive() && character2.isAlive()){
                // get attack
                double attack1 = character1.attack();
                double attack2 = character2.attack();

                // print attack
                System.out.println(character1.getName()+ " has attacked " + character2.getName() + " with a strength of " + attack1);
                System.out.println(character2.getName()+ " has attacked " + character1.getName() + " with a strength of " + attack2 );

                // less healt points depends on attack
                character1.setHp(character1.getHp()-attack2);
                character2.setHp(character2.getHp()-attack1);

                //print conditions
                System.out.println(character1.getName()+" has " + character1.getHp() + " Health Points.");
                System.out.println(character2.getName()+" has "  + character2.getHp() + " Health Points.");
                System.out.println("--------END FIGHT N."+numPelea+"-------------\n");
                numPelea++;
            }

            // print who is dead
            if (!character1.isAlive() && !character2.isAlive()){ // if both dead
                cemetery.add(character1);
                team1.deleteCharacter(character1);
                cemetery.add(character2);
                team2.deleteCharacter(character2);
                System.out.println(character1.getName()+" and "+character2.getName()+
                        " are dead. Both teams have lost");
            } else if(!character1.isAlive()){ //if character one dead
                cemetery.add(character1);
                team1.deleteCharacter(character1);
                System.out.println(character1.getName()+" is dead. Team 1 has lost :( \n Team 2 "
                        + nameTeam2 +" is the winner of this battle!");
            } else if(!character2.isAlive()){//if character two dead
                cemetery.add(character2);
                team2.deleteCharacter(character2);
                System.out.println(character2.getName()+" is dead. Team 2 has lost :( \n Team 1 "
                        + nameTeam1 +" is the winner of this battle!");
            }
            System.out.println("* * * * * * * * * * * END OF BATTLE "+numBatalla+"* * * * * * * * * * *\n");
            System.out.println(team1.getNameParty()+ " is alive? "+ team1.isTeamLive() +
                    ". Number of member team 1: "+ team1.getNumMembersParty());
            System.out.println(team2.getNameParty()+ " is alive? "+ team2.isTeamLive()+
                    ". Number of member team 2: "+ team2.getNumMembersParty());
            System.out.println("\n ✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟ Cemetery ✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟✟ :" );
            cemetery.forEach(System.out::print);
            numBatalla++;

        }
        scanner.close();
        // print who is the champion
        if(team1.isTeamLive()){
            System.out.println("\nCONGRATULATIONS!!! TEAM 1 "+ team1.getNameParty()+" IS THE CHAMPION");
        } else if (team2.isTeamLive()) {
            System.out.println("\nCONGRATULATIONS!!! TEAM 2 "+ team2.getNameParty()+" IS THE CHAMPION");
        }


    }
}
