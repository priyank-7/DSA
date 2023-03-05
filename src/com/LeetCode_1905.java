package com;

public class LeetCode_1905 {
    public static void main(String[] args) {

        int [][] grid1 = {{1,0,1,0,1},{1,1,1,1,1},{0,0,0,0,0},{1,1,1,1,1},{1,0,1,0,1}};
        int [][] grid2 = {{0,0,0,0,0},{1,1,1,1,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,0,0,1}};
        System.out.println((countSubIslands(grid1, grid2)));
    }

    public static int countSubIslands(int[][] grid1, int[][] grid2) {

        int count = 0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                if (grid2[i][j] == 1){
                    count += MainHelper(grid1, grid2, i, j);
                }
            }
        }

        return count;
    }

    public static int MainHelper(int[][] grid1, int[][] grid2, int row, int colum){

        if (helper(grid1, grid2, row, colum)){
            return 1;
        }
        return 0;
    }

    public static boolean helper(int[][] grid1, int[][] grid2, int row, int colum){

        if (isSafe(grid2, row, colum)){
            if (grid2[row][colum] == 1) {
                if (grid1[row][colum] == 1) {
                    grid2[row][colum] = 0;

                    if (helper(grid1, grid2, row + 1, colum) && helper(grid1, grid2, row - 1, colum) && helper(grid1, grid2, row, colum + 1) &&
                            helper(grid1, grid2, row, colum - 1)){
                        grid2[row][colum] = 1;
                        return true;
                    }
                }
                else {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private static boolean isSafe(int[][] grid2, int row, int colum) {
        try {
            int n = grid2[row][colum];
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
