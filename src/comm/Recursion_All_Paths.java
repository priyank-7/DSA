package comm;

import java.util.Arrays;

public class Recursion_All_Paths {
    public static void main(String[] args) {

        boolean [][]maze = {
                {true},
        };

        AllPath("",maze,0,0);
        int [][] path = new int[maze.length][maze[0].length];
        AllPath1("",maze,0,0, path,1);
    }

    //  This will print path
    static void AllPath(String p, boolean[][] maze, int row, int colum){

        if (row == maze.length-1 && colum == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[row][colum]){
            return;
        }

        //  I am considering  this block in my path

        maze[row][colum] = false;

        if (row < maze.length-1) {
            AllPath(p + 'R', maze, row+1, colum);
        }
        if (colum < maze[0].length-1) {
            AllPath(p + 'D', maze, row, colum+1);
        }
        if (row > 0) {
            AllPath(p + 'U', maze, row-1, colum);
        }
        if (colum > 0) {
            AllPath(p + 'L', maze, row, colum-1);
        }

        //  This line is where the function over
        //  so before the function gets removed, also removed the changes that were made by that function

        maze[row][colum] = true;
    }

    //  This will print steps also
    static void AllPath1(String p, boolean[][] maze, int row, int colum, int [][] path, int steps){

        if (row == maze.length-1 && colum == maze[0].length-1){
            path[row][colum] = steps;
            for (int [] num: path) {
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[row][colum]){
            return;
        }

        //  I am considering  this block in my path

        maze[row][colum] = false;
        path[row][colum] = steps;

        if (row < maze.length-1) {
            AllPath1(p + 'R', maze, row+1, colum, path,steps+1);
        }
        if (colum < maze[0].length-1) {
            AllPath1(p + 'D', maze, row, colum+1, path, steps+1);
        }
        if (row > 0) {
            AllPath1(p + 'U', maze, row-1, colum,path,steps+1);
        }
        if (colum > 0) {
            AllPath1(p + 'L', maze, row, colum-1,path,steps+1);
        }

        //  This line is where the function over
        //  so before the function gets removed, also removed the changes that were made by that function

        maze[row][colum] = true;
        path[row][colum] = 0;
    }
}
