package org.example.Racers;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Racer1 extends Racers {
    private String racer1Name;

    public void setRacer1Name(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv vad du vill kalla Racer: ");
        racer1Name = scanner.nextLine();
        scanner.close();
    }
    @Override
    public void speedBoost(int speedBoost) {
        System.out.println(racer1Name + " fick en speedboost på: " + speedBoost);
        speed += speedBoost;
        System.out.println(racer1Name + "har en hastighet på: " + speed);
    }
    @Override
    public void speedSlowdown(int speedSlowdown) {
        System.out.println(racer1Name + " körde på ett bananskal, hastigheten minskade med: " + speedSlowdown);
        speed -= speedSlowdown;
        System.out.println(racer1Name + " hastighet är nu: " + speed);

    }
    @Override
    public void carHealthDamage() {
        int damage = 10;
        System.out.println(racer1Name + " körde på ett hinder på banan och tog skada: " + damage);
        carHealth -= damage;
        if (carIsFunctional()) {
            System.out.println(racer1Name + "s bil har nu " + carHealth + " kvar");
        }
        else{
            carHealth = 0;
        }
    }

}
