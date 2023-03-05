package com;

public class Linear_Search_Find_Max_In_2D_Array {
    public static void main(String[] args) {
        int [][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
