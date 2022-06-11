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
            this.addWarrior(warrior);
        }

        for(int i=0; i<numWizardsMax; i++){
            Wizard wizard = RandomProperties.createRandomWizard();
            this.addWizard(wizard);
        }
        System.out.println("Random party successfully created");

    }


}
