package Lec48;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<cost.length; i++){
            int fir = cost[i]+dp[i-2];
            int sec = cost[i]+dp[i-1];
            dp[i] = Math.min(fir, sec);
        }

        return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }
}
