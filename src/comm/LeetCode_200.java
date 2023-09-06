package comm;

public class LeetCode_200 {
    public static void main(String[] args) {
        char[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    counter(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void counter (char [][]grid, int row, int colum){

        if (isSafe(grid,row,colum)) {
            if (grid[row][colum] == '0') {
                return;
            }

            grid[row][colum] = '0';

            counter(grid, row + 1, colum); // + counter(grid, row - 1, colum) + counter(grid, row, colum + 1) + counter(grid, row, colum - 1);
            counter(grid, row - 1, colum);
            counter(grid, row, colum + 1);
            counter(grid, row, colum - 1);
        }
        else {
            return;
        }
    }

    private static boolean isSafe(char [][] grid, int row, int colum){

        try {
            int x = grid[row][colum];
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
