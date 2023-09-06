package comm;

import java.util.Arrays;
import java.util.Stack;

public class Quick_Sort {
    public static void main(String[] args) {
        int [] arr = {10,2,9,15,7,4,3,2,1};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);
    }

    static void QuickSort(int [] nums, int low, int high){
        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = nums[mid];

        while (start <= end){

            //  also a reason why if its already sorted it will not swap
            while (nums[start] < pivot){
                start++;
            }
            while (nums[end] > pivot){
                end--;
            }

            if (start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        //  Now my pivot is at correct index, please sort two halves now
        QuickSort(nums,low,end);
        QuickSort(nums,start,high);
    }
}
