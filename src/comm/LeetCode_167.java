package comm;

import java.util.Arrays;

public class LeetCode_167 {
    public static void main(String[] args) {

        int[] arr = {0,3,-3,4,-1};
        System.out.println(Arrays.toString(twoSum(arr,-1)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        sort(numbers, 0, numbers.length-1);

        for (int i = 0; i < numbers.length; i++) {

            int n = helper(numbers, i, target);
            if (n > -1 && n != i){
                return new int[]{i, n};
            }
        }
        return new int[]{-1, -1};
    }

    static int helper(int [] arr, int ele, int sum){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = start+(end-start)/2;

            if (arr[ele]+arr[mid] == sum){
                if (mid == ele){
                    if (arr[mid+1] == arr[ele]){
                        return mid+1;
                    }
                }
                return mid;
            }
            else if (arr[ele] + arr[mid] < sum){
                start = mid +1;
            }
            else if (arr[ele] + arr[mid] > sum){
                end = mid -1;
            }
        }
        return -1;
    }

    static void sort (int [] arr, int low, int high){

        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

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
                start++;end--;
            }
        }

        sort(arr,low,end);
        sort(arr,start,high);
    }
}
