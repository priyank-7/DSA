package comm;

import java.util.Arrays;

public class Recursion_Sum_triangle_from_array {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        SumTri(arr);
    }
    static void SumTri(int [] arr){
        int[] a = new int [arr.length-1];

        if (arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 0; i < arr.length-1; i++) {
            a[i] = arr[i]+arr[i+1];
        }

        SumTri(a);
        System.out.println(Arrays.toString(arr));
    }
}
