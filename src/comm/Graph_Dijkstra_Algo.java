package comm;

import java.util.*;


class Pair1 {
    int weight;
    int value;

    public Pair1() {
    }

    public Pair1(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Graph_Dijkstra_Algo {
    public static void main(String[] args) {
        int [][] arr = {
                {0,1,7},
                {0,2,1},
                {0,3,3},
                {1,2,3},
                {1,3,5},
                {1,4,1},
                {3,4,7},
        };
        System.out.println(dijksta_Algo(5,arr,0));
    }

    public static ArrayList<Integer> dijksta_Algo(int vertices, int[][] edges, int src) {
        HashMap<Integer, ArrayList<Pair1>> adjList = new HashMap<>();
        for (int[] i : edges) {
            adjList.computeIfAbsent(i[0], value -> new ArrayList<>()).add(new Pair1(i[1], i[2]));
        }

        ArrayList<Integer> dist = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            dist.add(Integer.MAX_VALUE);
        }

        HashSet<Pair1> set = new HashSet<>();
        dist.set(src, 0);
        set.add(new Pair1(0, src));

        Random rmd = new Random();

        LinkedHashSet<Pair> lst = new LinkedHashSet<>();
        while (!set.isEmpty()) {
//            Fetch top record
            Pair1 top = set.iterator().next();

            int nodeDistance = top.weight;
            int topNode = top.value;

//                remove top record now
            set.remove(top);
            for (Pair1 neighbour : adjList.get(topNode)) {
                if (nodeDistance + neighbour.weight < dist.get(neighbour.value)) {
                    Pair1 temp = new Pair1(dist.get(neighbour.value), neighbour.value);
                    if (set.contains(temp)) {
                        set.remove(temp);
                    }
//                  Distance update
                    dist.set(neighbour.value, nodeDistance + neighbour.weight);
                    set.add(new Pair1(dist.get(neighbour.value),neighbour.value));
                }
            }
        }
        return dist;
    }
}
