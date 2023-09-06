package comm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PassThePillow {
    public static void main(String[] args) {


    }

    public static int passThePillow(int n, int time) {

        float division = (float)time/ (float)(n-1);
        int rem = time % (n-1);

        int dir = (int) Math.ceil(division);

        if(dir % 2 != 0 && rem != 0){
            return rem+1;
        }
        if(dir % 2 == 0 && rem != 0){
            return n-rem;
        }
        if(dir % 2 != 0 && rem == 0){
            return n;
        }
        if(dir % 2 == 0 && rem == 0){
            return 1;
        }
        return 0;
    }
}
