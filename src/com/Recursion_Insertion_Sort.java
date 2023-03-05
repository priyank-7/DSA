package com;

import java.util.Arrays;

public class Recursion_Insertion_Sort {
    public static void main(String[] args) {
        int [] arr = {2,5,1,4,3};
        InsertionSort(arr,0,arr.length-1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void InsertionSort(int [] arr, int start, int end, int index){
        if (start == arr.length-1){
            return;
        }
        if (start <= end){
            if (arr[end] < arr[index]){
                index = end;
            }
            InsertionSort(arr,start,end-1,index);
        }
        else {
            int temp = arr[start];
            arr[start] = arr[index];
            arr[index] = temp;
            InsertionSort(arr,start+1,arr.length-1,arr.length-1);
        }
    }

//    static void InsertionSort1(int [] arr, int start, int end, int index){
//        if (start == arr.length){
//            return;
//        }
//        if (start <= end){
//            if (arr[start] < arr[index]){
//                index = start;
//            }
//            InsertionSort1(arr,start+1,end,index);
//        }
//        else {
//            int temp = arr[arr.length-start];
//            arr[arr.length-start] = arr[index];
//            arr[index] = temp;
//            InsertionSort1(arr,start,end,start);
//        }
//    }
}
