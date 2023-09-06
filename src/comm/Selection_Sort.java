package comm;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {4,5,1,2,3};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int [] arr){
        for (int i = 0; i  < arr.length; i++) {
            //  Find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            SwapArray(arr,maxIndex,last );
        }
    }
    public static int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void SwapArray(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
