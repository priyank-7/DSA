package comm;

import java.util.Arrays;

public class Binary_Search_First_And_Last_Occurence {

    public static boolean Contains(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return false;
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] arr = {-1, -1};

        if (Contains(nums, target)) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            arr[0] = start;
            start = 0;
            end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                System.out.println(start + " " + end);
            }
            arr[1] = end;
            return arr;
        } else {
            return arr;
        }
    }


    public static void main(String[] args) {


        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));


    }
}
