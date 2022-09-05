//You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.
//
//        Input Format
//        First line contains integer t which is number of test case.
//        For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.
//
//        Constraints
//        1<=t<=100
//        1<=n<=1000
//        |Ai| <= 10000
//
//        Output Format
//        Print the maximum circular sum for each testcase in a new line.
//
//        Sample Input
//        1
//        7
//        8 -8 9 -9 10 -11 12
//        Sample Output
//        22
//        Explanation
//        Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)

package Assignment2;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            System.out.println(findMaxCircularSum(arr));
            t--;
        }
    }
    private static int findMaxCircularSum(int[] arr){
        int sum = 0;
        for(int i:arr)
            sum+=i;
        int max_value = arr[0];
        int min_value = arr[0];
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            max_value = Math.max(max_value+arr[i], arr[i]);
            min_value = Math.min(min_value+arr[i], arr[i]);
            max = Math.max(max_value, max);
            min = Math.min(min_value, min);
        }
        return Math.max(max, sum-min);
    }
}
