package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {

        int V = 6;
        int E = 8;

        int a [][] = new int[V+1][E+1];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < E*2; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            addEdge(adj,s,d);
        }

        for (int i = 0; i < V; i++) {
            System.out.println(adj.get(i));
        }
    }

    static void addEdge(int[][] a, int source, int destination){
        a[source][destination] = 1;
//        a[destination][source] = 1;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination){
        adj.get(source).add(destination);
//        adj.get(destination).add(source);
    }


}
