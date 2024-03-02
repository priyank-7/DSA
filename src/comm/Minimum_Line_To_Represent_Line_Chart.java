package comm;

import java.util.Arrays;

public class Minimum_Line_To_Represent_Line_Chart {
    public static void main(String[] args) {
        int [][] arr = {{83,35},{79,51},{61,48},{54,87},{44,93},{22,5},{87,28},};
        System.out.println(minimumLines(arr));
    }

    public static int minimumLines(int[][] arr) {
        Arrays.sort(arr,(a, b) -> (a[0] - b[0]));
        int slope = Integer.MAX_VALUE;
        int preslope = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            int y = arr[i][1]-arr[i-1][1];
            int x = arr[i][0]-arr[i-1][0];
            if(x == 0){
                if(preslope != Integer.MAX_VALUE){
                    count++;
                }
                else{
                    preslope = Integer.MAX_VALUE;
                }
            }
            slope = (y/x);
            if(slope != preslope){
                count++;
            }
            preslope = slope;
        }
        return count;
    }
}
