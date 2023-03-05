package com;

import java.util.ArrayList;

public class Recursion_Counting_Path {
    public static void main(String[] args) {
        countingPath("",3,3);
        System.out.println(countingPathReturn("",3,3));
        System.out.println(countingPath1(3,3));
        System.out.println(countingPathReturnDiagonal("",3,3));
        System.out.println(countingPathDiagonal1(3,3));

        boolean [][]maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        countingPathRestrication("",maze,0,0);
    }

    //  Printing the total answer
    static void countingPath(String p, int right, int down){

        if (right == 1 && down == 1){
            System.out.println(p);
            return;
        }

        if (right > 1) {
            countingPath(p + 'H', right - 1, down);
        }
        if (down > 1) {
            countingPath(p + 'V', right, down - 1);
        }
    }

    //  Return the list of total answer
    static ArrayList<String> countingPathReturn(String p, int right, int down){

        ArrayList<String> list = new ArrayList<>();

        if (right == 1 && down == 1){
            list.add(p);
            return list;
        }

        if (right > 1) {
            list.addAll(countingPathReturn(p + 'H', right - 1, down));
        }
        if (down > 1) {
            list.addAll(countingPathReturn(p + 'V', right, down - 1));
        }

        return list;
    }

    //  Return the total number of answer
    static int countingPath1(int row, int colum){

        if (row == 1 || colum == 1){
            return 1;
        }

        int left = countingPath1(row - 1, colum);
        int right = countingPath1(row,colum-1);

        return left+right;
    }

    //  Using the diagonal path
    static ArrayList<String> countingPathReturnDiagonal(String p, int right, int down){

        ArrayList<String> list = new ArrayList<>();

        if (right == 1 && down == 1){
            list.add(p);
            return list;
        }

        if (right > 1) {
            list.addAll(countingPathReturnDiagonal(p + 'H', right - 1, down));
        }
        if (down > 1) {
            list.addAll(countingPathReturnDiagonal(p + 'V', right, down - 1));
        }
        if (right > 1 && down > 1){
            list.addAll(countingPathReturnDiagonal(p + 'D', right-1, down - 1));
        }

        return list;
    }

    //  Returning the total number of answer
    static int countingPathDiagonal1(int row, int colum){

        if (row == 1 || colum == 1){
            return 1;
        }

        int left = countingPathDiagonal1(row - 1, colum);
        int right = countingPathDiagonal1(row,colum-1);
        int diagonal = countingPathDiagonal1(row-1,colum-1);

        return left+right+diagonal;
    }

    static void countingPathRestrication(String p,boolean[][] maze, int right, int down){

        if (right == maze.length-1 && down == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[right][down]){
            return;
        }

        if (right < maze.length-1) {
            countingPathRestrication(p + 'H', maze, right+1, down);
        }
        if (down < maze[0].length-1) {
            countingPathRestrication(p + 'V', maze, right, down+1);
        }
    }
}
