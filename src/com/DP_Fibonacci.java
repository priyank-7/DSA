package com;

import java.util.*;

public class DP_Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        // FOr fib
        List<Integer> dp = new ArrayList<Integer>(Collections.nCopies(n+1,-1));
        System.out.println(fib(n,dp));

        // for fin1
        System.out.println(fib1(n));

        // for fib2
        System.out.println(fib2(n));
    }

    // Top - Down approach
    public static int fib (int n, List<Integer> dp){

        // Base case
        if(n <= 1){
            return n;
        }

        // checking if the value of recursion call fib(n) is already in the lis or not
        if(dp.get(n) != -1){
            return dp.get(n);
        }

        // adding the answer in to list
        dp.set(n,fib(n-1,dp) + fib(n-2,dp));

        return dp.get(n);
    }

    // Bottom - Up approach (Tabular approach)
    static int fib1 (int n){

        if (n <= 1){
            return n;
        }
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n+1,0));

        dp.set(0,0);
        dp.set(1,1);

        for (int i = 2; i <= n; i++) {
            dp.set(i,dp.get(i-1)+dp.get(i-2));
        }
        return dp.get(n);
        
    }

    static int fib2 (int n){

        if (n <= 1){
            return n;
        }
        int pre1 = 1;
        int pre2 = 0;

        for (int i = 2; i <= n ; i++) {
            int curr = pre1 + pre2;
            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;
    }
}
