package org.example.settings;


import org.example.Racers.Racer1;
import java.util.Scanner;


public class Shop extends Options {
    private Scanner scanner = new Scanner(System.in);
    private int tal;

    public int readInt() {
        tal = scanner.nextInt();
        return tal;
    }
    public void chooseCar() {
        readInt();
        switch (tal) {
            case 1:
                car1();
                break;

            case 2:
                car2();
                break;

            case 3:
                car3();
                break;

            case 4:
                huvudmeny();
                break;

            default:
                System.out.println("Skriv ett gitligt nummer");
                break;
        }
    }
    public void shop1() {
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

    public void car1() {
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
    public void car1Install() {
        Racer1 r = new Racer1("null");
        r.setSpeed(100);
        r.setCarHealth(150);
    }
    public void buy1() {
        readInt();
        switch (tal) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("Grattis till din nya bil");
                System.out.println("--------------------------");
                System.out.println("----Super mario car----");
                System.out.println("------------------------");
                car1Install();
                break;
            case 2:
                chooseCar();
                break;
            case 3:
                huvudmeny();
                break;
            default:
                System.out.println("Skriv ett gitligt nummer");
                break;
        }
    }

    public void car2() {
        System.out.println("---------------");
        System.out.println("SpiderMan car");
        System.out.println("---------------");
        System.out.println("Speed: 150");
        System.out.println("Health 200");
        System.out.println("---------------");
        System.out.println("[1] Köp bilen");
        System.out.println("[2] Gå tillbaka");
        buy2();

    }
    public void car2Install() {
        Racer1 r = new Racer1("null");
        r.setSpeed(150);
        r.setCarHealth(200);
    }
    public void buy2() {
        readInt();
        switch (tal) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("Grattis till din nya bil");
                System.out.println("--------------------------");
                System.out.println("----SpiderMan car----");
                System.out.println("------------------------");
                car2Install();
                break;
            case 2:
                chooseCar();
                break;
            case 3:
                huvudmeny();
                break;
            default:
                System.out.println("Skriv ett gitligt nummer");
                break;
        }
    }

    public void car3() {
        System.out.println("---------------");
        System.out.println("The fastest car");
        System.out.println("---------------");
        System.out.println("Speed: 200 ");
        System.out.println("Health 250");
        System.out.println("---------------");
        System.out.println("[1] Köp bilen");
        System.out.println("[2] Gå tillbaka");
        buy3();

    }
    public void car3Install() {
        Racer1 r = new Racer1("null");
        r.setSpeed(200);
        r.setCarHealth(250);
    }
    public void buy3() {
        readInt();
        switch (tal) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("Grattis till din nya bil");
                System.out.println("--------------------------");
                System.out.println("----The fastest car----");
                System.out.println("------------------------");
                car3Install();
                break;
            case 2:
                chooseCar();
                break;
            case 3:
                huvudmeny();
                break;
            default:
                System.out.println("Skriv ett gitligt nummer");
                break;
        }
    }
}
