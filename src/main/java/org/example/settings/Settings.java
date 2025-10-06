package org.example.settings;


public interface Settings {
    static int randomSpeed() {
        return (int) (Math.random() * (300 - 100));
    }
    static int randomBoost() {
        return (int) (Math.random() * 100);
    }
    static int randomSlowdown() {
        return (int) (Math.random() * (100 - 50));
    }

    static void slowdownText() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static int coinsRandom () {
        return (int) (Math.random() * (100 - 50));
    }
    static int damageRandom (){
        return (int) (Math.random() * (5-1));
    }
}





