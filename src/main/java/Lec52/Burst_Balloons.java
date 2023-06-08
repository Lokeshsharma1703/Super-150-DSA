package Lec52;

public class Burst_Balloons {
    public static void main(String[] args) {
        int[] nums = {3,1,5,8};
        System.out.println(maxCoins(nums));
    }

    public static int maxCoins(int[] nums) {
        int[] arr = new int[nums.length+2];
        arr[0] = 1;
        arr[arr.length-1] = 1;

        for(int i=1; i<arr.length-1; i++){
            arr[i] = nums[i-1];
        }

//        return burst(arr, 0, arr.length-1);
        return burstBU(arr);
    }

    private static int burst(int[] arr, int si, int ei){
        if(si+1==ei){
            return 0;
        }

        int res = Integer.MIN_VALUE;

        for(int k=si+1; k<ei; k++){
            int lft = burst(arr, si, k);
            int rgt = burst(arr, k, ei);
            int self = arr[si] * arr[k] * arr[ei];

            res = Math.max(res, self+lft+rgt);
        }

        return res;
    }

    private static int burstBU(int[] arr){
        int[][] dp = new int[arr.length][arr.length];

        for(int slide=2; slide<dp.length; slide++){
            for(int j=slide; j<dp.length; j++){
                int i = j-slide;

                int res = Integer.MIN_VALUE;

                for(int k=i+1; k<j; k++){
                    int lft = dp[i][k];
                    int rgt = dp[k][j];
                    int self = arr[i] * arr[k] * arr[j];

                    res = Math.max(res, self+lft+rgt);
                }

                dp[i][j] = res;
            }
        }

        return dp[0][dp.length-1];

    }
}
