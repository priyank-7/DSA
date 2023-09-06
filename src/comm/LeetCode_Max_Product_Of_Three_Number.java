package comm;

public class LeetCode_Max_Product_Of_Three_Number {
    public static void main(String[] args) {
        int [] nums = {-1,-2,1,2,3};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        sort(nums,0,nums.length-1);

        int neg = 0;
        int start = 0;
        int end = nums.length-1;
        int count = 3;
        int pro = 1;

        while(count-- > 0){
            if (neg == 2){
                pro *= nums[end];
                return pro;
            }
            if (Math.abs(nums[start]) >= nums[end]){

                pro *= Math.abs(nums[start]);
                neg++;
                start++;
            }
            else{
                pro *= nums[end];
                end--;
            }
        }
        if (neg%2 != 0){
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }
        return pro;


    }

    public static void sort(int [] arr, int low, int high){

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
                start++;
                end--;
            }
        }

        sort(arr,0,end);
        sort(arr,start,high);
    }
}
