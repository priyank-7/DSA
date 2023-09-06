package comm;

import java.util.Arrays;

public class LeetCode_Sort_Array_By_Parity_2 {
    public static void main(String[] args) {
        int [] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {

        int start = 0;
        int end = 1;

        while(start < nums.length && end < nums.length){

            while(start < nums.length && nums[start]%2 == 0){
                start +=2;
            }
            while(end < nums.length && nums[end]%2 != 0){
                end += 2;
            }

            if(start < nums.length && end < nums.length){
                int temp =nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start += 2;
                end += 2;
            }
        }
        return nums;
    }
}
