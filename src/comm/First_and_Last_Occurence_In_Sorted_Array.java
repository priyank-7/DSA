package comm;

import java.util.Arrays;

public class First_and_Last_Occurence_In_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(find(arr,8)));
    }

    static int [] find(int [] arr, int target){
        int a = helper(arr,target);
        int b = helper2(arr,target);
        if(arr[a] == target && arr[b] == target){
            return new int[]{a,b};
        }
        else{
            return new int[]{-1,-1};
        }
    }

    static int helper(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start <= end){

            mid = start + (end-start)/2;
            if(arr[mid] >= target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return mid;
    }
    static int helper2(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;

        while(start <= end){
            mid = start+(end-start)/2;
            if(arr[mid] <= target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return mid;
    }
}
