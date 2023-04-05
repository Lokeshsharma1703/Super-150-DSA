package Lec47;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 150;
        long[] dp = new long[n+1];
        System.out.println(fib(n, dp));
        System.out.println(fibbu(n));
    }


    // Top-down
    private static long fib(int n, long[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        long f1 = fib(n-1, dp);
        long f2 = fib(n-2, dp);
        return dp[n] = f1 + f2;
    }

    // Bottom-up
    private static long fibbu(int n){
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
