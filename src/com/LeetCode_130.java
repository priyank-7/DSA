package com;

import java.util.Arrays;

                                        //  Should make it faster

public class LeetCode_130 {
    public static void main(String[] args) {
        char[][] arr = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solve(arr);
    }

    public static void solve(char[][] board) {

        boolean [][] bool = new boolean[board.length][board[board.length-1].length];

        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'O'){
                helper(board, bool, 0, j);
            }
        }

        for (int j = 0; j < board[board.length-1].length; j++) {
            if (board[board.length-1][j] == 'O'){
                helper(board, bool, board.length-1, j);
            }
        }

        for (int j = 0; j < board.length-1; j++) {
            if (board[j][0] == 'O'){
                helper(board, bool, j, 0);
            }
        }

        for (int j = 0; j < board.length-1; j++) {
            if (board[j][board[0].length-1] == 'O'){
                helper(board, bool, j,board[0].length-1);
            }
        }
        printArr(board, bool);
    }

    static void helper (char [][] bord,boolean [][] bool, int row, int colum){

        if (isSafe(bord, row, colum)){

            if (bool[row][colum]){
                return;
            }

            if (bord[row][colum] == 'O'){
                bool[row][colum] = true;

                helper(bord, bool, row+1, colum);
                helper(bord, bool, row-1, colum);
                helper(bord, bool, row, colum+1);
                helper(bord, bool, row, colum-1);
            }
            else {
                return;
            }
        }
        return;
    }

    private static boolean isSafe(char[][] bord, int row, int colum) {

        try {
            char c = bord[row][colum];
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    private static void printArr(char[][] bool, boolean [][] bord) {
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++) {
                if (bord[i][j]){
                    bool[i][j] = 'O';
                }
                else {
                    bool[i][j] = 'X';
                }
            }
            System.out.println(Arrays.toString(bool[i]));
        }
    }
}
