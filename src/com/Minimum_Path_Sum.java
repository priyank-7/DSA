package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Minimum_Path_Sum {
    public static void main(String[] args) {

        int [][] aerr ={
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        minPathSum(aerr);

    }

    public static int minPathSum(int[][] grid) {
        int [][] arr = new int [grid.length][grid[0].length];

        prefixSum(arr,grid);
        for(int [] i : arr){
            System.out.println(Arrays.toString(i));
        }
        return 0;
    }

    public static void prefixSum(int [][] arr, int [][] grid){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){

                if(i == 0 && j == 0){
                    arr[i][j] = grid[i][j];
                }
                else if(i == 0){
                    arr[i][j] = arr[i][j-1] + grid[i][j];
                }
                else if(j == 0){
                    arr[i][j] = arr[i-1][j] + grid[i][j];
                }
                else if(i == arr.length-1 && j == 0){
                    arr[i][j] = arr[i-1][j] + grid[i][j];
                }
                else if(j == arr[0].length-1 && i == 0){
                    arr[i][j] = arr[i][j-1] + grid[i][j];
                }
                else{
                    arr[i][j] = Math.min(arr[i-1][j], arr[i][j-1]) + grid[i][j];
                }
            }
        }
    }
}
