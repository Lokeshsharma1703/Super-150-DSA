package Lec48;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }


    public static int lengthOfLIS(int[] nums) {

//        O(n log(n))
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > dp[len-1]){
                dp[len] = nums[i];
                len++;
            }
            else{
                int ith = search(dp, 0, len-1, nums[i]);
                dp[ith] = nums[i];
            }
        }

        return len;





//        O(n^2)
//        int[] dp = new int[nums.length];
//        Arrays.fill(dp, 1);
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = i-1; j >= 0 ; j--) {
//                if(nums[i] > nums[j]){
//                    dp[i] = Math.max(dp[i], dp[j]+1);
//                }
//            }
//        }
//
//        int max = dp[0];
//        for (int i = 1; i < dp.length; i++) {
//            max = Math.max(max, dp[i]);
//        }
//
//        return max;
    }

    private static int search(int[] dp, int si, int hi, int ele){
        int res = 0;
        while (si <= hi){
            int mid = (si + hi)/2;
            if(dp[mid] >= ele){
                res = mid;
                hi = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return res;
    }
}
