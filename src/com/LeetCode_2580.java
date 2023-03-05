package com;

public class LeetCode_2580 {
    public static void main(String[] args) {
        int [][] arr = {{34,56},{28,29},{12,16},{11,48},{28,54},{22,55},{28,41},{41,44}};
        System.out.println(countWays(arr));
    }

    public static int countWays(int[][] arr) {

        boolean [] ck = new boolean[arr.length];

        int n = arr.length;
        for(int i = 0; i< arr.length; i++){
                for(int j = i+1; j < arr.length; j++){
                        if ((arr[j][0] <= arr[i][0] && arr[j][1] >= arr[i][0]) || (arr[j][0] <= arr[i][1] && arr[j][1] >= arr[i][1])
                                || (arr[j][0] >= arr[i][0] && arr[j][1] <= arr[i][0]) || (arr[j][0] >= arr[i][1] && arr[j][1] <= arr[i][1])
                        || (arr[i][0] <= arr[j][0] && arr[i][1] >= arr[j][1])  || (arr[j][0] <= arr[i][0] && arr[j][1] >= arr[i][1])
                        ) {
                            if(!(ck[j] && ck[i])){
                                n--;
                                ck[i] = true;
                                ck[j] = true;
                            }
                        }
            }
        }
        return (int)Math.pow(2,n) % ((int)Math.pow(10,9) + 7);
    }

    public static int factorial(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result = (result*factor)% ((int)Math.pow(10,9) + 7);
        }

        return result;
    }
}
