package com;

public class Reorder_Rought_to_Make_All_Paths_Leads_To_The_City_Zero {
    public static void main(String[] args) {

        int [][] arr = {
                {0,1},
                {1,2},
                {3,2},

        };
        System.out.println(minReorder(4,arr));
    }

    public static int minReorder(int n, int[][] connections) {

        int [] parent = new int [n];
        for(int [] i : connections){
            parent[i[1]] = i[0];
            parent[i[0]] = i[1];
        }
        int edges = 0;

        for(int i : parent){
            if(i != 0){
                edges++;
            }
        }
        return edges;
    }

//    public static int ckparent(int [] parent, int i){
//        int temp = i;
//        while(parent[temp] != temp){
//            temp = parent[temp];
//        }
//        return parent[temp];
//    }
}
