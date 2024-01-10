package comm;


//  When a choose effect the future answer use the back tracking


public class Recursion_NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean [] [] bord = new boolean[n][n];
        knight(bord,0,0,4);
    }

    static void knight(boolean [][] bord, int row, int colum, int knights){

        if (knights == 0){
            display(bord);
            System.out.println();
            return;
        }

        if (row == bord.length-1 && colum == bord.length){
            return;
        }

        if (colum == bord.length){
            knight(bord,row+1,0,knights);
            return;
        }

        if (isSafe(bord,row,colum)){
            bord[row][colum] = true;
            knight(bord,row,colum+1,knights-1);
            bord[row][colum] = false;
        }
            knight(bord, row, colum + 1, knights);
    }

    private static boolean isSafe(boolean[][] bord, int row, int colum) {
        if (isValid(bord,row-2,colum-1)){
            if (bord[row-2][colum-1]){
                return false;
            }
        }
        if (isValid(bord,row-1,colum-2)){
            if (bord[row-1][colum-2]){
                return false;
            }
        }if (isValid(bord,row-2,colum+1)){
            if (bord[row-2][colum+1]){
                return false;
            }
        }
        if (isValid(bord,row-1,colum+2)){
            if (bord[row-1][colum+2]){
                return false;
            }
        }

        return true;

    }

    //  Do not repeat your self, hence created this function
    static boolean isValid(boolean[][] bord, int row, int col){
        if (row >= 0 && row < bord.length && col >= 0 && col < bord.length){
            return true;
        }
        return false;
    }


    private static void display(boolean [] [] bord){
        for(boolean [] row : bord){
            for (boolean element : row){
                if (element){
                    System.out.print("K ");
                }
                else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
