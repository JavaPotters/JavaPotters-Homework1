package com.ironhack.homework_1.main.Clases;

import java.util.Scanner;

public class CustomizedParty extends Party {


    public CustomizedParty(int numMembersParty) {
        super(numMembersParty);
        numWarriorsMax = 5;
        numWizardsMax = numMembersParty - numWarriorsMax;
    }

    public void addWizard(Wizard wizard){
        wizards.add(wizard);
        numWizardsCurrent ++;
    }

    public void addWarrior(Warrior warrior){
        warriors.add(warrior);
        numWarriorsCurrent ++;
    }




}
