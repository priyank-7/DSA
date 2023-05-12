package com;

public class NumbersOfEnclaves {
    public static void main(String[] args) {
        int [][] arr= {
                {0,0,0,0},
                {1,0,1,0},
                {0,1,1,0},
                {0,0,0,0}
        };
        System.out.println(numEnclaves(arr));
    }
    public static int numEnclaves(int[][] grid) {
        int rows = grid.length, cols = grid[0].length,
                count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == rows-1 || j == cols-1) {
                    helper(grid, i, j);
                }
            }
        }
        for (int[] i : grid) {
            for (int j : i) {
                count += j;
            }
        }

        return count;
    }

    public static void helper(int [][] arr, int row, int column) {

        if(row < 0 || column < 0 || row >= arr.length || column >= arr[0].length){
            return;
        }
        if(arr[row][column] == 0){
            return;
        }

        arr[row][column] = 0;
        helper(arr, row, column-1);
        helper(arr, row, column+1);
        helper(arr, row-1, column);
        helper(arr, row+1, column);
        return;

    }

}
