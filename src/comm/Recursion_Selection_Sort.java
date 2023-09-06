package comm;

import java.util.Arrays;

public class Recursion_Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {90, 95, 10, 10, 10, 10, 10, 12,12,12,12,12, 64, 34, 25, 22, 12, 11};
        SelectionSort(arr,1,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int [] arr, int start, int end, int index){
        if (end == 0){
            return;
        }
        if (start <= end){
            if (arr[start] > arr[index]){
                index = start;
            }
            SelectionSort(arr,start+1,end, index);
        }
        else {
            int temp = arr[end];
            arr[end] = arr[index];
            arr[index] = temp;
            SelectionSort(arr,1,end-1,0);
        }
    }
}
