//You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.
//
//        Input Format
//        First line contains number of test cases, T. Next T lines contains integers, n and k.
//
//        Constraints
//        1<=T<=10
//        1<=N<=10^15
//        1<=K<=10^4
//
//        Output Format
//        Output the integer x
//
//        Sample Input
//        2
//        10000 1
//        1000000000000000 10
//        Sample Output
//        10000
//        31
//        Explanation
//        For the first test case, for x=10000, 10000^1=10000=n

package Assignment2;

import java.util.Scanner;

public class KTH_ROOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            long num = sc.nextLong();
            int k = sc.nextInt();
            System.out.println(findRoot(num, k));
            t--;
        }
    }
    public static long findRoot(Long num, int k){
        int start = 1;
        long end = num;
        long res = 0;
        while(start<=end){
            long mid = (start+end)/2;
            if(Math.pow(mid,k)<=num){
                res = mid;
                start = (int)(mid+1);
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }
}
