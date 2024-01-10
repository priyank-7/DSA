package comm;

public class Linear_Search_InRange {
    public static void main(String[] args) {
        int [] arr = {18,12,-7,3,14,28};
        int target = 18;
        System.out.println(LinearSearch(arr,target,1,4));
    }

//    Search in the array : return the index if the item found otherwise return -1
    static int LinearSearch(int[] arr, int target, int start, int end){
        if(arr.length ==0){
            return -1;
        }
        // run a for loop
        for (int i = start; i <= end; i++) {
            // Check for the element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        // This line will return execute if none of the return statement above hava executed hence the target not found
        return -1;
    }
}
