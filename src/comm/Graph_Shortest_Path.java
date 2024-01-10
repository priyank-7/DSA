package comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Shortest_Path {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> shortestPath(int n, int [][] edges, int src, int dest){
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for (int [] i :  edges){
            adjList.computeIfAbsent(i[0], value->new ArrayList<>()).add(i[1]);
            adjList.computeIfAbsent(i[1], value->new ArrayList<>()).add(i[0]);
        }

        HashMap<Integer,Boolean> visited = new HashMap<>();
        HashMap<Integer,Integer> parent = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        visited.put(src,true);
        parent.put(src,-1);
        while (!q.isEmpty()){
            int curr = q.peek();
            q.remove();

            for (int i : adjList.get(curr)){
                if(!visited.get(i)){
                    visited.put(i,true);
                    parent.put(i,curr);
                    q.add(i);
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int curr = dest;
        ans.add(curr);
        while (curr != src){
            curr = parent.get(curr);
            ans.add(curr);
        }
        return ans;
    }
}
