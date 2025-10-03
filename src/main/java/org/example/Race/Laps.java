package org.example.Race;

import org.example.Racers.OtherRacers;
import org.example.Racers.Racer1;
import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.ArrayList;
import java.util.Comparator;
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
    public void lapResultat(int lapResultat) {
        ArrayList<Racers> ställning = new ArrayList<>();
        ställning.sort(Comparator.comparing(Racers::getLapleft).reversed());

        System.out.println("Lap Resultat: " + lapResultat);
        for (int i = 0; i < ställning.size(); i++) {
            Racers r = ställning.get(i);
            System.out.println(r.getName() + " "+ r.getLapleft() + " Carhealth: " + r.getCarHealth() + "speed: " + r.getSpeed());

        }
    }

    @Override
    public void laps() {
        for (int laps = 1; laps <= lapsPerRound ; laps ++) {
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


