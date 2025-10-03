package org.example.Racers;

public class OtherRacers extends Racers {
    private String [] racerssName;
    private int carHealth;

    public void setPlayersName(){
      racerssName= new String[4];
      racerssName[0]= "Racer 2";
      racerssName[1]= "Racer 3";
      racerssName[2]= "Racer 4";
      racerssName[3]= "Racer 5";
       for (int i = 0; i <racerssName.length ; i++) {
           System.out.println(racerssName[i]);
       }
   }

    @Override
    public void speedBoost(int speedBoost) {
            System.out.println(racerssName+ " fick en speedboost på: " + speedBoost);
            speed += speedBoost;
            System.out.println(racerssName + "har en hastighet på: " + speed);
    }
    @Override
    public void speedSlowdown(int speedSlowdown) {
        System.out.println(racerssName + " körde på ett bananskal, hastigheten minskade med: " + speedSlowdown);
        speed -= speedSlowdown;
        System.out.println(racerssName + " hastighet är nu: " + speed);

    }
    @Override
    public void carHealthDamage() {
        int damage = 10;
        System.out.println(racerssName + " körde på ett hinder på banan och tog skada: " + damage);
        carHealth -= damage;
        if (carIsFunctional()) {
            System.out.println(racerssName + "s bil har nu " + carHealth + " kvar");
        }
        else{
            carHealth = 0;
        }

    }

}

