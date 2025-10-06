package org.example.settings;

import org.example.Race.TheRace;
import org.example.Racers.Racer1;
import org.example.Racers.Racers;

import java.util.Scanner;
import java.util.SortedMap;

public class Shop extends Options {
    private Scanner scanner = new Scanner(System.in);
    int tal;
    public void shop1(){
        System.out.println("-------------------------");
        System.out.println("--Välkomen till shoppen---");
        System.out.println("-------------------------");
        System.out.println("[1] Super mario car");
        System.out.println("[2] SpiderMan car");
        System.out.println("[3] Fastest car");
        System.out.println("[4] Gå tillbaka");
        System.out.println("---------Välj-------");
        chooseCar();
    }
    public int readInt(){
        while (!scanner.hasNextInt(4)) {
            System.out.println("Skriv ett heltal");
            scanner.next();
        }
        tal = scanner.nextInt();
        return tal;
    }
    public void chooseCar() {
        if (tal == 1) {
            car1();
        } else if (tal == 2) {
            car2();

        } else if (tal == 3) {
            car3();

        } else if (tal == 4) {
            huvudmeny();
        } else {
            System.out.println("Välj ett av talen!");
        }
    }

    public void car1 (){
        System.out.println("---------------");
        System.out.println("Super Mario car");
        System.out.println("---------------");
        System.out.println("Speed: 100");
        System.out.println("Health 150");
        System.out.println("---------------");
        System.out.println("[1] Köp bilen");
        System.out.println("[2] Gå tillbaka");
        buy1();

    }
    public void buy1(){
        if (tal == 1) {
            System.out.println("-------------------------");
            System.out.println("Grattis till din nya bil");
            System.out.println("----Super mario car----");
            System.out.println("------------------------");

            car1Install();
            huvudmeny();
        }


        else if (tal == 2) {
            chooseCar();

        } else if (tal == 3) {

        }
    }
    public void car1Install(){
        Racer1 r = new Racer1();
        r.setCarHealth(150);
        r.setSpeed(100);
    }

    public void car2 (){
        System.out.println("---------------");
        System.out.println("SpiderMan car");
        System.out.println("---------------");
        System.out.println("Speed: 200");
        System.out.println("Health 200");
        System.out.println("---------------");
        System.out.println("[1] Köp bilen");
        System.out.println("[2] Gå tillbaka");
        buy2();
    }
    public void buy2(){
        if (tal == 1) {
            System.out.println("-------------------------");
            System.out.println("Grattis till din nya bil");
            System.out.println("----Super mario car----");
            System.out.println("------------------------");
            car2Install();
        }
        else if (tal == 2) {
            chooseCar();
        }
    }
    public void car2Install(){
        Racer1 r = new Racer1();
        r.setCarHealth(200);
        r.setSpeed(200);
    }

    public void car3 (){
        System.out.println("---------------");
        System.out.println("Fastest car");
        System.out.println("---------------");
        System.out.println("Speed: 300");
        System.out.println("Health 250");
        System.out.println("---------------");
        System.out.println("[1] Köp bilen");
        System.out.println("[2] Gå tillbaka");
        buy3();
    }
    public void buy3(){
        if (tal == 1) {
            System.out.println("-----------------------");
            System.out.println("Grattis till din nya bil");
            System.out.println("----Super mario car----");
            System.out.println("-----------------------");
            car3Install();
        }
        else if (tal == 2) {
            chooseCar();
        }
    }
    public void car3Install(){
        Racer1 r = new Racer1();
        r.setCarHealth(250);
        r.setSpeed(300);
    }



}
