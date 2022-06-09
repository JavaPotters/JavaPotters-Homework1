package com.ironhack.homework_1.Clases.Party;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;

import java.util.ArrayList;
import java.util.List;

public abstract class Party {

    private int numMembersParty;
    private static List<Character> listCharacter;
    private String nameParty;
    private boolean teamLive;
    private int partyID;

    public Party(int numMembersParty, String nameParty) {
        this.partyID = (int) (Math.random()*100);
        this.numMembersParty = numMembersParty;
        this.nameParty = nameParty;
        this.listCharacter = new ArrayList<Character>();
        if(numMembersParty>=0){
            setTeamLive(true);
        }
    }

    public void addWizard(Wizard wizard){
        if(this.listCharacter.size()< numMembersParty){
            this.listCharacter.add(wizard);
            numMembersParty++;
        }
        else {
            System.out.println("Party llena");
        }
    }

    public void addWarrior(Warrior warrior){
        if(this.listCharacter.size()< numMembersParty){
            this.listCharacter.add(warrior);
            numMembersParty++;
        }
        else {
            System.out.println("Party llena");
        }
    }

    public void deleteCharacter(Character character){
        if(this.listCharacter.size()< numMembersParty){
            this.listCharacter.remove(character);
            numMembersParty--;
            if(numMembersParty<=0){
                setTeamLive(false);
            }
        }
        else {
            System.out.println("Party llena");
        }
    }

    public void printParty(){
        for(Character i: this.listCharacter){
            i.toString();
        }
    }

    public Character getCharacter(int id) {
        for(Character character: this.listCharacter){
            if(id == character.getId()){
                System.out.println("The chosen character is:");
                System.out.println(character);
                return character;
            }
        } return null;
    }
    public boolean isTeamLive() {
        return teamLive;
    }

    public void setTeamLive(boolean teamLive) {
        this.teamLive = teamLive;
    }
    public String getNameParty() {
        return nameParty;
    }

    public void setNameParty(String nameParty) {
        this.nameParty = nameParty;
    }

    public int getPartyID() {
        return partyID;
    }

    public void setPartyID(int partyID) {
        this.partyID = partyID;
    }

    public Party(String nameParty) {
        this.nameParty = nameParty;
    }
}
