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
            lap++;
            if(lap == lapsPerRound) {
                break;
            }
            for (Racers r : racers) {
                r.resetLap();
            }
            lapResult(lap);
            Settings.slowdownText();


        }
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
    public void lapResult(int lap){
        ArrayList<Racers> racers = new ArrayList<Racers>();
        racers.sort(Comparator.comparing(Racers::getLapleft).reversed());

        System.out.println("Lap: " + lap + " resultat:");
        for (int i = 0; i <racers.size() ; i++) {
            Racers racer = racers.get(i);
            System.out.println(i+1 + racer.getName() + racer.getLapleft()
                    + lapDistance + racer.getCarHealth() + racer.getSpeed());
        }
    }
    }


