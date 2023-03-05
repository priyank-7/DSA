package com;

public class Binary_Search_Count_Rotation_In_Rotated_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,4};
        if(CountRotation(arr) == arr.length-1){
            System.out.println(0);
        }
        else {
            System.out.println(CountRotation(arr) + 1);
        }
    }

    public static int CountRotation(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if (arr[start]>arr[start+1]){
                    return start;
                }
                else {
                    start++;
                    end--;
                }
            }
            else if(arr[start]<=arr[mid]){
                if(arr[mid]>arr[mid+1]){
                    return mid;
                }
                else{
                    start = mid+1;
                }
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }
}
