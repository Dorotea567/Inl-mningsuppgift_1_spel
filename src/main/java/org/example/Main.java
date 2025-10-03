package org.example;

import org.example.Race.Laps;
import org.example.Racers.OtherRacers;
import org.example.Racers.Racer1;
public class Main {
    public static void main(String[] args) {
        testName();

    }


    static void testName() {
        Racer1 racer1 = new Racer1();
        racer1.setRacer1Name();
        OtherRacers otherRacers = new OtherRacers();
        otherRacers.setPlayersName();
    }
    static void testRacer() {
        Racer1 racer1 = new Racer1();
        racer1.setRacer1Name();
        OtherRacers otherRacers = new OtherRacers();
        otherRacers.setPlayersName();
        Laps laps = new Laps();
        laps.startRacer1();




    }
}
