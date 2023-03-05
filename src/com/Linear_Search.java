package com;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {23,45,1,2,8,19,-3,-11,16,28};
        int target = 19;
        boolean ans = LinearSearch(arr,target);
        System.out.println(ans);
    }



    static boolean LinearSearch(int[] arr, int target){
        if(arr.length ==0){
            return false;
        }
        // run a for loop
        for (int element : arr) {
            // Check for the element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        // This line will return execute if none of the return statement above hava executed hence the target not found
        return false;
    }
}


//     Search in the array : return the index if the item found otherwise return -1
//    static int LinearSearch(int[] arr, int target){
//        if(arr.length ==0){
//            return -1;
//        }
//        // run a for loop
//        for (int i = 0; i < arr.length; i++) {
//            // Check for the element at every index if it is = target
//            int element = arr[i];
//            if(element == target){
//                return i;
//            }
//        }
//        // This line will return execute if none of the return statement above hava executed hence the target not found
//        return -1;
//    }
//}
