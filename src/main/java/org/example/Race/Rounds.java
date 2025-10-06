package org.example.Race;

import org.example.Race.Laps;
import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.*;

public class Rounds extends Laps {

    public void eachRounds() {
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("---------------------------------------");
            System.out.println("Rounds: " + round + " av " + totalRounds);
            System.out.println("---------------------------------------");
            eachLap();
            for (Racers r : racers) {
                r.carHealthDamage(Settings.damageRandom());
            }
            lapResult(round);
            pointsforRounds();

            for (Racers r : racers) {
                r.roundNew();
                r.addCoins(Settings.coinsRandom());
            }
            if (round < totalRounds) {
                System.out.println("-----------------------------");
                System.out.println("Tryck Enter för nästa runda: ");
                System.out.println("-----------------------------");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
            }
        }
        }
    }


