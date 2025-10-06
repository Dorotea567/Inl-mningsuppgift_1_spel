package org.example.settings;

import org.example.Racers.Racers;

import java.util.ArrayList;

public class Settings {
    private ArrayList<Racers> list;
    public static int randomSpeed() {
        return (int) (Math.random() * (300-100));
    }

    public static int randomBoost() {
        return (int) (Math.random() * 100);
    }

    public static int randomSlowdown() {
        return (int) (Math.random() * (100-50));
    }

    public static void slowdownText() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static int coinsRandom (){
        return (int) (Math.random() * (100-50));
    }
    public static int damageRandom (){
        return (int) (Math.random() * (5-1));
    }
}





