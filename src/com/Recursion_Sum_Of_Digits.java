package com;

public class Recursion_Sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println(Sum_Digit(-947283651));
    }
    static int Sum_Digit(int n){
        if (n == 0){
            return 0;
        }
        return n%10+Sum_Digit(n/10);
    }
}
