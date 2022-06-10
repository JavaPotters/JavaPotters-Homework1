package com.ironhack.homework_1.Clases;

import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Party.CSVParty;
import com.ironhack.homework_1.Clases.Party.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReader {
    private Party team1;
    private Party team2;
    private StringBuilder sb;
    private Path filePath;
    private Scanner scanner;
    private int partySize;
    private int partyCounter;
    //public CsvReader(String path) throws IOException {
    public CsvReader() throws IOException {

        sb = new StringBuilder();

        filePath = Paths.get("src/com/ironhack/homework_1/characters.csv");


        scanner = new Scanner(filePath);
        int count = 0;
        while (scanner.hasNext()) {
            count++;
            scanner.nextLine();
        }
        scanner.close();

        partyCounter = 0;
        partySize = count/2;
    }

    public void createParties(String team1Name, String team2Name) throws IOException {
        team1 = new CSVParty(partySize, team1Name);
        team2 = new CSVParty(partySize, team2Name);

        try (BufferedReader br = Files.newBufferedReader(filePath)) {
            String line = br.readLine();
            while (line != null) {
                String[] lineData = line.split(";");

                if (lineData[0].equals("Warrior")) {
                    Warrior warrior = new Warrior(Integer.parseInt(lineData[1]), lineData[2],
                            Integer.parseInt(lineData[3]), Boolean.parseBoolean(lineData[4]),
                            Double.parseDouble(lineData[5]), Double.parseDouble(lineData[6]));

                    if(partyCounter < partySize){
                        team1.addWarrior(warrior);
                    } else {
                        team2.addWarrior(warrior);
                    }
                    partyCounter++;
                }
                else if (lineData[0].equals("Wizard")) {
                    Wizard wizard = new Wizard(Integer.parseInt(lineData[1]), lineData[2],
                            Integer.parseInt(lineData[3]), Boolean.parseBoolean(lineData[4]),
                            Double.parseDouble(lineData[5]), Double.parseDouble(lineData[6]));

                    if(partyCounter < partySize){
                        team1.addWizard(wizard);
                    } else {
                        team2.addWizard(wizard);
                    }
                    partyCounter++;
                }

                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Party getParty1(){
        return team1;
    }
    public Party getParty2(){
        return team2;
    }

}

