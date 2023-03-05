package com;

public class LeetCode_ThirdMax_Element {
    public static void main(String[] args) {
        int [] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if (nums[i] > max2 &&nums[i] < max1){
                max3 = max2;
                max2 = nums[i];
            }
            else if (nums[i] > max3 && nums[i] < max2){
                max3 = nums[i];
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }

    //  For K th max element

    public static void sort(int [] arr, int low, int high){

        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        while (start <= end){

            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        sort(arr,low,end);
        sort(arr,start,high);
    }
}
