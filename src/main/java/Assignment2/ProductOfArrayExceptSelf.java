//Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].
//
//        Input Format
//        First line contains integer N as size of array.
//        Next line contains a N integer as element of array.
//
//        Constraints
//        arr[i]<=10000000
//
//        Output Format
//        print output array
//
//        Sample Input
//        4
//        1 2 3 4
//        Sample Output
//        24 12 8 6

        package Assignment2;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arr = productArray(arr);
        for(long i:arr){
            System.out.print(i+" ");
        }
    }
    private static long[] productArray(long[] arr){
        int n = arr.length;
        long[] leftproduct = new long[n];
        leftproduct[0] = 1;
        for(int i=1;i<n;i++){
            leftproduct[i] = leftproduct[i-1]*arr[i-1];
        }
        long[] rightproduct = new long[n];
        rightproduct[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            rightproduct[i] = rightproduct[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i] = leftproduct[i]*rightproduct[i];
        }
        return arr;
    }
//    private static long[] productArray(long[] arr){
//        int n = arr.length;
//        long[] leftproduct = new long[n];
//        leftproduct[0] = 1;
//        for(int i=1;i<n;i++){
//            leftproduct[i] = leftproduct[i-1]*arr[i-1];
//        }
//        long r = 1;
//        for(int i=n-1;i>=0;i--){
//            leftproduct[i] = leftproduct[i]*r;
//            r*=arr[i];
//        }
//        return leftproduct;
//    }
}
