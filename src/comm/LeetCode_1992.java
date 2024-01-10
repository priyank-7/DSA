package comm;

import java.util.ArrayList;

                                //  Need To modify with return type of 2D array (findFarmland method)

public class LeetCode_1992 {
    public static void main(String[] args) {
        int [][] arr = {{0}};
        System.out.println(findFarmland(arr));
    }

    public static ArrayList<Integer> findFarmland(int[][] land) {

        ArrayList<Integer> list = new ArrayList<>();

        int count  = 0;

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1){
                    list.add(i);
                    list.add(j);
                    int [] arr = find(land, i, j);
                    list.add(arr[0]);
                    list.add(arr[1]);
                }
            }
        }
        return list;
    }

    static int[] find(int [][] land, int row, int colum){

        if (isSafe(land, row, colum)){
            if (land[row][colum] == 1){

                land[row][colum] = 0;

                int [] arr1 = find(land, row+1, colum);
                int [] arr2 = find(land, row, colum+1);
                arr1[0] = Math.max(arr1[0], arr2[0]);
                arr1[1] = Math.max(arr1[1], arr2[1]);
                return arr1;
            }
            else{
                return new int[] {row-1,colum-1};
            }
        }
        else{
            return new int[] {row-1,colum-1};
        }
    }


    private static boolean isSafe(int[][] land, int row, int colum) {

        try {
            int x = land[row][colum];
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
