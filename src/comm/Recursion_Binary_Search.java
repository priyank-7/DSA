package comm;

public class Recursion_Binary_Search {
    public static void main(String[] args) {
        int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        System.out.println(BS(arr,target,0,arr.length-1));
    }

    static int BS(int[]arr, int target, int start, int end){

        if (start > end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if (arr[mid] > target){
            end = mid-1;
            return BS(arr,target,start,end);
        }
        else if (arr[mid] < target){
            start = mid + 1;
            return  BS(arr,target,start,end);
        }
        else{
            return mid;
        }
    }
}
