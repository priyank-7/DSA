package comm;


import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_Intersection_Of_Two_Array_2 {
    public static void main(String[] args) {
        int [] arr1 = {4,9,5};
        int [] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        sort(nums1, 0, nums1.length-1);
        sort(nums2, 0, nums2.length-1);
        return intersection(min(nums1, nums2), max(nums1, nums2));

    }

    public static int [] intersection(int [] min, int [] max){

        int start1 = 0;
        int start2 = 0;
        var list = new ArrayList<Integer>();

        while (start1 < min.length && start2 < max.length){
            if (min[start1] == max[start2]){
                list.add(min[start1]);
                start1++;
                start2++;
            }
            else if (min[start1] < max[start2]){
                start1++;
            }
            else {
                start2++;
            }
        }

        return toArray(list);
    }

    private static int[] toArray(ArrayList<Integer> list) {
        int [] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


    public static int [] min(int [] arr1, int [] arr2){
        if (arr1.length <= arr2.length){
            return arr1;
        }
        else {
            return arr2;
        }
    }

    public static int [] max(int [] arr1, int [] arr2){
        if (arr1.length > arr2.length){
            return arr1;
        }
        else {
            return arr2;
        }
    }

    public static void sort(int [] arr, int low, int high){

        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int pivot = arr[start + (end - start)/2];

        while (start <= end){

            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            sort(arr, low, end);
            sort(arr, start, high);
        }
    }
}
