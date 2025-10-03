package org.example.Racers;

import org.example.settings.Settings;

public abstract class Racers {
   protected int speed;
   protected int carHealth;

    public Racers() {
        this.speed = Settings.randomSpeed();
        this.carHealth = 100;
    }
    public boolean carIsFunctional() {
        return carHealth > 0;
    }
    public abstract void speedBoost(int speedBoost);
    public abstract void speedSlowdown(int speedSlowdown);
    public abstract void carHealthDamage();

}
