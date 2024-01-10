package comm;

import java.util.ArrayList;

public class Recursion_Dice {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(dice1("",4));
        System.out.println(dice2("",4));
    }

    //  Printing the all answer
    static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6  && i <= target; i++) {
            dice(p+i,target-i);
        }
    }

    //Returning the list of the all answer
    static ArrayList<String> dice1(String p, int target){

        ArrayList<String> list = new ArrayList<>();
        if (target == 0){
            list.add(p);
            return list;
        }

        for (int i = 1; i <= 6  && i <= target; i++) {
            list.addAll(dice1(p+i,target-i));
        }

        return list;
    }

    //  Returning the total count of answer
    static int dice2(String p, int target){

        ArrayList<String> list = new ArrayList<>();
        if (target == 0){
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= 6  && i <= target; i++) {
            count += (dice2(p+i,target-i));
        }

        return count;
    }

    //  If you have different face like 6,7,8,...
    static void diceFace(String p, int target, int face){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6  && i <= target; i++) {
            diceFace(p+i,target-i, face);
        }
    }
}
