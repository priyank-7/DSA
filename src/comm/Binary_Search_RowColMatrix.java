package comm;

import java.util.Arrays;

public class Binary_Search_RowColMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,28,37,49},
                {33,34,38,50},
        };
        int target = 39;
        System.out.println(Arrays.toString(Search(arr,target)));
    }

    static int[] Search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while (r < matrix.length-1 && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
