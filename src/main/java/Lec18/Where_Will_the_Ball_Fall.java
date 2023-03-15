package Lec18;

public class Where_Will_the_Ball_Fall {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1,1,1,1},
                {-1,-1,-1,-1,-1,-1},
                {1,1,1,1,1,1},
                {-1,-1,-1,-1,-1,-1}
        };
        int n = grid.length;
        int m = grid[0].length;
        int[] res = new int[m];
        for(int i=0;i<m;i++){
            int row=0;
            int col=i;
            while (row<n && !isBlocked(grid, col, row)){
                col+=grid[row][col];
                row+=1;
            }
            res[i] = row==n?col:-1;
        }
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    private static boolean isBlocked(int[][] grid, int col, int row){
        if((grid[row][col]==1 && col==grid[0].length-1) || (grid[row][col]==-1 && col==0) || (grid[row][col]==1 && grid[row][col+1]==-1) || (grid[row][col]==-1 && grid[row][col-1]==1)){
            return true;
        }
        return false;
    }
}
