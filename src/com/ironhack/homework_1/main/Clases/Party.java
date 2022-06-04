package com.ironhack.homework_1.main.Clases;

import java.util.ArrayList;
import java.util.List;

public abstract class Party {

    int numMembersParty;
    protected static List<Wizard> wizards = new ArrayList<Wizard>();
    protected static List<Warrior> warriors = new ArrayList<Warrior>();
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
