package comm;

public class Binary_Search_In_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {2,2,2};
        int target = 2;
        System.out.println(Search(arr,target));
//        System.out.println(FindPivot(arr));
        System.out.println(FindPivotInDuplicateValueArray(arr));
    }

    public static int Search(int [] arr, int target){
        int start = 0;
        int end = FindPivotInDuplicateValueArray(arr);
        if(BinarySearch(arr,target,start,end) != -1){
            return BinarySearch(arr,target,start,end);
        }else{
            return BinarySearch(arr,target,end+1,arr.length-1);
        }
    }


    //  Finding pivot point in Non-duplicate array

    public static int FindPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[start]<=nums[mid]){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }else{
                    start = mid+1;
                }
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }


    //  Finding pivot point in duplicate array

    public static int FindPivotInDuplicateValueArray(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[start] == nums[mid] && nums[mid]==nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                else{
                    start++;
                    end--;
                }
            }
            else if(nums[start]<=nums[mid]){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }else{
                    start = mid+1;
                }
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }


    //  Binary Search

    public static int BinarySearch(int [] arr, int target, int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
