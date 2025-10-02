package Racers;

import java.util.Scanner;

public class Racer1 extends Racers{
    private String racer1Name;

    public void setRacer1Name(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Racer 1 Name : ");
        racer1Name = Scanner.nextLine();
        Scanner.close();
    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void speedBoost() {

    }

    @Override
    public void carHealth() {

    }
}
