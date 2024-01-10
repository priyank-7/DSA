package comm;

public class Recursion_NQueens {
    public static void main(String[] args) {
        boolean [] [] bord = new boolean[4][4];
        System.out.println(queens(bord,0));
    }

    static int queens(boolean[][] bord, int row){
        if (row == bord.length){
            display(bord);
            System.out.println();
            return 1;
        }

        int count = 0;
        //  Placing the queen and checking for every row and colum
        for (int col = 0; col < bord.length; col++) {
            //  Place the queen if it is safe
            if (isSafe(bord, row, col)){
                bord[row][col] = true;
                count += queens(bord,row+1);
                bord[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] bord, int row, int col) {
        //  Check vertical row
        for (int i = 0; i < row; i++) {
            if (bord[i][col]){
                return false;
            }
        }
        //Diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 0; i <= maxLeft; i++) {
            if (bord[row-i][col-i]){
                return false;
            }
        }
        //Diagonal right
        int maxRight = Math.min(row,bord.length-col-1);
        for (int i = 0; i <= maxRight; i++) {
            if (bord[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean [] [] bord){
        for(boolean [] row : bord){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
