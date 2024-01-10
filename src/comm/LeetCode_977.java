package comm;

import java.util.Arrays;

public class LeetCode_977 {
    public static void main(String[] args) {
        int [] nums = {-5,-4,1,2,5};

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        QuickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
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
