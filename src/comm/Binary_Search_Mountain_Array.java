package comm;

public class Binary_Search_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
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
}
