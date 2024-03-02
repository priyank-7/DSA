package comm;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
int [][] arr = {{-19,57},{-40,-5}};
        System.out.println(minFallingPathSum(arr));

        List<String> ls = new ArrayList<>();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");

        ls.stream();


    }
        public static int minFallingPathSum(int[][] matrix) {
            int [][] sum = new int[matrix.length + 1][matrix[0].length + 1];
            return helper(matrix, sum);
        }

        public static int helper(int [][] arr, int [][] sum){

            for(int i = 1; i < sum.length; i++){
                for(int j = 1; j < sum[0].length; j++){

                    if(j == 1){
                        sum[i][j] = arr[i-1][j-1] + Math.min(sum[i-1][j], sum[i-1][j+1]);
                    }
                    else if(j == sum[0].length - 1){
                        sum[i][j] = arr[i-1][j-1] + Math.min(sum[i-1][j-1], sum[i-1][j]);
                    }
                    else {
                        sum[i][j] = arr[i - 1][j - 1] + Math.min(Math.min(sum[i - 1][j], sum[i - 1][j - 1]), sum[i - 1][j + 1]);
                    }
                }
            }

            int ans = Integer.MAX_VALUE;
            for(int i = 1; i < sum.length; i++){
                if(sum[sum.length-1][i] < ans){
                    ans = sum[sum.length-1][i];
                }
            }
            return ans;
        }
}
