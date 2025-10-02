package Racers;

public class OtherRacers extends Racers{
    private String [] OtherRacersName;

    public void setOtherRacersName(){
        OtherRacersName = new String[4];
        OtherRacersName[0] = "Racer 1 ";
        OtherRacersName[1] = "Racer 2 ";
        OtherRacersName[2] = "Racer 3 ";
        OtherRacersName[3] = "Racer 4 ";
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
