package comm;

public class LeetCode_240 {
    public static void main(String[] args) {

        int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        int [][] arr = {{1}};
        System.out.println(arr[0].length);
        System.out.println(helper2(arr, 26));
    }


    static boolean helper2(int [][] arr, int target){
        return helper(arr, 0, arr.length - 1, 0, arr[0].length - 1, target);
    }
    static boolean helper(int [][] arr, int rs, int re, int cs, int ce, int targrt) {

        if (arr[0].length == 0) {
            return false;
        }
        int rm = rs + (re - rs) / 2;

        while (cs <= ce && rs <= re) {
            int cm = cs + (ce - cs) / 2;

            if (arr[rm][cm] == targrt) {
                return true;
            }

            //  Search in middle rod
            if (binaryrow(arr, rm, cs, ce, targrt)) {
                return true;
            }

            //  Search in middle colum
            if (binarycol(arr, cm, rs, re, targrt)) {
                return true;
            }

            if (arr[rm][cm] > targrt) {
                if (helper(arr, rs, rm - 1, cs, ce, targrt)) {
                    return true;
                }
                if (helper(arr, rm + 1, re, cs, cm - 1, targrt)) {
                    return true;
                }
            }
            if (arr[rm][cm] < targrt) {

                if (helper(arr, rm + 1, re, cs, ce, targrt)) {
                    return true;
                }
                if (helper(arr, rs, rm - 1, cm + 1, ce, targrt)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }


    static boolean binarycol(int [][] arr, int col, int start, int end, int target){

        while (start <= end){

            int mid = start + (end-start)/2;
            if (arr[mid][col] < target){
                start = mid + 1;
            }
            else if (arr[mid][col] > target){
                end = mid -1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    static boolean binaryrow(int [][] arr, int row, int start, int end, int target){

        while (start <= end){

            int mid = start + (end-start)/2;
            if (arr[row][mid] < target){
                start = mid + 1;
            }
            else if (arr[row][mid] > target){
                end = mid -1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
