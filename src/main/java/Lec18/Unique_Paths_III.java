package Lec18;


public class Unique_Paths_III {
    class Solution {
        int res = 0, empty = 1;
        public int uniquePathsIII(int[][] grid) {
            int rs = 0;
            int cs = 0;
            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid[0].length; ++j) {
                    if (grid[i][j] == 0) empty++;
                    else if (grid[i][j] == 1) {
                        rs = i;
                        cs = j;
                    }
                }
            }
            uniquePaths(grid, rs, cs);
            return res;
        }

        public void uniquePaths(int[][] grid, int row, int col) {
            if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] < 0)
                return;
            if (grid[row][col] == 2) {
                if (empty == 0) res++;
                return;
            }
            grid[row][col] = -2;
            empty--;
            uniquePaths(grid, row + 1, col);
            uniquePaths(grid, row - 1, col);
            uniquePaths(grid, row, col + 1);
            uniquePaths(grid, row, col - 1);
            grid[row][col] = 0;
            empty++;
        }
    }
}
