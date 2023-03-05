package com;

public class Recursion_Product_Of_Digit {
    public static void main(String[] args) {
        System.out.println(Product_Digit(-13402));
    }

    static int Product_Digit(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10)*(Product_Digit(n/10));
    }
}
