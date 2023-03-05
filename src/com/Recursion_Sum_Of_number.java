package com;

public class Recursion_Sum_Of_number {
    public static void main(String[] args) {
        System.out.println(Sum(100));
    }

    static int Sum(int n){
        if (n == 1){
            return 1;
        }
        return n + Sum(n-1);
    }
}
