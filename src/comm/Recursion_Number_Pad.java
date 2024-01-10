package comm;

//  Google Question

import java.util.ArrayList;

public class Recursion_Number_Pad {
    public static void main(String[] args) {
        Combination("","12");
        System.out.println(Combination1("","12"));
        System.out.println(Combination2("","12"));

    }

    //  Just printing the answer
    public static void Combination(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            Combination(p + ch,up.substring(1));
        }
    }

    //  Return the ArrayList
    public static ArrayList<String> Combination1(String p, String up){
        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            list.addAll(Combination1(p + ch,up.substring(1)));
        }
        return list;
    }

    public static int Combination2(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            count += Combination2(p + ch,up.substring(1));
        }
        return count;
    }
}
