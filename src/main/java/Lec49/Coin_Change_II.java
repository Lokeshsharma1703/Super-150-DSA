package Lec49;

public class Coin_Change_II {
    public static void main(String[] args) {
        System.out.println(change(5, new int[]{1,2,5}));
    }

    public static int change(int amount, int[] coins) {
//        return countCoin(amount, coins, 0);
        return countCoinDP(amount, coins);
    }

    private static int countCoinDP(int amount, int[] coins){
        int[][] dp = new int[coins.length+1][amount+1];

        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int inc = 0;
                int exc = 0;

                if(coins[i-1] <= j){
                    inc = dp[i][j-coins[i-1]];
                }
                exc = dp[i-1][j];

                dp[i][j] = inc + exc;
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }

    private static int countCoin(int amount, int[] coins, int i){

        if(amount==0){
            return 1;
        }
        if(i==coins.length){
            return 0;
        }

        int inc = 0;
        int exc = 0;
        if(coins[i] <= amount){
            inc = countCoin(amount-coins[i], coins, i);  // dp[amount-coins[i]][i]
        }
        exc = countCoin(amount, coins, i+1);  // dp[amount-coins[i]][i-1]

        return inc + exc;
    }
}
