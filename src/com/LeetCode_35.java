package com;

public class LeetCode_35 {
    public static void main(String[] args) {

        int [] nums = {1,3,5,6};
        System.out.println(insertPos(nums, 0, nums.length-1, 4));
    }

    static int insertPos(int [] nums, int start, int end, int target){

        while (start <= end){

            int mid = start+(end-start)/2;
            if (nums[mid] == target){
                return mid;
            }

            if (start == end){
                if (nums[start] < target){
                    return start+1;
                }
                if (nums[start] > target){
                    return start;
                }
            }

            if (nums[mid] > target){
                end = mid-1;
            }
            if (nums[mid] < target){
                start = mid+1;
            }
        }
        return start;
    }
}
