package com;

import java.util.Arrays;

public class Successful_Pair_Of_Spells_And_Portions {
    public static void main(String[] args) {
        int [] arr = {5,1,3};
        int [] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(successfulPairs(arr,arr1,7)));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int [] pairs = new int [spells.length];

        for(int i = 0; i < spells.length; i++){
            int start = 0;
            int end = potions.length-1;
            int mid = (start+end)/2;
            while(start <= end){
                mid = (start+end)/2;
                long multi = (long) spells[i] * potions[mid];
                if( multi >= success){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            pairs[i] = potions.length-start;
        }
        return pairs;
    }
}
