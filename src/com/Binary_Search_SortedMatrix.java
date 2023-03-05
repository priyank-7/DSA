package com;

import java.util.Arrays;

public class Binary_Search_SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(Search(arr,9)));
    }


    //  Search in the row provide between the columns provided

    public static int [] BinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart+(cEnd-cStart)/2;

            if (matrix[row][mid] == target){
                return new int[] {row,mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid+1;
            }
            else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int [] Search(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;    //  Be cautious, matrix may be empty

        if (rows == 1){
            return BinarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        //   Run the loop till the two rows remaining
        while (rStart < rEnd-1) {    // While this is true it will have rows more than 2
            int mid = rStart + (rEnd-rStart)/2;
            if (matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }
            else if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }

        // now we have two rows
        // Check weather the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }
        if (matrix[rStart+1][cMid] == target){
            return new int[] {rStart+1,cMid};
        }

        // Search in first half
        if(target <= matrix[rStart][cMid-1]){
            return BinarySearch(matrix,rStart,0,cMid-1,target);
        }
        // Search in Second Half
        else if ((target >= matrix[rStart][cMid+1]) && (target<= matrix[rStart][cols-1])){
            return BinarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // Search in Third Half
        else if (target <= matrix[rStart+1][cMid]){
            return BinarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        // Search in Fourth Half
        else{
            return BinarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}
