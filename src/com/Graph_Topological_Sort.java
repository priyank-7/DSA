package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Graph_Topological_Sort {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> topologicalSort(int n, int [][] edges){
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();

        for (int [] i : edges){
            adjList.computeIfAbsent(i[0], value -> new ArrayList<Integer>()).add(i[1]);
        }
        //  Call DFSTopological Sort util function for al components

        HashMap<Integer, Boolean> visited = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i : adjList.keySet()){
            if (!visited.get(i)){
                topoSort(i, visited, st, adjList);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!st.isEmpty()){
            ans.add(st.peek());
        }
        return ans;
    }

    private static void topoSort(int node, HashMap<Integer, Boolean> visited, Stack<Integer> st, HashMap<Integer, ArrayList<Integer>> adjList) {
        visited.put(node, true);

        for (int neighbour : adjList.get(node)){
            if (!visited.get(neighbour)){
                topoSort(neighbour, visited, st, adjList);
            }
        }
        st.push(node);
    }
}
