package org.example.Race;

import org.example.Racers.OtherRacers;
import org.example.Racers.Racer1;
import org.example.Racers.Racers;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Race {
    protected Racer1 racer1;
    protected String racer1name;
    protected OtherRacers otherRacers;
    protected ArrayList<Racers> allRacers;
    protected int totalRounds = 5;
    protected int lapsPerRound = 3;
    protected int lapDistance = 2000;

    public Race(){
        allRacers = new ArrayList<>();
    }
    public void setRacer1Name(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv vad du vill kalla Racer: ");
        racer1name = scanner.nextLine();
    }

    public void allracersName(){
        allRacers.add(new Racer1(racer1name));
        allRacers.add(new OtherRacers("Racer 2"));
        allRacers.add(new OtherRacers("Racer 3"));
        allRacers.add(new OtherRacers("Racer 4"));
        allRacers.add(new OtherRacers("Racer 5"));
    }
    public abstract void laps();

}
