//Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).
//
//        His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
//
//        Input Format
//        First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.
//
//        Constraints
//        2 <= N <= 100,000
//        0 <= xi <= 1,000,000,000
//        2 <= C <= N
//
//        Output Format
//        Print one integer: the largest minimum distance.
//
//        Sample Input
//        5 3
//        1 2 8 4 9
//        Sample Output
//        3
//        Explanation
//        Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]

package Assignment2;

import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cows = sc.nextInt();
        int[] stalls = new int[n];
        for(int i=0;i<n;i++){
            stalls[i] = sc.nextInt();
        }
        System.out.println(findMaxDiff(stalls, cows));
    }
    private static int findMaxDiff(int[] stalls, int cows){
        sort(stalls);
        int low = 0;
        int high = stalls[stalls.length-1]-stalls[0];
        int res = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(stalls,cows, mid)){
                res = mid;
                low=mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return res;
    }
    private static boolean isPossible(int[] stalls, int cows, int mid){
        int c = 1;
        int pos = stalls[0];
        int i=1;
        while(i<stalls.length){
            if(stalls[i]-pos>=mid){
                pos = stalls[i];
                c++;
            }
            if(c>=cows){
                return true;
            }
            i++;
        }
        return false;
    }
    private static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
