//You are given N elements, a1,a2,a3….aN. Find the number of good sub-arrays.
//        A good sub-array is a sub-array [ai,ai+1,ai+2….aj] such that (ai+ai+1+ai+2+….+aj) is divisible by N.
//
//
//
//        Input Format
//        The first line contains the number of test cases T. First line of each test case contains an integer N denoting the number of elements. Second line of each test case contains N integers, a1, a2, a3….aN, where ai denotes the ith element of the array.
//
//        Constraints
//        1<=T<=10
//        1<=N<=10^5
//        |ai|<=10^9
//
//        Output Format
//        Output a single integer denoting the number of good sub-arrays.
//
//        Sample Input
//        2
//        5
//        1 1 1 1 1
//        5
//        5 5 5 5 5
//        Sample Output
//        1
//        15
//        Explanation
//        In first test case, there is only one sub-array [1, 1, 1, 1, 1], such that 1+1+1+1+1=5, which is divisible by N=5

package Assignment2;

import java.util.Scanner;

public class DivisibleSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            System.out.println(goodSubArray(arr, n));
            t--;
        }
    }
    private static long goodSubArray(int[] arr, int n){
        long[] freq = new long[n];
        freq[0] = 1;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int index = (int)(sum%n);
            if(index<0){
                index+=n;
            }
            freq[index]++;
        }
        long res = 0;
        for(int i=0;i<n;i++){
            if(freq[i]>=2){
                long p = freq[i];
                res=res + (p*(p-1))/2;
            }
        }
        return res;
    }
}
