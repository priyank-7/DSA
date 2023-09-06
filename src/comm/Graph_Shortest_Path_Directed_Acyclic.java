package comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Pair
{
    int value1;
    int value2;
    Pair(int a, int b) {
        value1=a;
        value2=b;
    }
}
public class Graph_Shortest_Path_Directed_Acyclic {
    public static void main(String[] args) {
        int [][] arr = {
                {0,1,5},
                {0,2,3},
                {0,2,2},
                {1,3,6},
                {2,3,7},
                {2,4,4},
                {2,5,2},
                {3,4,1},
                {4,5,-2},
        };
        shorted_Path(7,arr);
    }

    public static void shorted_Path(int n , int [][] edges){
        HashMap<Integer, ArrayList<Pair>> adjList = new HashMap<>();
        for(int [] i : edges) {
            adjList.computeIfAbsent(i[0], value -> new ArrayList<>()).add(new Pair(i[1],i[2]));
            adjList.computeIfAbsent(i[1], value -> new ArrayList<>()).add(new Pair(i[0],i[2]));
        }
        for(int i : adjList.keySet()){
            for (Pair j : adjList.get(i)){
                System.out.print(i);
                System.out.print(j.value1);
                System.out.print(j.value2);
                System.out.println();
            }
        }
//    Topological Sort
        HashMap<Integer, Boolean> visited = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i : adjList.keySet()){
            if(!visited.get(i)){
                dfs(i, visited, st, adjList);
            }
        }

        int src = 1;
        ArrayList<Integer> dist = new ArrayList<>();
        for(int i = 0; i<n; i++){
            dist.set(i, Integer.MAX_VALUE);
        }
        dist.set(src,0);
        while (!st.isEmpty()){
            int top = st.peek();
            st.pop();

            if (dist.get(top) != Integer.MAX_VALUE){
                for (Pair i : adjList.get(top)){
                    if (dist.get(top) + i.value2 < dist.get(i.value1)){
                        dist.set(i.value1,dist.get(top) + i.value2);
                    }
                }
            }
        }
        System.out.println(dist);
    }

    private static void dfs(int node, HashMap<Integer, Boolean> visited, Stack<Integer> st, HashMap<Integer, ArrayList<Pair>> adjList) {
        visited.put(node,true);

        for (Pair neighbour : adjList.get(node)){
            if(!visited.get(neighbour)){
                dfs(neighbour.value1,visited,st,adjList);
                st.add(neighbour.value1);
            }
        }
        st.add(node);
    }
}
