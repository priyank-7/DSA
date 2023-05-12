package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boat_To_Save_People {
    public static void main(String[] args) {

        int [] arr = {1,2,2,3};
        System.out.println(numRescueBoats(arr,3));

    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        List<Integer> list = new ArrayList<>();

        for(int i : people){
            list.add(i);
        }
        int count = 0;
        for(int i = 0 ; i < list.size(); i = i+1-1){

            int temp = list.remove(i);
            int index = helper(i,list.size()-1,list,temp,limit);

            if(index != -1 && list.get(index) + temp <= limit){
                list.remove(index);
            }
            count++;
        }
        return count;
    }

    public static int helper(int start, int end, List<Integer> list, int value, int target){

        while (start <= end){
            int mid = (start+end)/2;

            if(list.get(mid) + value <= target){
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;
    }
}
