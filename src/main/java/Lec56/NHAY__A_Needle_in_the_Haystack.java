package Lec56;

import java.util.Scanner;

//  https://www.spoj.com/problems/NHAY/

public class NHAY__A_Needle_in_the_Haystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String needle = sc.next();
            String haystack = sc.next();

            kmp(haystack, needle);
        }
    }

    private static void kmp(String haystack, String needle){
        haystack = needle + "#" + haystack;
        int[] dp = new int[haystack.length()];
        int len = 0;

        for(int i=1; i<dp.length;){
            if(haystack.charAt(len) == haystack.charAt(i)){
                len++;
                dp[i] = len;
                i++;
            }
            else{
                if(len > 0){
                    len = dp[len-1];
                }
                else{
                    dp[i] = 0;
                    i++;
                }
            }
        }

        int n = needle.length();

        for(int i=n+1; i<dp.length; i++){
            if(dp[i]==n){
                System.out.println((i-(2*n)));
            }
        }

    }
}
