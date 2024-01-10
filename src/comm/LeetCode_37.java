package comm;


public class LeetCode_37 {
    public static void main(String[] args) {

        int [][] arr = {{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 7, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 7, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        solveSudoku(arr);

    }

    public static void solveSudoku(int [][] board) {

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != 0){
                    check(board, i, j);
                }
            }
        }
    }

    static void check(int [][] board, int row, int colum){
        boolean flag = true;
        for(int i = 1; i <= 9; i++){
            flag = flag & checkCol(board, row, colum, i);
            flag = flag & checkRow(board, row, colum, i);
            flag = flag & checkBox(board, row, colum, i);
            if(flag){
                board[row][colum] = i;
            }
        }
    }

    static boolean checkCol(int [][] board, int row, int colum, int value){
        for(int i = 0; i <= 8; i++){
            if(board[i][colum] == value){
                return false;
            }
        }
        return true;
    }

    static boolean checkRow(int [][] board, int row, int colum, int value){
        for(int i = 0; i <= 8; i++){
            if(board[row][i] == value){
                return false;
            }
        }
        return true;
    }

    static boolean checkBox(int [][] board, int row, int colum, int value){
        int x = row/3;
        int y = colum/3;

        for(int i = 3*x; i< 3*(x+1); i++){
            for(int j = 3*y; j< 3*(y+1); j++){
                if(board[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
}
