package Class;

import Controller.ReaduToWeponsController;

import java.awt.*;
import java.util.Random;

public class Bomb implements Wepon {
    int Shoot;

    @Override

    public void shoot() {
        Random random=new Random();
        Shoot=random.nextInt(11);
    }

    @Override
    public int getScore() {
        return Shoot;
    }
}
