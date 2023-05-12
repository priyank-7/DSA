package com;
import java.util.*;
public class aaa {

        public static void main(String[] args) {
            int[][] edges = {{2,4,5,6,7}, {4,3}, {4,2}, {5}, {6}, {}, {6}, {7,1,2}, {8,2,10}, {2,3}};
            int start = 9;
            int[] dist = dijkstra(edges, start);
            System.out.println(Arrays.toString(dist));
        }

        public static int[] dijkstra(int[][] edges, int start) {
            int n = edges.length;

            // Create an array to store the distance labels for each node
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[start-1] = 0;

            // Create a priority queue to store nodes that need to be explored
            PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            heap.offer(new int[] {start, 0});

            while (!heap.isEmpty()) {
                // Get the node with the smallest distance label
                int[] curr = heap.poll();
                int node = curr[0];
                int d = curr[1];

                // Skip this node if its distance label has already been updated
                if (d > dist[node-1]) continue;

                // Update the distance labels of its adjacent nodes
                for (int adj : edges[node-1]) {
                    int newDist = dist[node-1] + 1;
                    if (newDist < dist[adj-1]) {
                        dist[adj-1] = newDist;
                        heap.offer(new int[] {adj, newDist});
                    }
                }
            }

            return dist;
        }
    }

