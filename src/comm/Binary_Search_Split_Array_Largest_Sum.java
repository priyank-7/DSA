package comm;

public class Binary_Search_Split_Array_Largest_Sum {
    public static void main(String[] args) {

    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);    // Int the end of the loop this will contain the max item from the array
            end +=nums[i];
        }

        //  Binary Search
        while (start<end){
            //  try for the middle as potential ans
            int mid = start+(end-start)/2;

            //  Calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num: nums) {
                if(sum+num >mid){
                    // You can not add in this subArray, make new one
                    // Say you add this num in new subArray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid +1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
