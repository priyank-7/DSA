package com;

import java.util.Arrays;

public class Matrix_Block_Sum {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(matrixBlockSum(arr,1)));
    }

    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int [][] ans = new int[mat.length + 1][mat[0].length + 1];
        prefixSum(mat,ans);

        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){

                int r1 = i - k;
                if(i - k < 0){
                    r1 = 0;
                }

                int r2 = i + k;
                if(i + k > mat.length-1){
                    r2 = mat.length-1;
                }

                int c1 = j - k;
                if(j - k < 0){
                    c1 = 0;
                }

                int c2 = j + k;
                if(j + k > mat[0].length-1){
                    c2 = (mat[0].length)-1;
                }

                mat[i][j] = sumRegion(r1,c1,r2,c2,ans);
            }
        }
        return mat;
    }

    public static void prefixSum(int [][] arr, int [][] ans){

        for (int i = 1; i <ans.length; i++) {
            for (int j = 1; j < ans[0].length; j++) {
                ans[i][j] = arr[i-1][j-1] + ans[i][j-1] + ans[i-1][j] - ans[i-1][j-1];
            }
        }
    }

    public static int sumRegion(int row1, int col1, int row2, int col2, int [][] ans) {
        return ans[row1][col1] + ans[row2+1][col2+1] - ans[row1][col2+1] - ans[row2+1][col1];
    }
}
