package comm;

import java.util.HashSet;

public class LeetCode_Contains_Duplicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])){
                return true;
            }
            else {
                s.add(nums[i]);
            }
        }
        return false;
    }
}
