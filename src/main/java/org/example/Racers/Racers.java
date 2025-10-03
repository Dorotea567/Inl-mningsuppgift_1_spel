package org.example.Racers;

import org.example.settings.Settings;

public abstract class Racers {
    protected String name;
   protected int speed;
   protected int carHealth;
   protected int coins;
   protected int totalPoints;
   protected int lapleft ;

    public Racers(String name) {
        this.name = name;
        this.speed = Settings.randomSpeed();
        this.carHealth = 100;
        this.coins = 0;
        this.totalPoints = 0;
        this.lapleft = 0;
    }

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public int getCarHealth() {
        return carHealth;
    }
    public int getCoins() {
        return coins;
    }
    public int getTotalPoints() {
        return totalPoints;
    }
    public int getLapleft() {
        return lapleft;
    }

    public boolean carHealthIsFunctional() {
        return carHealth > 0;
    }
    public void resetLap() {
        lapleft= 0;
    }
    public void addLap(int lap) {
        lapleft += lap;
    }
    public void addPoints(int points) {
        totalPoints += points;
    }
    public void addCoins(int amount) {
        coins += amount;
    }

    public void roundNew(){
        speed = Settings.randomSpeed();
        carHealth = 100;
        lapleft = 0;
    }
    public void racerInfo(){
        System.out.println(name + " speed: " + speed+ " carhealth: " + carHealth + "lapleft: " + lapleft );
    }


    public abstract void speedBoost(int speedBoost);
    public abstract void speedSlowdown(int speedSlowdown);
    public abstract void carHealthDamage();
    public abstract void coinsCollected(int amount);


}
