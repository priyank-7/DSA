package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Cycle_Detection_Undirected_BSF {
    public static void main(String[] args) {

    }

    public static boolean cycle_detection(int vertex, int[][] edges){
        HashMap<Integer,ArrayList<Integer>> adjList = create_adjList(edges);
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for (int i : adjList.keySet()){
            if(!visited.get(i)){
                if(isCyclicBSF(i,adjList,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static HashMap<Integer, ArrayList<Integer>> create_adjList(int [][] edges){
        HashMap<Integer,ArrayList<Integer>> adjList = new HashMap<>();

        for (int [] i : edges){
            adjList.computeIfAbsent(i[0], value -> new ArrayList<>()).add(i[1]);
            adjList.computeIfAbsent(i[1], value -> new ArrayList<>()).add(i[0]);
        }
        return adjList;
    }

    public static boolean isCyclicBSF(int src, HashMap<Integer,ArrayList<Integer> >adj, HashMap<Integer,Boolean> visited){
        HashMap<Integer,Integer> parent = new HashMap<>();
        parent.put(src,-1);
        visited.put(src,true);
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (!q.isEmpty()){
            int front = q.peek();
            q.remove();

            for (int neighbour: adj.get(front)){
                if (visited.get(neighbour) && neighbour != parent.get(front)){
                    return true;
                }
                else if (!visited.get(neighbour)){
                    q.add(neighbour);
                    visited.put(neighbour,true);
                    parent.put(neighbour,front);
                }
            }
        }
        return false;
    }

}
