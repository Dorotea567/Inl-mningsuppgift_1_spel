package org.example.Race;

import org.example.Race.Laps;
import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.*;

public class Rounds extends Laps {

    public void eachRounds (){
        for (int round = 0; round <= totalRounds ; round++) {
            System.out.println("Rounds: " + round + " av " + totalRounds);
            eachLap();
            resultsRounds();
            pointsforRounds();
            if(round < totalRounds){
                System.out.println("Tryck Enter för nästa runda: ");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
            }
        }

    }
    public void resultsRounds(){
        List<Racers> racersList = new ArrayList<Racers>();
        racersList.sort(Comparator.comparing(Racers::getLapleft).reversed());

        System.out.println("Resultat: ");
        for (int i = 0; i <racersList.size() ; i++) {
            Racers racers = racersList.get(i);
            System.out.println(i+1 + racers.getName() + racers.getLapleft()
                    + lapDistance +racers.getCarHealth() + racers+ racers.getSpeed());

        }
    }
    public void pointsforRounds(){
        List<Racers> racersList = new ArrayList<Racers>();
        racersList.sort(Comparator.comparing(Racers::getLapleft).reversed());

        int [] points = {10, 8, 6, 4,2 };

        System.out.println("Poäng för rundan");
        for (int i = 0; i <racersList.size() ; i++) {
            Racers racers = racersList.get(i);
            System.out.println(i+1 + racers.getName() + racers.getLapleft()+ racersList.get(i));
        }
    }
}
