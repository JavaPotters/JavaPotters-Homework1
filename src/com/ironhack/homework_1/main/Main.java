package com.ironhack.homework_1.main;

import com.ironhack.homework_1.Clases.Character.Character;
import com.ironhack.homework_1.Clases.Character.Warrior;
import com.ironhack.homework_1.Clases.Character.Wizard;
import com.ironhack.homework_1.Clases.Party.CustomizedParty;
import com.ironhack.homework_1.Clases.Party.RandomParty;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.ironhack.homework_1.Clases.Properties.CustomizedProperties.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do{
            System.out.println("Por favor seleccionar: \n" +
                    "1. Si quieres una full party random \n" +
                    "2. Si crear tu propio personaje \n");
            option = scanner.nextInt();
        } while (option != 1 && option != 2);

            switch(option){
                case 1:
                    System.out.println("Has elegido crear una full party random");

                    System.out.println("Cuantos jugadores entre 1-5 tiene cada equipo?");
                    int numMemberParty = scanner.nextInt();
                    while (0>numMemberParty || numMemberParty>5){
                        System.out.println("Ese numero no es valido \n Cuantos jugadores entre 1-5 tiene cada equipo?");
                        numMemberParty = scanner.nextInt();
                }

                    RandomParty teamRandom1 = new RandomParty(numMemberParty);
                    RandomParty teamRandom2 = new RandomParty(numMemberParty);
                    break;

                case 2:
                    System.out.println("Has elegido crear tu personaje");

                    do{
                        System.out.println("Cuantos jugadores entre 1-5 tiene cada equipo?");

                        System.out.println("Ese numero no es valido \n Cuantos jugadores entre 1-5 tiene cada equipo?");
                        numMemberParty = scanner.nextInt();
                    } while (0>numMemberParty || numMemberParty>6);

                    CustomizedParty teamCustomized1 = new CustomizedParty(numMemberParty);
                    CustomizedParty teamCustomized2 = new CustomizedParty(numMemberParty);

                    do{
                        System.out.println("Por favor seleccionar: \n" +
                                "1. Si quieres crear un Wizard \n" +
                                "2. Si quieres crear un Warrior \n" +
                                "3.  Ya no quiero mas personajes");
                        option = scanner.nextInt();
                    } while (option == 1 || option == 2);
                        switch(option){
                            case 1:
                                System.out.println("Creando un mago");
                                Character wizard = createCustomizedWizard();
                                teamCustomized1.addWizard((Wizard) wizard);
                                break;
                            case 2:
                                System.out.println("Creando un guerrero");
                                Character warrior = createCustomizedWarrior();
                                teamCustomized1.addWarrior((Warrior) warrior);
                                break;
                            case 3:
                                System.out.println("Tu equipo esta completo");
                                System.out.println("Los jugadores de tu equipo son:" + "");
                                break;
                            default:
                                System.out.println("Opcion erronea");
                        }
                    ///
                    break;
                default:
                    System.out.println("Opcion erronea");
            }
        List <Character> listaTotal = new ArrayList<>();
            /*5/6 hemos realizado: listas para guardar personajes y para que aparezca por pantalla los personajes y sus atributos
              Que queremos hacer proximamente: que el usuario cree el equipo 1 (elige si quiere equipo personalizado o random)
              y el equipo 2 se crea por el ordenador de forma random
        * */

        /*List<Character> listaGeneral = new ArrayList<>();
            listaGeneral.add(createCustomizedWarrior());
            listaGeneral.add(createCustomizedWizard());

        for(int i = 0; i < listaGeneral.size(); i++) {
            System.out.println(listaGeneral.get(i));
        }*/
       /* List<Character> listaEquipo2 = new ArrayList<>();
        for (Character jugador : listaEquipo2) {
            if (!ListaGeneral.contains(jugador)) {
                newList.add(element);
            }
        }
        System.out.println(newList);

        List<String> listaEquipo2 = new ArrayList<>();
        listaEquipo2 = listaEquipo1 ;*/


            int ordenPersonajes;
        System.out.println("Que comience la batalla \n ¿Qué jugador quieres que luche en primer lugar?" );
        ordenPersonajes = scanner.nextInt();


        scanner.close();
    }


}

