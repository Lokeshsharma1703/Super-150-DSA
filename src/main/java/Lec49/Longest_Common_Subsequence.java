package Lec49;

import java.util.Arrays;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
//        Recursive Approach 1-------------------------
//        return lcs(text1, text2, 0, 0);

//        Recursive Approach 2-------------------------
//        return lcs2(text1, text2, text1.length()-1, text2.length()-1);

//        TopDown DP ----------------------------------
//        int[][] dp = new int[text1.length()][text2.length()];
//        for (int i = 0; i < text1.length(); i++) {
//            Arrays.fill(dp[i], -1);
//        }
//        return lcsTopDown(text1, text2, 0, 0, dp);

//        BottomUp DP----------------------------------
//        return lcsBottomUp(text1, text2);        // (0,0) to (n,m)
        return lcsBottomUp2(text1, text2);       // (n,m) to (0,0)
    }

    private static int lcsBottomUp(String s1, String s2){

        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i=1; i<=s1.length(); i++){
            for(int j=1; j<=s2.length(); j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }

        return dp[s1.length()][s2.length()];

    }

    private static int lcsBottomUp2(String s1, String s2){

        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i=s1.length()-1; i>=0 ; i--){
            for(int j=s2.length()-1; j>=0; j--){

                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }

            }
        }

        return dp[0][0];

    }

    private static int lcsTopDown(String s1, String s2, int i, int j, int[][] dp){

        if(i==s1.length() || j==s2.length()){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int res = 0;

        if(s1.charAt(i)==s2.charAt(j)){
            res = 1+ lcsTopDown(s1, s2, i+1, j+1, dp);   // dp[i+1][j+1]
        }
        else{
            int fs = lcsTopDown(s1, s2, i+1, j, dp);  // dp[i+1][j]
            int ss = lcsTopDown(s1, s2, i, j+1, dp);  // dp[i][j+1]
            res = Math.max(fs, ss);
        }

        return dp[i][j] = res;

    }

    private static int lcs2(String s1, String s2, int i, int j){

        if(i<0 || j<0){
            return 0;
        }

        int res = 0;

        if(s1.charAt(i)==s2.charAt(j)){
            res = 1+ lcs2(s1, s2, i-1, j-1);
        }
        else{
            int fs = lcs2(s1, s2, i-1, j);
            int ss = lcs2(s1, s2, i, j-1);
            res = Math.max(fs, ss);
        }

        return res;

    }

    private static int lcs(String s1, String s2, int i, int j){

        if(i==s1.length() || j==s2.length()){
            return 0;
        }

        int res = 0;

        if(s1.charAt(i)==s2.charAt(j)){
            res = 1+ lcs(s1, s2, i+1, j+1);
        }
        else{
            int fs = lcs(s1, s2, i+1, j);
            int ss = lcs(s1, s2, i, j+1);
            res = Math.max(fs, ss);
        }

        return res;

    }
}
