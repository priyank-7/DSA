package comm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Max_Point_On_Line {
    public static void main(String[] args) {
        System.out.println(maxPoints(new int[][]{{1,1},{2,2},{3,3}}));
    }

    public static int maxPoints(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for(int i = 0; i < points.length; i++){
            int temp = gcd(points[i][0], points[i][1]);
            map.computeIfAbsent(temp, v -> 0);
            int mx = map.get(temp);
            map.put(temp, map.get(temp)+1);
            max = Math.max(max, mx+1);
        }
        return max;
    }

    public static int gcd(int x, int y){
        if(x == 0){
            return y;
        }
        return gcd(y%x, x);
    }
}
