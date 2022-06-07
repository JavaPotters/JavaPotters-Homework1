package com.ironhack.homework_1.Clases.Party;

import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

import java.util.ArrayList;
import java.util.List;

public abstract class Party {

    int numMembersParty;
    protected static List<Character> party1 = new ArrayList<Character>();
    protected static List<Character> party2 = new ArrayList<Character>();
    int numWarriorsMax;
    int numWizardsMax;
    int numWarriorsCurrent = 0;
    int numWizardsCurrent = 0;

    public Party(int numWarriorsMax, int numWizardsMax, int numWarriorsCurrent, int numWizardsCurrent) {
        this.numWarriorsMax = numWarriorsMax;
        this.numWizardsMax = numWizardsMax;
        this.numWarriorsCurrent = numWarriorsCurrent;
        this.numWizardsCurrent = numWizardsCurrent;
    }

    public Party(List<Wizard> wizards, List<Warrior> warriors) {
        this.wizards = wizards;
        this.warriors = warriors;
    }


    public Party(int numMembersParty) {
        this.numMembersParty = numMembersParty;
    }


}
