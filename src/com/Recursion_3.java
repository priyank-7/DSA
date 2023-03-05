package com;

public class Recursion_3 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        //  This is called tail recursion
        //  This is the last function call
        print(n+1);
    }
}
