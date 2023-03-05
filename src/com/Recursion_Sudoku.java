package com;

public class Recursion_Sudoku {
    public static void main(String[] args) {

    }

    static boolean solve(int [][] bord){
        int n = bord.length;
        int row = -1;
        int colum = -1;

        boolean emptyLeft = true;

        //  This is how we are replace row and colum from argument
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (bord[i][j] == 0){
                    row = i;
                    colum = j;
                    emptyLeft = false;
                    break;
                }
            }
            //  If you found some empty element in row, then break
            if (emptyLeft == false){
                break;
            }
        }

        if (emptyLeft == true){
            return true;
            //  sudoku is solved
        }

        //  backtrack
        for (int number = 1; number < 9; number++) {
            if (isSafe(bord,row,colum,number)){
                bord[row][colum] = number;
                if (solve(bord)){
                    //  Found the answer
                    return true;
                }
                else{
                    //  Backtrack
                    bord[row][colum] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int [][] bord, int row, int colum, int num){
        //  check for the row
        for (int i = 0; i < bord.length; i++) {
            //  check if the number is on the row
            if (bord[row][colum] == num){
                return false;
            }
        }
        //  check for the colum
        for (int [] nums: bord) {
            //  check if the number is on the colum
            if (nums[colum] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(bord.length);
        int rowStart = row - row % sqrt;
        int columStart = colum - colum % sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colum; j < columStart + sqrt; j++) {
                if (bord[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
