package Class;

import java.util.ArrayList;

public class B_play {
    public static ArrayList<Integer> bPlay =new ArrayList<>();
    public static int total;

    public static void setValue(int shoot) {
        bPlay.add(shoot);

    }

    public static int getScore() {
        for (int a : bPlay) {
            total += a;
        }
        return total;

    }
}
