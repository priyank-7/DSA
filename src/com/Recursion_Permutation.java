package com;

import java.util.ArrayList;

public class Recursion_Permutation {
    public static void main(String[] args) {
        permutation("","abc");
        System.out.println(permutationList("","abc"));
        System.out.println(permutationCount("","abc"));
    }

    //  print permutations
    static void permutation(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    //  Returning Arraylist
    static ArrayList<String> permutationList(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            list.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return list;
    }

    static int permutationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
