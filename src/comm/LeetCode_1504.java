package comm;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_1504 {
    public static void main(String[] args) {

    }

    public int numSubmat(int[][] mat) {

        boolean [][] bool = new boolean[mat.length][mat[0].length];

        int ans = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1){
//                    ans = helper(mat, bool, i, j);

                }
            }
        }

        return ans;
    }

//    static int helper(int [][] mat, boolean [][] bool,  int row, int colum){
//        var list = new ArrayList<Integer>();
//
//        list.add(Row(mat, bool, row, colum));
//        list.add(Colum(mat, bool, row, colum));
//
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum +=
//        }
//    }

    static int Row(int [][] mat, boolean [][] bool, int row, int colum){

        if (mat[row][colum] != 1){
            return 0;
        }
        bool[row][colum] = true;
        return 1 + Row(mat, bool, row+1, colum);
    }

    static int Colum(int [][] mat, boolean [][] bool, int row, int colum){

        if (mat[row][colum] != 1){
            return 0;
        }
        bool[row][colum] = true;
        return 1 + Row(mat, bool, row, colum+1);
    }
}