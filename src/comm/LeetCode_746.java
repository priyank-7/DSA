package comm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LeetCode_746 {
    public static void main(String[] args) {

        int [] arr = {0,2,2,1};
        System.out.println(solve3(arr,arr.length));
    }

    static int minCost(int [] cost){
        int n = cost.length;

        List<Integer> dp = new ArrayList<>(Collections.nCopies(n+1,-1));
//        int ans = Math.min(solve(cost,n-1), solve(cost,n-2));

        int ans = Math.min(solve1(cost,n-1, dp), solve1(cost,n-2, dp));
        return ans;
    }

    static int solve(int [] cost, int n){
        // Base case
        if (n == 0){
            return cost[0];
        }
        if (n == 1){
            return cost[1];
        }

        int ans = cost[n] + Math.min(solve(cost,n-1),solve(cost,n-2));

        return ans;
    }

    static int solve1 (int [] cost, int n, List<Integer> dp){
        // Base case
        if (n == 0){
            return cost[0];
        }
        if (n == 1){
            return cost[1];
        }

        // checking it value for n is present in dp or not
        if (dp.get(n) != -1){
            return dp.get(n);
        }

        dp.set(n, cost[n] + Math.min(solve1(cost,n-1, dp),solve1(cost,n-2, dp)));

        return dp.get(n);

    }

    static int solve2 (int [] cost, int n){

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
