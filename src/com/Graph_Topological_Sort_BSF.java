package com;

import java.util.*;

public class Graph_Topological_Sort_BSF {
    public static void main(String[] args) {

    }

    public static boolean topological_sort_BSF(int n, int [][] edges){
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        HashMap<Integer,Integer> inDegree = new HashMap<>();

        for (int [] i : edges){
            adjList.computeIfAbsent(i[0], value -> new ArrayList<>()).add(i[1]);
        }
        for (int i : adjList.keySet()){
            inDegree.put(i, adjList.get(i).size());
        }


//        Push all elements with 0 inDegree
        Queue<Integer> q = new LinkedList<>();
        for (int i : inDegree.keySet()){
            if (inDegree.get(i) == 0){
                q.add(i);
            }
        }

//        Do bsf
        int count = 0;
        while (!q.isEmpty()){
            int front = q.peek();
            q.remove();

            //  Increament count
            count++;
            // neighbour indegree update
            for (int neighbour : adjList.get(front)){
                inDegree.put(neighbour,inDegree.get(neighbour)-1);
                if (inDegree.get(neighbour) == 0){
                    q.add(neighbour);
                }
            }
        }

        if(count == n){
            return false;
        }
        else{
            return true;
        }
    }
}
