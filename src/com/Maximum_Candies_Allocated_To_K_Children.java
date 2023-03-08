package com;

public class Maximum_Candies_Allocated_To_K_Children {
    public static void main(String[] args) {

        int [] arr = {5,8,6};
        System.out.println(maximumCandies(arr,3));
    }

    public static int maximumCandies(int[] candies, long k) {
        long max = Long.MIN_VALUE;
        for(int i : candies){
            if(i > max){
                max = i;
            }
        }

        return (int) bin(candies, k, 1, max);

    }

    public static long bin(int [] arr, long k, long start, long end){

        long ans = 0;
        while(start <= end){
            long mid = (start+end)/2;

            long person = 0;

            for(int i : arr){
                person += i/mid;
            }

            if(person < k){
//                ans = mid;
                end = mid - 1;
            }
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}
