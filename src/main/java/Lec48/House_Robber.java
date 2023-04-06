package Lec48;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }

    public static int rob(int[] nums) {
//        int[] dp = new int[nums.length];
//        Arrays.fill(dp, -1);
//        return robber(nums, 0, dp);
        return robberDP(nums);
    }

    private static int robberDP(int[] nums){

        if(nums.length==1){
            return nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<dp.length; i++){
            int rob = nums[i] + dp[i-2];
            int dontrob = dp[i-1];
            dp[i] = Math.max(rob, dontrob);
        }

        return dp[nums.length-1];

    }

    private static int robber(int[] nums, int i, int[] dp){

        if(i >= nums.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = nums[i] + robber(nums, i+2, dp);
        int dontrob = robber(nums, i+1, dp);
        return dp[i] = Math.max(rob, dontrob);

    }
}
