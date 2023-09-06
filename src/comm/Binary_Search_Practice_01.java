package comm;

// import java.util.Arrays;

/*

* Only for ascending array
* Give the number which is greater or equal to the target element in the sorted array. ==> return start while condition is break
* Give the number which is less or equal to the target element in the sorted array. ==> return end while condition is break

*/
public class Binary_Search_Practice_01 {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7,8 ,9};
        int target = 0;
        System.out.println(FindCeil(arr,target));
        System.out.println(FindFloor(arr,target));
    }

        // Only for ascending Array

        // Find The ceiling number

    static int FindCeil(int[] arr, int target){

        if (target < arr[0]){
            return -1;
        }
        if(target > arr[arr.length-1]){
            return  -1;
        }

        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start]<arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if (isAsc) {
                if (target < arr[0]){
                    return -1;
                }
                if(target > arr[arr.length-1]){
                    return  -1;
                }

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

            else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return arr[start];
    }

            // Find The floor number

    static int FindFloor(int[] arr, int target){

        if (target < arr[0]){
            return -1;
        }
        if(target > arr[arr.length-1]){
            return  -1;
        }

        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start]<arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

            else{

                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return arr[end];
    }
}
