package comm;

import java.util.Arrays;

public class LeetCode_Target_Sum {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(arr,target));
    }


                //  Found TLE Error

    public static int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0);
    }

    public static int helper(int [] nums, int target, int sum){

        int count = 0;

        if (nums.length == 0){
            if (sum == target){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            count += helper(Arrays.copyOfRange(nums, 1, nums.length ), target, sum+nums[0]);
            count += helper(Arrays.copyOfRange(nums, 1, nums.length), target, sum-nums[0]);
        }

        return count;
    }
}
