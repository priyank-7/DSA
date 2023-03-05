package com;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode_997 {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2}
        };
        System.out.println(findJudge(2,arr));
    }

    public static int findJudge(int n, int[][] trust) {
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();

        for(int [] i : trust){
            adjList.computeIfAbsent(i[0], value -> new ArrayList<>()).add(i[1]);
        }
        if(n - adjList.size() >= 2 || adjList.size() == n){
            return -1;
        }
        int possibility = 0;
        if(n - adjList.size() == 1){
            for (int i = 1; i <= n; i++) {
                if(!adjList.containsKey(i)){
                    possibility = i;
                    break;
                }
            }

            for (int i = 1; i <= n; i++) {
                if(i != possibility){
                    if (!adjList.get(i).contains(possibility)){
                        return -1;
                    }
                }
            }
        }
        return possibility;
    }
}
