package com;

public class Recursion_Pattern_1 {
    public static void main(String[] args) {
        Pattern(4,0);
        Pattern_2(4,0);
    }

    static void Pattern(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("* ");
            Pattern(r,c+1);
        }
        else {
            System.out.println();
            Pattern(r-1,0);
        }
    }

    static void Pattern_2(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            Pattern_2(r,c+1);
            System.out.print("* ");
        }
        else {
            Pattern_2(r-1,0);
            System.out.println();
        }
    }
}
