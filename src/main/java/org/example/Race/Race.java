package org.example.Race;

import org.example.Racers.OtherRacers;
import org.example.Racers.Racer1;
import org.example.settings.Settings;

public abstract class Race {
    protected Racer1 racer1;
    protected OtherRacers racers;
    protected OtherRacers [] otherRacers;
    protected int finishLine = 2000;

    public abstract void startRacer1();
}
