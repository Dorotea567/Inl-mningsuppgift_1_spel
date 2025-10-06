package org.example.Racers;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Racer1 extends Racers {
    public Racer1(String name) {
        super(name);
    }
    public void setCarHealth(int health) {
        this.carHealth = health;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public void speedBoost(int speedBoost) {
        System.out.println(name+ " fick en speedboost på: " + speedBoost);
        speed += speedBoost;
        System.out.println(name + " har en hastighet på: " + speed);
    }
    @Override
    public void speedSlowdown(int speedSlowdown) {
        System.out.println(name + " körde på ett bananskal, hastigheten minskade med: " + speedSlowdown);
        speed -= speedSlowdown;
        System.out.println(name + " hastighet är nu: " + speed);

    }
    @Override
    public void carHealthDamage(int damage) {
        System.out.println(name + " körde på ett hinder på banan och tog skada: " + damage);
        carHealth -= damage;
        if (carHealthIsFunctional()) {
            System.out.println(name + "s bil har nu " + carHealth/100);
        }
        else{
            carHealth = 0;
        }
    }
    @Override
    public void coinsCollected(int amount) {
        coins += amount;
        System.out.println(name + " har " + coins + " coins");
    }

}
