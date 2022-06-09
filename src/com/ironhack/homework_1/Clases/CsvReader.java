package com.ironhack.homework_1.Clases;

import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CsvReader {

    public void readCSV() {
        ArrayList<ArrayList<String>> characterList = new ArrayList<ArrayList<String>>();
        StringBuilder sb = new StringBuilder();
        Path filePath = Paths.get("/Users/sofiadelafuente/Desktop/java-bootcamp/unit1/JavaPotters-Homework1/src/com/ironhack/homework_1/characters.csv");
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
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

