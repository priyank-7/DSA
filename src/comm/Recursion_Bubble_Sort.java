package comm;

import java.util.Arrays;

public class Recursion_Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {90, 95, 10, 64, 34, 25, 22, 12, 11};
        BubbleSort2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //  Using For loop
    static void BubbleSort(int [] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        BubbleSort(arr,n-1);
    }

    //  Without For loop
    static void BubbleSort2(int [] arr, int start, int end) {
        if (end == 0) {
            return;
        }
        if (start < end) {

            if (arr[start] > arr[start+1]) {
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            BubbleSort2(arr,start+1,end);
        }
        else {
            BubbleSort2(arr, 0,end-1);
        }
    }
}
