package com;

public class Recursion_2 {
    public static void main(String[] args) {
        //  Print numbers that take in a number and prints it
        //  Print first five numbers
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}
