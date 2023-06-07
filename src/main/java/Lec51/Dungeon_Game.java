package Lec51;

import java.util.Arrays;

public class Dungeon_Game {
    public static void main(String[] args) {
        int[][] deamon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(calculateMinimumHP(deamon));
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length][dungeon[0].length];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return calculate(dungeon, 0, 0, dp);
    }

    private static int calculate(int[][] dungeon, int i, int j, int[][] dp){
        if(i>=dungeon.length || j>=dungeon[0].length){
            return Integer.MAX_VALUE;
        }

        if(i==dungeon.length-1 && j==dungeon[0].length-1){
            return dungeon[i][j] > 0 ? 1 : 1-dungeon[i][j];
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int right = calculate(dungeon, i, j+1, dp);
        int bottom = calculate(dungeon, i+1, j, dp);

        int healthPower = Math.min(right, bottom)-dungeon[i][j];

        return dp[i][j] = healthPower > 0 ? healthPower : 1;

    }
}
