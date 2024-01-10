package comm;

public class Recursion_Arrays_Is_Sorted {
    public static void main(String[] args) {
        int [] arr = {};
        System.out.println(isSorted_1(arr,0));
    }

    //  #01
    public static boolean isSorted(int [] arr, int index){
        if (arr.length == 0){
            return true;
        }
        if (index==arr.length-1){
            return true;
        }
        if (arr[index] > arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }

    //  #02
    static boolean isSorted_1(int [] arr, int index){

        if (arr.length == 0){
            return true;
        }
        if (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }
}
