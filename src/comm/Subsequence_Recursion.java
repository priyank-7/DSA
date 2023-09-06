package comm;

import java.util.ArrayList;

public class Subsequence_Recursion {
    public static void main(String[] args) {
//        subseq("", "abc");
//        System.out.println(subseq1("","abc"));
//        subseqascci("","abc");
        System.out.println(subseqascci1("","abc"));
    }

    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseq1(String p, String up){
        ArrayList<String > list = new ArrayList<>();
        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch= up.charAt(0);

        list.addAll(subseq1(p+ch, up.substring(1)));
        list.addAll(subseq1(p,up.substring(1)));

        return list;
    }

    static void subseqascci(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);
        subseqascci(p+ch, up.substring(1));
        subseqascci(p,up.substring(1));
        subseqascci(p + (ch+0),up.substring(1));
    }

    static ArrayList<String> subseqascci1(String p, String up){
        ArrayList<String > list = new ArrayList<>();
        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch= up.charAt(0);

        list.addAll(subseqascci1(p+ch, up.substring(1)));
        list.addAll(subseqascci1(p,up.substring(1)));
        list.addAll(subseqascci1(p+(ch+0),up.substring(1)));

        return list;
    }
}
