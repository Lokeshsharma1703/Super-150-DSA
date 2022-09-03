//Given an array having n elements representing balls of various colours like red, white or blue, sort them in-place so that balls of the same colour are adjacent, with the colours in the order red, white and blue.
//        To represent the colour red, white, and blue we will use the integers 0, 1, and 2 respectively.
//        Note:You are not suppose to use the sort function for this problem.
//
//        Input Format
//        First line contains integer n as size of array. Next n lines contains a single integer as element of array.
//
//        Constraints
//        None
//
//        Output Format
//        Print the balls in order so that balls of same colour are adjacent.
//
//        Sample Input
//        6
//        2 0 2 1 1 0
//        Sample Output
//        0 0 1 1 2 2

        package Assignment2;

import java.util.Scanner;

public class SortingInLinearTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    private static void sort(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int pointer = 0;
        while (pointer<=end){
            if(arr[pointer]==0){
                swapValues(arr,start,pointer);
                start++;
                pointer++;
            }
            else if(arr[pointer]==2){
                swapValues(arr, pointer, end);
                end--;
            }
            else{
                pointer++;
            }
        }
    }
    private static void swapValues(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
