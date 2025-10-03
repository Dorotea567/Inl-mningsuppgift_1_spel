package org.example.Racers;

import org.example.Race.Laps;
import org.example.settings.Settings;

public class Rounds extends Laps {

    public void rounds() {
        for (int rounds = 1; rounds <= totalRounds; rounds++) {
            laps();
            System.out.println("Round " + rounds);
            racer1.racerInfo();
            otherRacers.racerInfo();
            Settings.slowdownText();
            for (Racers racers: allRacers) {
                racers.roundNew();
            }
        }
    }
    public void carDead(){

    }
}
