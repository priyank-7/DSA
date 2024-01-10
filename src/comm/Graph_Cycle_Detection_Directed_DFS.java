package comm;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph_Cycle_Detection_Directed_DFS {
    public static void main(String[] args) {

    }

    public static boolean cycleDetection(int n, int [][] edges){
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();

        for (int [] i : edges){
            adjList.computeIfAbsent(i[0], value -> new ArrayList<Integer>()).add(i[1]);
        }

//        call DFS for all components
        HashMap<Integer,Boolean> dfsvisited = new HashMap<>();

        for (int i : adjList.keySet()){
            if(!visited.get(i)){
                if(checkCycle(i, visited, dfsvisited, adjList)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkCycle(int node, HashMap<Integer, Boolean> visited, HashMap<Integer, Boolean> dfsvisited, HashMap<Integer, ArrayList<Integer>> adjList) {
        visited.put(node,true);
        dfsvisited.put(node,true);

        for (int neighbour : adjList.get(node)){
            if (!visited.get(neighbour)){
                if (checkCycle(neighbour,visited,dfsvisited,adjList)){
                    return true;
                }
            }
            else {
                if (dfsvisited.get(node)){
                    return true;
                }
            }
        }
        dfsvisited.put(node,false);
        return false;
    }
}
