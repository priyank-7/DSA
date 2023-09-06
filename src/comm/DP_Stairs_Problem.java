package comm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DP_Stairs_Problem {
    public static void main(String[] args) {
        int [] cost = {1,100,1,1,1,100,1,1,100,1};

        int n = cost.length;
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n+1,-1));
        // int ans = Math.min(solve1(cost,n-1, dp), solve1(cost,n-2, dp));
        System.out.println(solve2(cost,2));

    }

//    static int solve1 (int [] cost, int n, List<Integer> dp){
//        // Base case
//        if (n == 0){
//            return cost[0];
//        }
//        if (n == 1){
//            return cost[1];
//        }
//
//        // checking it value for n is present in dp or not
//        if (dp.get(n) != -1){
//            return dp.get(n);
//        }
//
//        dp.set(n, cost[n] + Math.min(solve1(cost,n-1, dp),solve1(cost,n-2, dp)));
//
//        return dp.get(n);
//
//    }

    static int solve2 (int [] cost, int n){

        if (n == 1){
            return 0;
        }
        // step 1
        int [] dp = new int[n];
        // step 2
        dp[0] = cost[0];
        dp[1] = cost[1];

        // step 3

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }

        return Math.min(dp[n-1],dp[n-2]);
    }

    static int solve3 (int [] cost, int n){

        if (n == 1){
            return 0;
        }
        int ans = 0;

        int curr = -1;
        while (curr+2 <= n){
            if (cost[curr+1] < cost[curr+2]){
                ans = ans + cost[curr+1];
                curr = curr+1;
            }
            else{
                ans = ans + cost[curr+2];
                curr = curr+2;
            }
        }
        return ans;
    }

}
