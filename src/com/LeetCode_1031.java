package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetCode_1031 {
    public static void main(String[] args) {
        int [] nums = {3,8,1,3,2,1,8,9,0};
        System.out.println(maxSumTwoNoOverlap(nums, 3, 2));

    }

    public static int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {

        Arrays.sort(nums);

        ArrayList<Integer> l1 = new ArrayList<>(firstLen);
        ArrayList<Integer> l2 = new ArrayList<>(secondLen);

        int sum = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = nums.length-1, j = 0; i > 0 || j < firstLen + secondLen;i--, j++) {

            if (!(l1.contains(nums[i])) && l1.size() < firstLen){

                l1.add(nums[i]);
                sum += nums[i];

                if (l2.contains(nums[i])){
                    count1++;
                    if (count1 == firstLen){
                        l1.remove(l1.size()-1);
                        count1--;
                        sum -= nums[i];
                    }
                }
            }

            else if ( !(l2.contains(nums[i])) && (l2.size() < secondLen)){

                l2.add(nums[i]);
                sum += nums[i];

                if (l1.contains(nums[i])){
                    count2++;
                    if (count2 == secondLen){
                        l2.remove(l2.size()-1);
                        count2--;
                        sum -= nums[i];
                    }
                }
            }

            else {
                break;
            }
        }

        return sum;
    }
}
