package comm;

import java.util.Arrays;

public class LeetCode_733_Flood_Fill {
    public static void main(String[] args) {

        int [][] image = {{0,0,0}, {0,0,0}};

        for (int[] arr : floodFill(image, 0, 0, 0)) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    static void helper (int [][] image, int sr, int sc, int color, int def){

        if (isSafe(image, sr, sc)){

            if (image[sr][sc] == color){
                return;
            }
            if (image[sr][sc] == def) {

                image[sr][sc] = color;

                helper(image, sr + 1, sc, color, def);
                helper(image, sr - 1, sc, color, def);
                helper(image, sr, sc + 1, color, def);
                helper(image, sr, sc - 1, color, def);
            }
        }
    }

    private static boolean isSafe(int[][] image, int sr, int sc) {

        try {
            int pix = image[sr][sc];
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
