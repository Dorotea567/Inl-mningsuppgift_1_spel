package org.example.Race;

import org.example.Racers.OtherRacers;
import org.example.Racers.Racer1;
import org.example.Racers.Racers;
import org.example.settings.Settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Race {
    protected ArrayList<Racers> racers;
    protected int totalRounds = 5;
    protected int lapsPerRound = 3;
    protected int lapDistance = 2000;

   public Race () {
       racers = new ArrayList<>();
   }

    public void nameRacer() {
       System.out.print("Enter name for race 1: ");
       Scanner sc = new Scanner (System.in);
       String racer1name = sc.nextLine();

       racers.add(new Racer1(racer1name));
      racers.add(new OtherRacers("Racer 2"));
      racers.add(new OtherRacers("Racer 3"));
      racers.add(new OtherRacers("Racer 4"));
      racers.add(new OtherRacers("Racer 5"));
   }

   public void box () {
       Random rand = new Random();
       switch (rand.nextInt(2)) {
           case 0:
               for (int i = 0; i < racers.size(); i++) {
                   Racers r = racers.get(i);
                   r.speedBoost(Settings.randomBoost());
               }
               break;
           case 1:
               for (int i = 0; i < racers.size(); i++) {
                   Racers r = racers.get(i);
                   r.speedSlowdown(Settings.randomSlowdown());
                   break;
               }
       }
   }}


