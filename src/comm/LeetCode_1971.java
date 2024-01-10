package comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class LeetCode_1971 {
    public static void main(String[] args) {
        int [][] a = {
                {0,7},
                {0,8},
                {6,1},
                {2,0},
                {0,4},
                {5,8},
                {4,7},
                {1,3},
                {3,5},
                {6,5},
        };
        System.out.println(validPath(3,a,7,5));
    }
        public static boolean validPath(int n, int[][] edges, int source, int destination) {
            HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>();
            HashMap<Integer,Boolean> visited = new HashMap<>();

            for(int [] i : edges){
                adj.computeIfAbsent(i[0], value -> new ArrayList<>()).add(i[1]);
                adj.computeIfAbsent(i[1], value -> new ArrayList<>()).add(i[0]);
            }

            for(int i : adj.keySet()){
                visited.put(i, false);
            }

            return helper(adj, visited, source, destination);
        }

        public static boolean helper(HashMap<Integer,ArrayList<Integer>> adjList, HashMap<Integer, Boolean> visited, int src, int dest){
            visited.put(src,true);
            Stack<Integer> st = new Stack<>();
            st.add(src);
            while(!st.isEmpty()){
                int curr = st.peek();
                st.pop();


                if(curr == dest){
                    return true;
                }
                for(int i : adjList.get(curr)){
                    if(!visited.get(i)){
                        st.add(i);
                        visited.put(i,true);
                    }
                }
            }
            return false;
        }
}
