package comm;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {3,1,5,4,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int [] arr){
        boolean swapped;
        //  Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //  For each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //  Swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    //  Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //  If you did not swap for a particular value if i. it means array is sorted hence stop the program
            if (!swapped){
                break;
            }
        }
    }
}
