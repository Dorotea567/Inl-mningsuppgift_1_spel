package org.example.Race;

import org.example.Racers.OtherRacers;
import org.example.Racers.Racer1;
import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Race {
    protected Racer1 racer1;
    protected OtherRacers otherRacers;
    protected ArrayList<Racers> allRacers;
    protected int totalRounds = 6;
    protected int lapsPerRound = 4;
    protected int lapDistance = 2000;

    public Race(){
        allRacers = new ArrayList<>();
    }
    public void allracersInfo(){
        allRacers.add(new Racer1("Racer 1"));
        allRacers.add(new OtherRacers("Racer 2"));
        allRacers.add(new OtherRacers("Racer 3"));
        allRacers.add(new OtherRacers("Racer 4"));
        allRacers.add(new OtherRacers("Racer 5"));
    }
    public abstract void laps();

}
