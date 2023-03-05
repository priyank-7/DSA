package com;

import java.util.ArrayList;
import java.util.Collections;

public class GFG_Power_Set {
    public static void main(String[] args) {
        ArrayList<String> list = powerset(new String(),"abc");
        Collections.sort(list);
        System.out.println(list);
    }

    static ArrayList<String> powerset(String p, String up){

        var list = new ArrayList<String>();
        if (up.isEmpty()){
            list.add(p);
            return list;
        }

        list.addAll(powerset(p+up.charAt(0),up.substring(1)));
        list.addAll(powerset(p,up.substring(1)));

        return list;
    }
}
