package comm;

//Mountain arr == Bitonic Array

public class Binary_Search_Finding_In_Mountian_Array {
    public static void main(String[] args) {

    }

    public int search(int [] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsTry = OrderAgnosticBS(arr,target,0,peak);
        if(firsTry != -1){
            return firsTry;
        }
        return OrderAgnosticBS(arr,target,peak+1,arr.length-1);

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<end){
            mid = start + (end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int OrderAgnosticBS(int [] arr, int target, int start, int end){
        boolean isAsc = arr[start]<arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
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
        return -1;
    }
}
