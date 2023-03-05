package com;

//  Amazon && MicroSoft
public class Cyclic_Sort_Find_Duplicate_Element {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i+1){
                int correct = arr[i] -1;
                if (arr[i] != arr[correct]) {
                    SwapArray(arr, i, correct);
                } else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    public static void SwapArray(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}