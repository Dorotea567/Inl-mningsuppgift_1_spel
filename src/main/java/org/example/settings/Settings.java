package org.example.settings;

public class Settings {
    public static int randomSpeed() {
        return (int) (Math.random() * 300);
    }

    public static int randomBoost() {
        return (int) (Math.random() * 100);
    }

    public static int randomSlowdown() {
        return (int) (Math.random() * 100);
    }

    public static void slowdownText() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}





