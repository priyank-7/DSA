package com;


                                                                    //  TLE for n = 20


public class LeetCode_1545 {
    public static void main(String[] args) {
        System.out.println(findKthBit(20,104));
    }

    public static char findKthBit(int n, int k) {
        return creatString(n, k, "0");
    }

    public static char creatString(int n, int k, String st){

        if (n == 1){
            return st.charAt(k-1);
        }
        String s = new String("");
        s = invert(st);
        s = reverse(s);

        return creatString(n-1,k,st+"1"+s);
    }

    private static String invert(String st) {
        String s = new String("");
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '1'){
                s = s +'0';
            }else{
                s = s + '1';
            }
        }
        return s;
    }

    private static String reverse(String st) {
        String s = new String("");
        if (st.length() >0) {
            for (int i = st.length() - 1; i >= 0; i--) {
                s = s + st.charAt(i);
            }
        }

        return  s;
    }
}
