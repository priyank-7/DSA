package com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Jump_Game_VII {
    public static void main(String[] args) {

        String s = "00111010";
        System.out.println(canReach(s,3,5));
    }

    public static boolean canReach(String s, int minJump, int maxJump) {

        if(s.charAt(s.length()-1) == '1'){
            return false;
        }

        int [] arr = new int[s.length()];
        arr[0] = (int)s.charAt(0)-48;

        for(int i = 1; i < s.length(); i++){
            arr[i] = arr[i-1] + (int)s.charAt(i)-48;
        }

        Queue<Integer> st = new LinkedList<>();
        st.add(0);
        while(!st.isEmpty()){
            int temp = st.remove();

            if(temp == s.length()-1){
                return true;
            }

            int a = temp + minJump;
            int b = temp + maxJump;


            if(b < s.length() - 1 && a < s.length() - 1 && (arr[b] - arr[a-1]) >= (b-a+1)){
                continue;
            }
            for (int i = a; i <= b; i++) {
                if(i < s.length()) {
                    if (s.charAt(i) == '0') {
                        st.add(i);
                    }
                }
                else{
                    break;
                }
            }
        }
        return false;

    }
}
