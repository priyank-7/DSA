package com;

import java.util.ArrayList;
import java.util.HashSet;

public class LeetCode_Intersection_Of_Two_Array {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> s1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (s1.contains(nums2[i])){
                s1.remove(nums2[i]);
                list.add(nums2[i]);
            }
        }

        int [] Intersection = new int [list.size()];

        for (int i = 0; i < list.size(); i++) {
            Intersection[i] = list.get(i);
        }

        return Intersection;
    }
}
