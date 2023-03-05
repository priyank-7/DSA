package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class LeetCode_2289 {
    public static void main(String[] args) {
        int [] arr = {5,3,4,4,7,3,6,11,8,5,11};
        System.out.println(totalSteps(arr));
        LinkedList<Node> l = new LinkedList<Node>();
    }

    public static int totalSteps(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int c = 0;
        for(int i = 0; i< nums.length; i++){
            l.add(nums[i]);
        }
        boolean flag = false;
        while(!flag){
            flag = true;
            for(int i = 1; i < l.size(); i++){
                if(l.get(i) > l.get(i-1)){
                    l.remove(i-1);
                    flag = false;
                }
            }
            if(!flag){
                c++;
            }
        }
        return c;
    }
}
