package comm;

public class Recursion_Binary_Search_Rotated {
    public static void main(String[] args) {
        int [] arr = {5,5,6,7,1,2,3,4,5};
        int target = 6;
        System.out.println(Rotated_BS(arr,target,0,arr.length-1));
    }

    static int Rotated_BS(int [] arr,int target, int start, int end){

        if (start > end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if (arr[mid] == target){
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && arr[mid] >= target){
                return Rotated_BS(arr,target,start,mid-1);
            }

            else {
                return  Rotated_BS(arr,target,mid+1,end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]){
            return Rotated_BS(arr,target,mid+1,end);
        }

        return Rotated_BS(arr,target,start,mid-1);
    }
}
