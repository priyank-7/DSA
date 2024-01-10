package comm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_189 {
    public static void main(String[] args) {

        int [] nums = {1,2};
        swap(nums, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int [] arr, int k){

        List<Integer> list = new ArrayList<>();
        for (int i = arr.length-k; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i <= k; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
