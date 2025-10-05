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
        List<Racers> list = new ArrayList<Racers>();
        list.sort(Comparator.comparing(Racers::getTotalPoints).reversed());

        System.out.println("Sammanlagda ställningen");

        for (int i = 0; i < list.size() ; i++) {
            Racers racer = list.get(i);
            System.out.println(i+1 + racer.getTotalPoints()  + racer.getCoins());
        }
    }
    public void theWinner(){
        List<Racers> list = new ArrayList<Racers>();
        list.sort(Comparator.comparing(Racers::getTotalPoints).reversed());

        Racers winner = list.get(0);

        System.out.println("The winner is: " + winner.getName().toUpperCase()+ "!");
        System.out.println("Total points: " + winner.getTotalPoints());
        System.out.println("Samlade mynt: " + winner.getCoins());

        System.out.println("Scoreboard: ");
        for (int i = 0; i < list.size(); i++) {
            Racers racer = list.get(i);
            String medal = i == 0 ? "Winner" : i == 1 ? " 2:an plats ": i == 3 ? " 3:e plats ": "";
            System.out.println(medal + i+1 + racer.getName() + racer.getTotalPoints());
        }
    }
}
