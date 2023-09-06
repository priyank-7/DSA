package com;

import java.util.Arrays;

public class DP_Prefix_Sum {
    public static void main(String[] args) {
        int [][] arr = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5},
        };

        int [][] ans = new int[arr.length + 1][arr[0].length + 1];

        prefixSum(arr,ans);
        System.out.println(sumRegion(4,4,4,4,ans));

        for (int[] a :
                ans) {
            System.out.println(Arrays.toString(a));
        }
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
