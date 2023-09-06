package comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class  graph_<I>{

    public graph_(){}
    HashMap<I, ArrayList<I>> adj = new HashMap<>();

    public void addEdge(I u, I v, boolean direction){
        //  Direction = 0 --> undirected
        //  Direction = 1 --> directed

        //  Create an edge from u to v
        adj.computeIfAbsent(u, value -> new ArrayList<I>()).add(v);
        if(direction){
              adj.computeIfAbsent(v, value -> new ArrayList<I>()).add(u);
        }
    }

    public void printAdjList(){
        for(Map.Entry<I, ArrayList<I>> i : adj.entrySet()){
            I key = i.getKey();
            ArrayList<I> values = i.getValue();
            System.out.println(key+" "+values);
        }
    }
}

public class Graph_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edges = sc.nextInt();
        int node = sc.nextInt();

        graph_<Character> g = new graph_<Character>();

        for (int i = 0; i< edges; i++){
            char u = sc.next().charAt(0);
            char v = sc.next().charAt(0);
//            Creating a directed Graph
            g.addEdge(u, v,true);
        }
        g.printAdjList();
    }
}
