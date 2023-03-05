package com;

public class Cyclic_Sort_Duplicate_Number_And_Repetated_Number {
    public static void main(String[] args) {

    }

    public static int [] DuplicateNumber(int [] arr){
        CyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return new int[] {arr[i],i+1};
            }
        }
        return new int [] {-1,-1};
    }

    public static int [] CyclicSort(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                Swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }

    public static void Swap(int [] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
