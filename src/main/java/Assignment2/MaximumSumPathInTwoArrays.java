//You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.
//
//        Input Format
//        First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.
//
//        Constraints
//        1<=t<=100 1<=n,m<=100000
//
//        Output Format
//        Print the maximum path.
//
//        Sample Input
//        1
//        8 8
//        2 3 7 10 12 15 30 34
//        1 5 7 8 10 15 16 19
//        Sample Output
//        122
//        Explanation
//        122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34

package Assignment2;

import java.util.Scanner;

public class MaximumSumPathInTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            for(int i=0;i<n;i++) {
                arr1[i] = sc.nextInt();
            }
            int[] arr2 = new int[m];
            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }
            System.out.println(findMaxPath(arr1, arr2));
            t--;
        }
    }
    private static int findMaxPath(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        int res = 0;
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i++];
            }
            else if(arr2[j]<arr1[i]) {
                sum2 += arr2[j++];
            }
            else if(arr1[i]==arr2[j]){
                res+=max(sum1, sum2)+arr1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<n){
            sum1+=arr1[i++];
        }
        while (j<m){
            sum2+=arr2[j++];
        }
        res+=max(sum1, sum2);
        return res;
    }
    private static int max(int a, int b){
        return a>b?a:b;
    }
}
