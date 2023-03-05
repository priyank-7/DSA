package com;

public class LeetCode_463 {
    public static void main(String[] args) {
        int [][] grid = {
                {1,0,0},
                {1,0,0}

        };
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
                perimeter += perimeter(grid, i);
        }
        return perimeter;
    }


    public static int perimeter (int [][] grid, int row){
        int perimeter = 0;

        for (int i = 0; i < grid[row].length; i++) {

            if (grid[row][i] == 1) {

                if (grid.length == 1 && grid[row].length == 1){
                    return 4;
                }
                else if (grid.length == 1) {
                    perimeter += perimeterRow(grid, row, i);
                }
                else if (grid[row].length == 1) {
                    perimeter += perimeterCol(grid, row, i);
                }
                else {
                    perimeter += check(grid, row, i);
                }
            }
        }
        return perimeter;
    }

    private static int perimeterCol(int[][] grid, int row, int colum) {
        int perimeter = 4;
        if (row == 0){
            if (grid[row+1][colum] == 1){
                perimeter--;
            }
        }
        else if (row == grid.length-1 && colum == grid[row].length-1){
            if (grid[row-1][colum] == 1){
                perimeter--;
            }
        }
        else {
            if (grid[row-1][colum] == 1){
                perimeter--;
            }
            if (grid[row+1][colum] == 1){
                perimeter--;
            }
        }
        return perimeter;
    }

    private static int perimeterRow(int[][] grid, int row, int colum) {
        int perimeter = 4;
        if (colum == 0){
            if (grid[row][colum+1] == 1){
                perimeter--;
            }
        }
        else if (row == grid.length-1 && colum == grid[row].length-1){
            if (grid[row][colum-1] == 1){
                perimeter--;
            }
        }
        else {
            if (grid[row][colum-1] == 1){
                perimeter--;
            }
            if (grid[row][colum+1] == 1){
                perimeter--;
            }
        }
        return perimeter;
    }

    public static int check(int [][] grid, int row, int colum) {
        int perimeter = 4;

            if (row == 0 && (colum > 0 && colum < grid[row].length-1)) {
                if (grid[row][colum - 1] == 1) {
                    perimeter--;
                }
                if (grid[row][colum + 1] == 1) {
                    perimeter--;
                }
                if (grid[row + 1][colum] == 1) {
                    perimeter--;
                }
            }
            if (colum == 0 && (row > 0 && row < grid.length-1)) {
                if (grid[row - 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row + 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row][colum + 1] == 1) {
                    perimeter--;
                }
            }
            if (row == 0 && colum == 0) {
                if (grid[row + 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row][colum + 1] == 1) {
                    perimeter--;
                }
            }
            if (colum == grid[row].length - 1 && (row < grid.length - 1 && row > 0)) {
                if (grid[row - 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row + 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row][colum - 1] == 1) {
                    perimeter--;
                }
            }
            if (row == grid.length - 1 && (colum < grid[row].length - 1 && colum > 0)) {
                if (grid[row - 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row][colum - 1] == 1) {
                    perimeter--;
                }
                if (grid[row][colum + 1] == 1) {
                    perimeter--;
                }
            }
            if (row == grid.length-1 &&  colum == grid[row].length-1){
                if (grid[row - 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row][colum - 1] == 1) {
                    perimeter--;
                }
            }
            if ((row > 0 && row < grid.length-1) && (colum > 0 && colum < grid[row].length-1)){
                if (grid[row - 1][colum] == 1) {
                    perimeter--;
                }
                if (grid[row][colum - 1] == 1) {
                    perimeter--;
                }
                if (grid[row][colum + 1] == 1) {
                    perimeter--;
                }
                if (grid[row+1][colum] == 1) {
                    perimeter--;
                }
            }
            if (row == 0 && colum == grid[row].length-1){
                if (grid[row+1][colum] == 1){
                    perimeter--;
                }
                if (grid[row][colum-1] == 1){
                    perimeter--;
                }
            }
            if (colum == 0 && row == grid.length-1){
                if (grid[row][colum+1] == 1){
                    perimeter--;
                }
                if (grid[row-1][colum] == 1){
                    perimeter--;
                }
            }
            return perimeter;
    }
}
