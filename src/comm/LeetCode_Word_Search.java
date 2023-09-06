package comm;

import java.util.Arrays;

public class LeetCode_Word_Search {
    public static void main(String[] args) {
        char [][] bord = {
                {'A','B'},
        };
        String word = "AB";
        System.out.println(exist(bord,word));
    }

    public static boolean exist(char[][] board, String word) {
        boolean [][]backT = new boolean[board.length][board[0].length];
        for (boolean[] b: backT) {
            Arrays.fill(b,true);
        }
        return helper(board,word,"",0,0,backT);
    }

    public static boolean helper(char[][] board, String word, String p, int row, int colum, boolean[][] backT){

        if (board.length == 1 && board[0].length == 1){
            if (word.equals(String.copyValueOf(board[row]))){
                return true;
            }
        }
        if (p.contains(word)){
            return true;
        }
        boolean flag = false;

        if (row < board.length-1){
            if (isSafe(row,colum,backT)) {
                backT[row][colum] = false;
                flag = helper(board, word, p + board[row][colum], row + 1, colum, backT);
                backT[row][colum] = true;
                if (flag) {
                    return true;
                }
            }
//            else {return false;}
        }
        if (colum < board[0].length-1){
            if (isSafe(row,colum,backT)) {
                backT[row][colum] = false;
                flag = helper(board, word, p + board[row][colum], row, colum + 1, backT);
                backT[row][colum] = true;
                if (flag) {
                    return true;
                }
            }
//            else {return false;}
        }
        if (row > 0){
            if (isSafe(row,colum,backT)) {
                backT[row][colum] = false;
                flag = helper(board, word, p + board[row][colum], row - 1, colum, backT);
                backT[row][colum] = true;
                if (flag) {
                    return true;
                }
            }
//            else {return false;}
        }
        if (colum > 0){
            if (isSafe(row,colum,backT)) {
                backT[row][colum] = false;
                flag = helper(board, word, p + board[row][colum], row, colum - 1, backT);
                backT[row][colum] = true;
                if (flag) {
                    return true;
                }
            }
//            else{return false;}
        }

        return false;
    }

    private static boolean isSafe(int row, int colum, boolean [][] backT){
        if (!backT[row][colum]){
            return false;
        }
        return true;
    }
}
