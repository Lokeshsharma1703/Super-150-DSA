package Lec24;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input__de = new Scanner(System.in);
        int times = input__de.nextInt();
        while (times-->0){
            int n = input__de.nextInt();
            int[] board__ = new int[n];
            for(int i=0;i<n;i++){
                board__[i] = input__de.nextInt();
            }
            for(int i=0;i<n;i++){
                int max = Integer.MIN_VALUE;
                for(int j=0;j<n;j++){
                    if(i!=j && board__[j]>max){
                        max = board__[j];
                    }
                }
                System.out.print(board__[i]-max+" ");
            }
            System.out.println();
        }
    }
}
