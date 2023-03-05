package com;

public class LeetCode_540 {
    public static void main(String[] args) {

        int [] nums = {3,3,7,7,10,11,11};
        System.out.println(helper(nums, 0, nums.length-1));
    }

    static int helper(int [] nums, int start, int end){

        if (nums.length == 1){
            return nums[0];
        }

        if (nums[0] != nums[1]){
            return nums[0];
        }

        if (nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == nums[mid + 1]) {
                int n = helper(nums, start, mid - 1);
                if (n == -1) {
                    return helper(nums, mid + 2, end);
                }
                return n;
            }

            else if (nums[mid] == nums[mid - 1]) {
                int n = helper(nums, start, mid - 2);
                if (n == -1) {
                    return helper(nums, mid + 1, end);
                }
                return n;
            }

            else {
                return nums[mid];
            }
        }
        return -1;
    }
}
