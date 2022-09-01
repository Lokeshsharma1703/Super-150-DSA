package Lec6;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int nos = sc.nextInt();
            int cows = sc.nextInt();
            int[] stalls = new int[nos];
            for(int j=0;j<nos;j++)
                stalls[j] = sc.nextInt();
            Arrays.sort(stalls);
            System.out.println(largestMinimumDistance(stalls, cows));
        }
    }
    private static int largestMinimumDistance(int[] stalls, int cows){
        int low = stalls[0];
        int high = stalls[stalls.length-1] - stalls[0];
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(stalls, mid, cows)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    private static boolean isPossible(int[] stalls, int mid, int cows){
        int cow = 1;
        int pos = stalls[0];
        int i=1;
        while(i<stalls.length){
            if(stalls[i]-pos>=mid){
                cow++;
                pos = stalls[i];
            }
            if(cow>=cows)
                return true;
            i++;
        }
        return false;
    }
}
