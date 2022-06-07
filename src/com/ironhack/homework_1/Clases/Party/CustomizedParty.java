package com.ironhack.homework_1.Clases.Party;

import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

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
