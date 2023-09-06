package comm;

public class LeetCode_Array_Partition {
    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] arr) {
        Quick(arr,0, arr.length-1);

        int sum = 0;

        for (int i = 0; i < arr.length; i+=2) {
            sum += arr[i];
        }

        return sum;
    }

    public static void Quick(int [] arr, int low, int high){

        if (low <= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        while(start <= end){

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
        }

        Quick(arr,low,end);
        Quick(arr,start,high);
    }
}
