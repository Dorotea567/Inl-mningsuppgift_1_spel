package org.example.settings;

import org.example.Race.TheRace;

import java.util.Scanner;

public class Options {
    private Scanner scanner = new Scanner(System.in);
    String number;
    int tal;

    public int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Skriv ett heltal");
            scanner.next();
        }
        tal = scanner.nextInt();
        return tal;
    }
    public void huvudmeny (){
        System.out.println("-- Välkommen --");
        System.out.println("[1] Spela spelet ");
        System.out.println("[2] Shop ");
        System.out.println("[3] Avsluta spelet ");
        System.out.println("--- Välj ---");

        kontroll();

    }
    public void kontroll (){
        readInt();
        if (tal==1){
            TheRace theRace = new TheRace();
            theRace.starRace();
        }
        else if (tal==2){

        }
        else if (tal==3){
            System.out.println("Avsluta spel");
        }
        }
    }

