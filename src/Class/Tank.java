package Class;

import java.util.Random;

public class Tank implements Wepon{
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
