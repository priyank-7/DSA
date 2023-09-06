package comm;

public class LeetCode_74 {
    public static void main(String[] args) {

        int [][] arr = {{1,3,5}};
        System.out.println(helper(arr,0));
    }

    static boolean helper(int [][] arr, int target){

        int startR = 0;
        int endR = arr.length-1;
        int startC = 0;
        int endC = arr[0].length-1;

        int midC = startC + (endC-startR)/2;

        while (endR - startR > 1){

            int mid = startR+(endR-startR)/2;

            if (arr[mid][midC] == target){
                return true;
            }

            if (arr[mid][midC] < target){
                startR = mid;
            }
            else if (arr[mid][midC] > target){
                endR = mid;
            }
        }

        if (binary(arr, startR, midC+1, arr[startR].length-1, target)){
            return true;
        }
        if (binary(arr, endR, 0, midC-1, target)){
            return true;
        }
        if (binary(arr, 0, 0, midC, target)){
            return true;
        }
        if (binary(arr, arr.length-1, midC, arr[0].length-1, target)){
            return true;
        }
        return false;
    }

    static boolean binary(int [][] arr, int row, int start, int end,  int target) {

        while (start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[row][mid]){
                end = mid-1;
            }
            else if(target > arr[row][mid]){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
