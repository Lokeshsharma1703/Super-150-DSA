package Lec29;

public class Max_Area_of_Island {
    public static void main(String[] args) {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int area = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area = Math.max(area, maxArea(grid, i, j));
                }
            }
        }
        System.out.println(area);
    }
    private static int maxArea(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        int tempArea = 0;
        int[] r = {0, 0, -1, 1};
        int[] c = {-1, 1, 0, 0};
        for(int k=0;k<r.length;k++){
            tempArea += maxArea(grid, i+r[k], j+c[k]);
        }
        return tempArea+1;
    }
}
