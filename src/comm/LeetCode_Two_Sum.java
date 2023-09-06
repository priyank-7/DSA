package comm;

import java.util.Arrays;

public class LeetCode_Two_Sum {
    public static void main(String[] args) {
        int [] arr = {3,2,4};
        int targer = 6;
        System.out.println(Arrays.toString(twoSum(arr,targer)));
    }

    public static int[] twoSum(int[] nums, int target) {
        return binary(nums,target);
    }

    static int [] binary(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start+(end-start)/2;

            if ((arr[start]+arr[mid]) == target){
                return new int[]{start,mid};
            }

            else if (arr[start]+arr[mid] > target){
                end = mid;
            }
            else if (arr[start]+arr[mid] < target){
                start = mid;
            }
        }

        return new int[] {-1,-1};
    }
}
