package comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Graph_DFS_Undirected {
    public static void main(String[] args) {

        int [][] edges = {
                {0,2},
                {2,1},
                {2,4},
                {1,3},
                {3,4},
        };
        DFS(5,edges);
    }

    public static void DFS(int vertices, int [][] edges){
        HashMap<Integer, ArrayList<Integer>> adjList = createAdjList(edges);
        HashMap<Integer, Boolean> visited = new HashMap<>();

        for (int i : adjList.keySet()){
            visited.put(i ,false);
        }
        System.out.println(helper(adjList,visited));
    }

    public static HashMap<Integer, ArrayList<Integer>> createAdjList(int [][] edges){
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for (int[] i : edges){
            adjList.computeIfAbsent(i[0], value-> new ArrayList<>()).add(i[1]);
            adjList.computeIfAbsent(i[1], value-> new ArrayList<>()).add(i[0]);
        }
        return adjList;
    }

    public static ArrayList<Integer> helper (HashMap<Integer,ArrayList<Integer>> adjList, HashMap<Integer,Boolean> visited){

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : adjList.keySet()){
            if (!visited.get(i)){
                st.push(i);
                visited.put(i,true);
                while (!st.isEmpty()) {
                    int frontNode = st.peek();
                    st.pop();
                    list.add(frontNode);
                    for (int j : adjList.get(frontNode)) {
                        if (!visited.get(j)){
                            st.push(j);
                            visited.put(j,true);
                        }
                    }
                }
            }
        }
        return list;
    }
}
