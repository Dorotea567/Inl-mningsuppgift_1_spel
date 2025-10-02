package Racers;

public abstract class Racers {
    private String name;
    private int speed;
    private int carhealth;

    public void setSpeed(){
        speed =
    }
    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    public int getCarhealth(){
        return carhealth;
    }
    public boolean setCarHealth(){
        return carhealth > 0;
    }

    public abstract void takeDamage(int damage);
    public abstract void speedBoost(int speed);
    public abstract void carHealth(int carhealth);

}
