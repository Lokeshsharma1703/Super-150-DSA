package Lec63;

public class Shortest_Common_Supersequence {
    public static void main(String[] args) {
        System.out.println(shortestCommonSupersequence("abac", "cab"));
    }

    public static String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        // length of the shortest common supersequence will always be n+m-lcs

        int i = n;
        int j = m;
        StringBuilder res = new StringBuilder();
        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                res.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i][j] > dp[i-1][j]){
                // came from the previous column
                res.append(str2.charAt(j-1));
                j--;
            }
            else{
                res.append(str1.charAt(i-1));
                i--;
            }
        }

        while (i>0){
            res.append(str1.charAt(i-1));
            i--;
        }
        while (j>0){
            res.append(str2.charAt(j-1));
            j--;
        }
        res.reverse();
        return res.toString();
    }
}
