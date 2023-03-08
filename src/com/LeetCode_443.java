package com;

import java.util.*;

public class LeetCode_443 {
    public static void main(String[] args) {

        char[] ch = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int x = compress(ch);
        for (int i = 0; i < x; i++) {
            System.out.println(ch[i]);
        }
        System.out.println(compress(ch));
    }




//    public static int compress(char[] chars) {
//
//        if (chars.length == 1){
//            return 1;
//        }
//
//
//
//
//    }
    public static int compress(char[] chars) {

        if(chars.length == 1){
            return 1;
        }
        int length = 0;
        int index = 0;

        for(int i = 0; i < chars.length; i++){

            if (i < chars.length-1) {
                chars[index] = chars[i];
            }
            index++;


            if(i < chars.length-1 && chars[i] == chars[i+1]){
                int inner_ind = i+1;
                int temp = 2;
                for(int j = i+1; j < chars.length-1; j++){
                    inner_ind = j;
                    if( j < chars.length-1 && chars[j] == chars[j+1]){
                        temp++;
                    }
                    else{
                        break;
                    }
                }
                i = inner_ind ;
                int num = helper_(temp, index, chars);
                length += num +1;
                index = index + num;
            }
           else {
                length++;
            }
        }
        return length;

    }

    public static int helper_ (int n, int ind, char [] ch){
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (n > 0){
            list.add(n%10);
            count++;
            n = n/10;
        }

        for(int i = list.size()-1; i >=0 ; i--){
            ch[ind] = (char)(48+list.get(i));
            ind++;
        }

        return count;
    }
}
