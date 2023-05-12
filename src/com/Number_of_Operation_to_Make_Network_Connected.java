package com;

public class Number_of_Operation_to_Make_Network_Connected {
    public static void main(String[] args) {

    }
    public int makeConnected(int n, int[][] connections) {

        int edges = connections.length;
        if(edges < n-1){
            return -1;
        }
        int [] parent = new int [n];
        for(int i = 0; i < parent.length; i++){
            parent[i] = i;
        }
        int components = n;
        for(int [] i : connections){
            int p1 = findParent(parent, i[0]);
            int p2 = findParent(parent, i[1]);
            if(p1 != p2){
                parent[p1] = p2;
                components--;
            }
        }
        return components-1;

    }

    public static int findParent(int [] parent, int i){
        int temp = i;
        while(parent[temp] != temp){
            temp = parent[temp];
        }
        return parent[temp];
    }
}
