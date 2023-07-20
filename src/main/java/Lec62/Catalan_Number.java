package Lec62;

import java.util.*;

public class Catalan_Number {
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(catalanNumber(n, dp));
    }

    public static int catalanNumber(int n, int[] dp){
        if(n==0 || n==1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int res = 0;

        for (int i = 1; i <= n; i++) {
            res = res + catalanNumber(i-1, dp) * catalanNumber(n-i, dp);
        }

        return dp[n] = res;
    }
}
