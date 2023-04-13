package Lec49;

public class Distinct_Subsequences {
    public static void main(String[] args) {
        System.out.println(numDistinct("rabbbit", "rabbit"));
    }

    public static int numDistinct(String s, String t) {
//        return distinct(s, t, 0, 0);
        return distinctDP(s, t);
    }


    private static int distinctDP(String s, String t){

        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int i=0;i<=s.length();i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){

                int inc = 0;
                int exc = 0;

                if(s.charAt(i-1)==t.charAt(j-1)){
                    inc = dp[i-1][j-1];
                }
                exc = dp[i-1][j];

                dp[i][j] = inc + exc;

            }
        }

        return dp[dp.length-1][dp[0].length-1];

    }


    private static int distinct(String s, String t, int i, int j){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }

        int inc = 0;
        int exc = 0;
        if(s.charAt(i)==t.charAt(j)){
            inc = distinct(s, t, i+1, j+1);
        }
        exc = distinct(s, t, i+1, j);

        return inc + exc;
    }
}
