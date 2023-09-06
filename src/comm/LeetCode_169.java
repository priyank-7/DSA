package comm;

import java.util.Arrays;

public class LeetCode_169 {
    public static void main(String[] args) {
        int [] arr = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,47,15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,47,18,47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        sorting(nums, 0, nums.length-1);
//        Arrays.sort(nums);
        int count  = 0;
        int pivot = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == pivot) {
                count++;
                if (count > Math.ceil(nums.length/2.0)){
                    return nums[i];
                }
            }
            else {
                pivot = nums[i];
                count = 1;
            }
        }
        return -1;
    }

    static void sorting(int [] arr, int low, int high){

        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
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

        sorting(arr, low, end);
        sorting(arr, start, high);
    }
}
