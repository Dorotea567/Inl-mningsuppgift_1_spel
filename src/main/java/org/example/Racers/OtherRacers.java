package org.example.Racers;

import java.util.Arrays;

public class OtherRacers extends Racers {
    public OtherRacers(String name) {
        super(name);
    }

    @Override
    public void speedBoost(int speedBoost) {
            System.out.println(name+ " fick en speedboost på: " + speedBoost);
            speed += speedBoost;
            System.out.println(name + " har en hastighet på: " + speed);


    }
    @Override
    public void speedSlowdown(int speedSlowdown) {
            System.out.println(name+ " körde på ett bananskal, hastigheten minskade med: " + speedSlowdown);
            speed -= speedSlowdown;
            System.out.println(name + " hastigheten är nu: " + speed);
        }
    @Override
    public void carHealthDamage() {
        int damage = 10;
            System.out.println(name + " körde på ett hinder på banan och tog skada: ");
            carHealth += damage;
            if(carHealthIsFunctional()){
                System.out.println(name + "s bil har nu " + carHealth + " kvar");
            }
            else {
                carHealth = 0;
            }
        }
    @Override
    public void coinsCollected(int amount) {
        coins += amount;
        System.out.println(name + "har " + amount + " coins");
    }

}

