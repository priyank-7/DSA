package com;

public class Recursion_Number_of_Steps_to_Reduce_a_Number_to_Zero {

    static int ReduceToZero(int n){
        return helper(n,0);
    }

    static int helper(int n, int count){

        if (n == 0){
            return count;
        }
        if ((n & 1) == 0){
            count++;
            n = n/2;
        }
        else {
            count++;
            n = n-1;
        }
        return helper(n,count);

    }
    public static void main(String[] args) {
        System.out.println(ReduceToZero(8));
    }
}
