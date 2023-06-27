package Class;

import java.util.Random;

public class T_56 implements Wepon{
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
