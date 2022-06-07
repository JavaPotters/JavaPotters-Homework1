package com.ironhack.homework_1.Clases.Party;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Properties.RandomProperties;

public class RandomParty extends Party{
    public RandomParty(int numMembersParty, String nameTeam) {
        super(numMembersParty, nameTeam);
        int numWarriorsMax = (int)(Math.random()*numMembersParty);
        int numWizardsMax = numMembersParty - numWarriorsMax;

        for(int i=0; i<numWarriorsMax; i++){
            Warrior warrior = RandomProperties.createRandomWarrior();
            //System.out.println("Warrior pepe");
            addWarrior(warrior);
            warrior.toString();
        }

        for(int i=0; i<numWizardsMax; i++){
            Wizard wizard = RandomProperties.createRandomWizard();
            //System.out.println("wizard juan");
            addWizard(wizard);
            wizard.toString();
        }

        //Ahora queremos guardar a estos personajes a la lista
    }


}
