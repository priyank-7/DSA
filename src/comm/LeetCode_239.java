package comm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_239 {
    public static void main(String[] args) {
        int [] arr = {1,3,-1,-3,5,3,6,7};
        arr = maxSlidingWindow(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int[] arr = new int[nums.length-k+1];
        int counter = 0;
        int max = nums[0];
        for(int i = 1; i< k; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        arr[counter++] = max;
        for(int i = k; i < nums.length; i++){

            
            
            if(nums[i] > max){
                max = nums[i];
            }
            arr[counter] = max;
            counter++;
        }
        return arr;
    }
}
