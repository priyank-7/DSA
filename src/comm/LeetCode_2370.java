package comm;

public class LeetCode_2370 {
    public static void main(String[] args) {
        int [] arr = {0,1,2};
        System.out.println(arithmeticTriplets(arr, 1));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {

        int count = 0;
        int end = nums.length-1;
        for(int i = 0; i< nums.length-2; i++){

            int n = binary(nums, diff, i+1, end, i);
            if(n != -1){
                if(binary(nums, diff, n+1, end, n) != -1){
                    count++;
                }
            }
        }
        return count;
    }

    static int binary(int [] nums, int diff, int start, int end, int target){

        while(start <= end){

            int mid = start+(end-start)/2;

            if(nums[mid] - nums[target] > diff){
                end = mid-1;
            }
            else if(nums[mid] - nums[target] < diff){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
