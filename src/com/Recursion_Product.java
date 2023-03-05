package com;

public class Recursion_Product {
    public static void main(String[] args) {
        System.out.println(Product(5,2));
    }

    static int Product(int x, int y){

        if (x < y){
            return Product(y, x);
        }
        if (y == 0){
            return 0;
        }

        return x + Product(x,y-1);
    }
}
