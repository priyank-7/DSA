package comm;

import java.util.*;

public class Graph_Cycle_Detection_Undirected_DFS {
    public static void main(String[] args) {

    }

    public static boolean cycle_detection(int vertex, int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> adjList = create_adjList(edges);
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for (int i : adjList.keySet()) {
            if (!visited.get(i)) {
                if (isCyclicDFS(i, -1, adjList, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static HashMap<Integer, ArrayList<Integer>> create_adjList(int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();

        for (int[] i : edges) {
            adjList.computeIfAbsent(i[0], value -> new ArrayList<>()).add(i[1]);
            adjList.computeIfAbsent(i[1], value -> new ArrayList<>()).add(i[0]);
        }
        return adjList;
    }

    public static boolean isCyclicDFS(int node, int parent, HashMap<Integer, ArrayList<Integer>> adj, HashMap<Integer, Boolean> visited) {
        visited.put(parent, true);
        Stack<Integer> st = new Stack<>();

        for (int neighbour : adj.get(node)) {

            if (!visited.get(neighbour)) {
                if (isCyclicDFS(neighbour, node, adj, visited)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }
        return false;
    }
}
