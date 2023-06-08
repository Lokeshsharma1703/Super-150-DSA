package Lec52;

import java.util.Arrays;

public class Knight_Dialer {
    public static void main(String[] args) {
        System.out.println(knightDialer(2));
    }

    public static int knightDialer(int n) {
        long res = 0;

        int[][][] dp = new int[n][4][3];
        for(int[][] arr : dp){
            for(int[] a : arr){
                Arrays.fill(a, -1);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                res += count(n-1, i, j, dp);
            }
        }

        return (int)(res % 1000000007);
    }

    private static int count(int n, int cr, int cc, int[][][] dp){
        if(cr<0 || cc<0 || cr>=4 || cc>=3 || (cc==0 && cr==3) || (cc==2 && cr==3)){
            return 0;
        }
        if(n==0){
            return 1;
        }

        if(dp[n][cr][cc] != -1){
            return dp[n][cr][cc];
        }

        int[] r = {-2, -2,  2,  2, -1,  1, -1,  1};
        int[] c = {-1,  1, -1,  1, -2, -2,  2,  2};

        long res = 0;

        for (int i = 0; i < 8; i++) {
            res += count(n-1, cr+r[i], cc+c[i], dp);
        }

        return dp[n][cr][cc] = (int)(res % 1000000007);
    }
}
