package Lec49;

public class Uncrossed_Lines {
    public static void main(String[] args) {
        System.out.println(maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{10,5,2,1,5,2}));
    }

    public static int maxUncrossedLines(int[] nums1, int[] nums2) {

        int[][] dp = new int[nums1.length+1][nums2.length+1];

        for(int i=nums1.length-1; i>=0; i--){
            for(int j=nums2.length-1; j>=0; j--){
                if(nums1[i]==nums2[j]){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        return dp[0][0];

    }
}
