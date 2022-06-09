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

    public void readCSV(String team1Name, String team2Name, String path) throws IOException {

        Party team1 = new CSVParty(team1Name);
        Party team2 = new CSVParty(team2Name);

        ArrayList<ArrayList<String>> characterList = new ArrayList<ArrayList<String>>();
        StringBuilder sb = new StringBuilder();

        Path filePath;
        filePath = Paths.get("src/com/ironhack/homework_1/characters.csv");

        Scanner scanner = new Scanner(filePath);
        int count = 0;
        while (scanner.hasNext()) {
            count++;
            scanner.nextLine();
        }
        scanner.close();
        int partyCounter = 0;
        int partySize = count/2;

        try (BufferedReader br = Files.newBufferedReader(filePath)) {
            String line = br.readLine();
            while (line != null) {
                String[] lineData = line.split(";");

                if (lineData[0].equals("Warrior")) {
                    Warrior warrior = new Warrior(Integer.parseInt(lineData[1]), lineData[2],
                            Integer.parseInt(lineData[3]), Boolean.parseBoolean(lineData[4]),
                            Double.parseDouble(lineData[5]), Double.parseDouble(lineData[6]));
                    System.out.println(warrior + "\n");
                } else if (lineData[0].equals("Wizard")) {
                    Wizard wizard = new Wizard(Integer.parseInt(lineData[1]), lineData[2],
                            Integer.parseInt(lineData[3]), Boolean.parseBoolean(lineData[4]),
                            Double.parseDouble(lineData[5]), Double.parseDouble(lineData[6]));
                    System.out.println(wizard + "\n");
                }

                ArrayList<String> temporalData = new ArrayList<String>();
                for (String data : lineData) {
                    temporalData.add(data);
                }
                characterList.add(temporalData);
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

                partyCounter++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

