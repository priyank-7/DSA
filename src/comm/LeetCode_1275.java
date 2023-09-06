package comm;


public class LeetCode_1275 {
    public static void main(String[] args) {

        int [][] moves = {{0,2},{2,0},{2,1},{0,1},{1,2}};
        System.out.println(tictactoe(moves));
    }

    public static String tictactoe(int[][] moves) {

        if (moves.length < 5){
            return "Pending";
        }

        char [][] fill = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fill[i][j] = 'D';
            }
        }
        fill(moves, fill);

        for (int i = 0; i < 3; i++) {
            if (fill[0][i] == 'A' || fill[0][i] == 'B') {
                if (helper_Colum(fill, 0, i, fill[0][i], 0) == fill[0][i]) {
                    return String.valueOf(fill[0][i]);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (fill[i][0] == 'A' || fill[i][0] == 'B') {
                if (helper_Row(fill, i, 0, fill[i][0], 0) == fill[i][0]) {
                    return String.valueOf(fill[i][0]);
                }
            }
        }
        if (fill[0][0] == 'A' || fill[0][0] == 'B') {
            if (helper_Dig_1(fill, 0, 0, fill[0][0], 0) == fill[0][0]) {
                return String.valueOf(fill[0][0]);
            }
        }
        if (fill[fill.length-1][0] == 'A' || fill[fill.length-1][0] == 'B') {
            if (helper_Dig_2(fill, fill.length - 1, 0, fill[fill.length - 1][0], 0) == fill[fill.length - 1][0]) {
                return String.valueOf(fill[fill.length - 1][0]);
            }
        }

        if (moves.length < 9){
            return "Pending";

        }
        return "Draw";
    }

    static void fill (int [][] moves, char [][] fill){

        int i = 1;
        for (int[] arr :moves) {

            if (i % 2 != 0) {
                fill[arr[0]][arr[1]] = 'A';
            }
            else {
                fill[arr[0]][arr[1]] = 'B';
            }
            i++;
        }
    }

    static char helper_Colum (char [][] fill, int row, int colum, char player, int count){

        if (count == 3){
            return player;
        }

        if (isSafe(fill, row, colum)){
            if (fill[row][colum] == player){
                count++;
                return helper_Colum(fill, row+1, colum, player, count);
            }
        }
        return 'D';
    }

    static char helper_Row (char [][] fill, int row, int colum, char player, int count){

        if (count == 3){
            return player;
        }

        if (isSafe(fill, row, colum)){
            if (fill[row][colum] == player){
                count++;
                return helper_Row(fill, row, colum+1, player, count);
            }
        }
        return 'D';
    }

    static char helper_Dig_1 (char [][] fill, int row, int colum, char player, int count){

        if (count == 3){
            return player;
        }

        if (isSafe(fill, row, colum)){
            if (fill[row][colum] == player){
                count++;
                return helper_Dig_1(fill, row+1, colum+1, player, count);
            }
        }
        return 'D';
    }

    static char helper_Dig_2 (char [][] fill, int row, int colum, char player, int count){

        if (count == 3){
            return player;
        }

        if (isSafe(fill, row, colum)){
            if (fill[row][colum] == player){
                count++;
                return helper_Dig_2(fill, row-1, colum+1, player, count);
            }
        }
        return 'D';
    }


    private static boolean isSafe(char[][] fill, int row, int colum) {

        try {
            char c = fill[row][colum];
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
