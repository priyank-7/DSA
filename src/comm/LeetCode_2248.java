package comm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

                            //  need to improve time and space complexity

public class LeetCode_2248 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,37,34,45,10,12,27,13},{27,21,45,10,12,13}};
        System.out.println(intersection(arr));
    }

    public static List<Integer> intersection(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr[0].length; i++) {
            list.add(arr[0][i]);
        }
        return addEquals(arr, list, 1);
    }

    public static List<Integer> addEquals(int [][] arr, ArrayList<Integer> l, int n){

        if (n == arr.length){
            Collections.sort(l);
            return l;
        }
        var list = new ArrayList<Integer>();
        for (int j = 0; j < arr[n].length; j++) {
            if (l.contains(arr[n][j])){
                list.add(arr[n][j]);
            }
        }
        return addEquals(arr, list, n+1);
    }
}
