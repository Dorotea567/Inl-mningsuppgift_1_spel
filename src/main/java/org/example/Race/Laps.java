package org.example.Race;

import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Laps extends Race {

    public void eachLap() {

        for (int lap = 1; lap <= lapsPerRound; lap++) {
            System.out.println("lap " + lap + "av " + lapsPerRound);
            Settings.slowdownText();

            while (!finishLap()) {
                for (Racers r : racers) {
                    r.increaseSpeed();
                    if (r.getCarHealth() > 0 && r.getLapleft() < lapDistance) {
                        int carHealth = r.getCarHealth() / 100;
                        int progress = r.getSpeed() + carHealth;
                        r.addLap(progress);
                    }
                }
            }
            box();

            for (Racers r : racers) {
                r.resetLap();
            }
        }
    }


    public boolean finishLap() {
        for (int i = 0; i < racers.size(); i++) {
            Racers racer = racers.get(i);
            if (racer.getLapleft() >= lapDistance) {
                return true;
            }
        }
        return false;
    }

    public void lapResult(int round) {
        ArrayList<Racers> list = new ArrayList<>(racers);
        list.sort(Comparator.comparing(Racers::getSpeed).reversed());

        System.out.println("Round: " + round + " resultat:");
        for (int i = 0; i < racers.size(); i++) {
            Racers racer = racers.get(i);
            System.out.println(racer.getName() +
                    " Speed: " + racer.getSpeed() +
                    racer.getLapleft() + " CarHealth: " +
                    racer.getCarHealth());
        }
    }

    public void pointsforRounds() {
        ArrayList<Racers> list = new ArrayList<>(racers);
        list.sort(Comparator.comparing(Racers::getSpeed).reversed());

        int[] points = {10, 8, 6, 4, 2};

        System.out.println("Poäng för rundan: ");
        for  (int i = 0; i < list.size(); i++) {
            Racers racer = list.get(i);
            int point = (i< points.length) ? points[i] : 1;
            racer.addPoints(point);
            System.out.println(racer.getName() + " fick: " + point);
        }
    }
}

/*
                System.out.println("Poäng för rundan: ");
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).addPoints(points[i]);
                    System.out.println(racers.get(i).getName() + "points: " + points[i]);
                }

            }

 */







