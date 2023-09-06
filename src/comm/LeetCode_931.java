package comm;

public class LeetCode_931 {
    public static void main(String[] args) {
        int arr [][] = {{2,1,3},
                {6,5,4},
                {7,8,9}};
        System.out.println(minFallingPathSum(arr));

    }
    public static int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            int x = helper(matrix, 0, i);
            if(x < min){
                min = x;
            }
        }
        return min;
    }

    public static int helper(int [][] arr, int row, int colum){

        if(row < 0 || row >= arr.length || colum < 0 || colum >= arr[0].length){
            return 0;
        }

        int a = check2(arr,row+1,colum-1);
        int b = check2(arr,row+1,colum);
        int c = check2(arr,row+1,colum+1);

        int min = Math.min(a,Math.min(b,c));
         if(check(arr,row+1,colum-1) && arr[row+1][colum-1] == min){
             return helper(arr,row+1,colum-1) + arr[row+1][colum-1];
         }
         if(check(arr,row+1,colum) && arr[row+1][colum] == min){
             return helper(arr,row+1,colum) + arr[row+1][colum-1];
         }
         if(check(arr,row+1,colum+1) && arr[row+1][colum+1] == min){
             return helper(arr,row+1,colum+1) + arr[row+1][colum-1];
         }
         return 0;
    }

    public static boolean check (int [][] arr, int row, int colum) {
        try {
            int x = arr[row][colum];
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static int check2 (int [][] arr, int row, int colum) {
        try {
            int x = arr[row][colum];
            return x;
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }
}
