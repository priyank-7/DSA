package comm;

public class LeetCode_695 {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {

        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, counter(grid, i, j));
                }
            }
        }
        return max;
    }

    public static int counter (int [][]grid, int row, int colum){

        if (isSafe(grid,row,colum)) {
            if (grid[row][colum] == 0) {
                return 0;
            }

            int count = 1;
            grid[row][colum] = 0;

            count += counter(grid, row + 1, colum) + counter(grid, row - 1, colum) + counter(grid, row, colum + 1) + counter(grid, row, colum - 1);
//            count += counter(grid, row - 1, colum);
//            count += counter(grid, row, colum + 1);
//            count += counter(grid, row, colum - 1);

            return count;
        }
        else {
            return 0;
        }
    }

    private static boolean isSafe(int [][] grid, int row, int colum){

        try {
            int x = grid[row][colum];
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
