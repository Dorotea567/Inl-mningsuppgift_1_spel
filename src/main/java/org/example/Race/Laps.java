package org.example.Race;

import org.example.Racers.OtherRacers;
import org.example.Racers.Racer1;
import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.Random;

public class Laps extends Race {
    int randomRacer1 = new Random().nextInt(3);
    int randomOtherRacers = new Random().nextInt(3);

    public void racer1box() {
        System.out.println("You found a box");
        switch (randomRacer1) {
            case 0:
                racer1.speedBoost(Settings.randomBoost());
                break;
            case 1:
                racer1.coinsCollected(10);
                break;
                case 2:
                    racer1.speedSlowdown(Settings.randomSlowdown());
                    break;
        }
    }
    public void otherplayerbox() {
        switch (randomOtherRacers) {
            case 0:
                otherRacers.speedBoost(Settings.randomBoost());
                break;
                case 1:
                    otherRacers.speedSlowdown(Settings.randomSlowdown());
                    break;
        }
    }

    @Override
    public void laps() {
        racer1 = new Racer1("Dorotea");
        otherRacers = new OtherRacers("Players");
        for (int laps = 1; laps < lapsPerRound ; laps ++) {
            System.out.println("Det är " + laps + " lap");

            racer1box();
            otherplayerbox();
            otherRacers.carHealthDamage();
            racer1.carHealthDamage();
            for (Racers racers: allRacers) {
                racers.resetLap();
                }
            }

        }
    }


