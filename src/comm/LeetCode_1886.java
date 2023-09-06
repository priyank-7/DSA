package comm;

import java.util.Arrays;
import java.util.Collections;

public class LeetCode_1886 {
    public static void main(String[] args) {
        int [][] mat ={{0,1},{1,0}};
        int [][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)){
                return true;
            }
            else {
                rotate(mat);
            }
        }
        return false;
    }

    static void rotate (int [][] mat){

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {

                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length / 2; j++) {

                int temp = mat[i][j];
                mat[i][j] = mat[i][mat[0].length-1-j];
                mat[i][mat[0].length-1-j] = temp;
            }
        }
    }
}
