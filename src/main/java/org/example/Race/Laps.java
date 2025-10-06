package org.example.Race;

import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Laps extends Race {

    public void eachLap(){

        for (int lap = 1; lap <=lapsPerRound ; lap++) {
            System.out.println("lap " + lap + "av " + lapsPerRound);

            while (!finishLap()){
                for (Racers r : racers) {
                    if (r.getCarHealth()>0 && r.getLapleft()<lapDistance){
                        int carHealth = r.getCarHealth()/100;
                        int progress = r.getSpeed()+carHealth;
                        r.addLap(progress);
                    }
                }
            }
            box();

            for (Racers r : racers) {
                r.resetLap();
            }
            }
            Settings.slowdownText();


        }

    public boolean finishLap(){
        for (int i = 0; i <racers.size() ; i++) {
            Racers racer = racers.get(i);
            if(racer.getLapleft() >= lapDistance){
                return  true;
            }
        }
        return false;
    }
    public void lapResult(int round){
        ArrayList<Racers> list = new ArrayList<>(racers);
        list.sort(Comparator.comparing(Racers::getLapleft).reversed());

        System.out.println("Round: " + round + " resultat:");
        for (int i = 0; i <racers.size() ; i++) {
            Racers racer = racers.get(i);
            System.out.printf("%d. %-20s Progress: %d/%d | Health: %d | Speed: %d\n", i+1, racer.getName(),
                    racer.getSpeed(),  lapDistance,
                    racer.getLapleft(), racer.getCarHealth(), racer.getSpeed());
        }
    }
    public void pointsforRounds () {
        ArrayList<Racers> list = new ArrayList<>(racers);
        list.sort(Comparator.comparing(Racers::getLapleft).reversed());

        int[] points = {10, 8, 6, 4, 2};

        System.out.println("Poäng för rundan: ");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).addPoints(points[i]);
            System.out.printf("%d. %-20s +%d poäng\n", i + 1, racers.get(i).getName() , points[i]);
        }
    }

    }



