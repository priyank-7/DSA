package com;

public class Recursion_IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(97,1,0));
    }

    static boolean isPrime(int n,int i, int count){
        if (n == 1){
            return false;
        }
        if (i > Math.sqrt(n)){
            if (count == 1){
                return true;
            }
            else{
                return false;
            }
        }
        if (n%i == 0 ){
            count++;
        }
        return isPrime(n,i+1,count);
    }
}
