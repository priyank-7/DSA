package com;

//  When given numbers from range from 1toN  ==> Use Cyclic sort

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int [] arr = {5,3,2,4,1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CyclicSort(int [] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                SwapArray(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    public static void SwapArray(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
