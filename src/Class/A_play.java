package Class;

import java.util.ArrayList;

public class A_play {
   public static  ArrayList<Integer>aPlay=new ArrayList<>();
    public static int total;

    public static void setValue(int shoot) {
        aPlay.add(shoot);

    }

    public static int getScore() {
        for (int a : aPlay) {
            total += a;
        }
 return total;

    }
}
