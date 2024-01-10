package comm;

public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);

    }
    // return the index
    static int BinarySearch(int [] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
//            int mid = (start+end)/2;    // might be possible that this calculation exceed the range
            int mid = start + (end-start)/2;
            
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // answer found
                return mid;
            }
        }
        return -1;
    }


                             // This is a space efficient binary search algorithm


//        int N = arr.length;
//        for (int i = 0; i < N; i++) {
//            if(arr[i+(N-i)/2]< target){
//                i= i+(N-i)/2 +1;
//            }
//            else if (arr[i+(N-i)/2]>target){
//                N = i+(N-i)/2 -1;
//            }
//            else{
//                return i+(N-i)/2;
//            }
//        }
//        return -1;
//    }
}
