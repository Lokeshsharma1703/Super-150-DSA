package Lec55;

//  https://atcoder.jp/contests/dp/tasks/dp_i

import java.util.Arrays;
import java.util.Scanner;

public class I_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] prob = new double[n];
        for (int i = 0; i < n; i++) {
            prob[i] = sc.nextDouble();
        }

        int h = (n+1)/2;

        double[][] dp = new double[(n+4)/2][n];
        for(double[] arr : dp){
            Arrays.fill(arr, -1);
        }

        System.out.println(calculateProb(prob, h, 0, dp));
    }

    private static double calculateProb(double[] prob, int h, int i, double[][] dp){
        if(h==0){
            return 1;
        }
        if(i==prob.length){
            return 0;
        }

        if(dp[h][i] != -1){
            return dp[h][i];
        }

        double res = prob[i]*calculateProb(prob, h-1, i+1, dp) + ((1-prob[i])*calculateProb(prob, h, i+1, dp));

        return dp[h][i] = res;
    }
}
