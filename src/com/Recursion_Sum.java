package com;

public class Recursion_Sum {
    public static void main(String[] args) {
        System.out.println(Sum(10));
    }

    static int Sum(int n){
        if (n<=1){
            return 1;
        }
        return n+Sum(n-1);
    }
}
