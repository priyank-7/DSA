package comm;

import java.util.*;

public class Graph_BFS_Undirected {
    public static void main(String[] args) {

        int m = 6;
        int [][] edges = new int[5][2];
        edges[0] = new int[]{1,2};
        edges[1] = new int[]{2,3};
        edges[2] = new int[]{3,4};
        edges[3] = new int[]{4,5};
        edges[4] = new int[]{4,1};
//        edges[5] = new int[]{5,1};

        System.out.println(BFS(5,edges));

    }

    public static ArrayList<Integer> BFS(int vertex, int edges[][]){

        HashMap<Integer,ArrayList<Integer>> adjList = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();


        adjList = prepareAdjList(adjList,edges);
        for(Integer i : adjList.keySet()){
            visited.put(i,false);
        }


        //  Traversing all components of a graph
        for (int i : adjList.keySet()){
            if(!visited.get(i)){
                ans = bfs(adjList, visited, ans, i);
            }
        }
        return ans;
    }

    public static HashMap<Integer, ArrayList<Integer>> prepareAdjList(HashMap<Integer,ArrayList<Integer>> adjList, int edges[][]){
        for (int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
            adjList.computeIfAbsent(v, value -> new ArrayList<>()).add(u);
        }
        return adjList;
    }

    public static ArrayList<Integer> bfs(HashMap<Integer,ArrayList<Integer>> adjList, HashMap<Integer,Boolean> visited, ArrayList<Integer> ans, int node){

        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited.put(node,true);
        while (!q.isEmpty()){
            int frontNode = q.peek();
            q.remove();
            //  Store frontnode into and
            ans.add(frontNode);

            //  Traverse all neighbour of frontnode
            for (int i: adjList.get(frontNode)){
                System.out.println(i);
                if(!visited.get(i)){
                    q.add(i);
                    visited.put(i,true);
                }
            }
        }
        return ans;
    }
}
