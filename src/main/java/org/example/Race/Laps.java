package org.example.Race;

import org.example.Racers.Racer1;
import org.example.settings.Settings;

public class Laps extends Race {
    @Override
    public void startRacer1() {
        System.out.println("Starting Racer 1");

        int laps = 1;
        int maxLaps =3;

        while (racer1.carIsFunctional() && racers.carIsFunctional()) {
            System.out.println("Lap" + laps);

            racer1.speedBoost(Settings.randomBoost());
            for (int i = 1; i < otherRacers.length ; i++) {
                otherRacers[i].speedBoost(Settings.randomBoost());
            }

            racer1.speedSlowdown(Settings.randomSlowdown());
            for (int i = 1; i < otherRacers.length ; i++) {
                otherRacers[i].speedSlowdown(Settings.randomSlowdown());
            }

            racer1.carHealthDamage();
            for (int i = 1; i < otherRacers.length ; i++) {
                otherRacers[i].carHealthDamage();
            }

            laps++;
            if (laps > maxLaps) {
                break;
            }

        }
    }
    }
