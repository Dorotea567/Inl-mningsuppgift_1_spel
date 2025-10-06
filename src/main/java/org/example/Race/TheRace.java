package org.example.Race;

import org.example.Racers.Racers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TheRace extends Rounds {

    public void starRace(){
        nameRacer();
        eachRounds();
        standings();
        theWinner();
        System.out.println("Tack för du spelade!");


    }
    public void standings(){
        List<Racers> list = new ArrayList<>(racers);
        list.sort(Comparator.comparing(Racers::getTotalPoints).reversed());

        System.out.println("Sammanlagda ställningen");

        for (int i = 0; i < list.size() ; i++) {
            Racers racer = list.get(i);
            System.out.println(racer.getName()+ " points "+ racer.getTotalPoints() +" coins " + racer.getCoins());
        }
    }
    public void theWinner(){
        List<Racers> list = new ArrayList<>(racers);
        list.sort(Comparator.comparing(Racers::getTotalPoints).reversed());

        Racers winner = list.get(0);

        System.out.println("The winner is: " + winner.getName().toUpperCase()+ "!");
        System.out.println("Total points: " + winner.getTotalPoints());
        System.out.println("Samlade mynt: " + winner.getCoins());

        System.out.println("Scoreboard: ");
        int [] points = {1,2,3,4,5};

        for (int i = 0; i < list.size(); i++) {
            Racers racer = list.get(i);
            int point = (i< points.length) ? points[i] : 1;
            racer.addPoints(point);
            System.out.println(racer.getName() + " hamnade på plats: " + point);
        }

    }
}
