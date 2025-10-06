package org.example.Race;

import org.example.Race.Laps;
import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.*;

public class Rounds extends Laps {

    public void eachRounds() {
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Rounds: " + round + " av " + totalRounds);
            eachLap();
            for (Racers r : racers) {
                r.carHealthDamage();
            }
            lapResult(round);
            pointsforRounds();
            if (round < totalRounds) {
                System.out.println("Tryck Enter för nästa runda: ");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
            }
        }
        }
    }


