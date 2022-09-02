//You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.
//
//        Example : Imgur
//
//        Input Format
//        The first line consists of number of test cases T. Each test case consists an integer N as number of towers and next line contains the N space separated integers.
//
//        Constraints
//        1 <= N <= 1000000 1 <= t <= 10 0 <= A[i] <= 10000000
//
//        Output Format
//        Print how much unit of water collected among towers for each test case.
//
//        Sample Input
//        2
//        6
//        3  0  0  2  0  4
//        12
//        0  1  0  2  1  0  1  3  2  1  2  1
//        Sample Output
//        10
//        6

package Assignment2;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            System.out.println(trapping(arr));
            t--;
        }
    }
    public static int trapping(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<leftmax.length;i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        rightmax[rightmax.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        int sum = 0;
        for(int i=0;i<leftmax.length;i++){
            sum+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return sum;
    }
}
