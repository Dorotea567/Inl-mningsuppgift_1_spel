package org.example.settings;

import org.example.Race.TheRace;

import java.util.Scanner;

public class Options {
    private Scanner scanner = new Scanner(System.in);
    int tal;

    public int readInt() {
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
    public void kontroll () {
        readInt();
        switch (tal) {
            case 1:
                TheRace theRace = new TheRace();
                theRace.starRace();
                break;
            case 2:
                Shop shop = new Shop();
                shop.shop1();
                break;
            case 3:
                System.out.println("Spel avslutat");
                break;
            default:
                System.out.println("Ange ett av talen");
                break;
        }
    }
    }

