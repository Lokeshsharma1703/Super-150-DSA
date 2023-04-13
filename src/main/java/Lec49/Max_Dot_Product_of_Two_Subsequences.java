package Lec49;

import java.util.Arrays;

public class Max_Dot_Product_of_Two_Subsequences {
    public static void main(String[] args) {
        System.out.println(maxDotProduct(new int[]{2,1,-2,5}, new int[]{3,0,-6}));
    }

    public static int maxDotProduct(int[] nums1, int[] nums2) {
//        int[][] dp = new int[nums1.length][nums2.length];
//        return maxProduct(nums1, nums2, 0, 0, true, dp);

        return maxProdBottomUp(nums1, nums2);
    }

    private static int maxProdBottomUp(int[] nums1, int[] nums2){

        int[][] dp = new int[nums1.length+1][nums2.length+1];

        int res = Integer.MIN_VALUE; // special case

        for(int i=1; i<=nums1.length; i++){
            for (int j = 1; j <= nums2.length ; j++) {

                int prod = (nums1[i-1] * nums2[j-1]) + dp[i-1][j-1];
                int first = dp[i-1][j];
                int second = dp[i][j-1];

                dp[i][j] = Math.max(nums1[i-1] * nums2[j-1], Math.max(prod, Math.max(first, second)));

                res = Math.max(res, nums1[i-1]*nums2[j-1]);

            }
        }

        if(dp[dp.length-1][dp[0].length-1]==0){
            return res;
        }

        return dp[dp.length-1][dp[0].length-1];

    }

    private static int maxProduct(int[] nums1, int[] nums2, int i, int j, boolean call, int[][] dp) {
        if (i == nums1.length || j == nums2.length) {
            return call ? 0 : -10000000;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int prod = (nums1[i] * nums2[j]) + maxProduct(nums1, nums2, i + 1, j + 1, true, dp);
        int first = maxProduct(nums1, nums2, i + 1, j, false, dp);
        int second = maxProduct(nums1, nums2, i, j + 1, false, dp);

        return dp[i][j] = Math.max(nums1[i] * nums2[j], Math.max(prod, Math.max(first, second)));
    }
}
