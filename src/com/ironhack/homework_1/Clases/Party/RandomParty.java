package com.ironhack.homework_1.Clases.Party;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Properties.RandomProperties;

public class RandomParty extends Party{
    public RandomParty(int numMembersParty) {
        super(numMembersParty);
        numWarriorsMax = (int)(Math.random()*numMembersParty);
        numWizardsMax = numMembersParty - numWarriorsMax;

        for(int i=0; i<numWarriorsMax; i++){
            Warrior warrior = RandomProperties.createRandomWarrior();
            System.out.println("Warrior pepe");
        }

        for(int i=0; i<numWizardsMax; i++){
            Wizard wizard = RandomProperties.createRandomWizard();
            System.out.println("wizard juan");
        }

        //Ahora queremos guardar a estos personajes a la lista
    }


}
