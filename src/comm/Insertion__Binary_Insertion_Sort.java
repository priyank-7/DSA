package comm;

import java.util.Arrays;

public class Insertion__Binary_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        BinaryInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BinaryInsertionSort(int [] arr){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]){
                BinarySearch(arr,0, i-1, i);
                i--;
            }
        }
    }

    public static void BinarySearch(int [] arr, int start, int end, int target){

        while (start <= end){
            int mid = start+(end-start)/2;

            if (arr[mid] > arr[target]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        Swap(arr,start,target);
    }

    public static void Swap (int [] arr, int start, int target){

        int temp = arr[start];
        arr[start] = arr[target];
        arr[target] = temp;

    }
}
