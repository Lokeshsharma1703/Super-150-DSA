package Lec7;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void rotate(int[][] matrix){
        //make transpose of array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            rangeReverse(matrix[i]);
        }
    }
    private static void rangeReverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
