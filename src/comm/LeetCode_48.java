package comm;

import java.util.Arrays;

public class LeetCode_48 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for (int [] num: arr) {
            System.out.println(Arrays.toString(num));
        }
    }

    static void rotate(int [][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length-1-j];
                arr[i][arr[0].length-1-j] = temp;
            }
        }
    }
}
