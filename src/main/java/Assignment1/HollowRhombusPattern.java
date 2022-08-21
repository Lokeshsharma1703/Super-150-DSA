//Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.
//
//        Input Format
//        Single integer N.
//
//        Constraints
//        N <= 20
//
//        Output Format
//        Print pattern.
//
//        Sample Input
//        5
//        Sample Output
//        *****
//        *   *
//        *   *
//        *   *
//        *****
//        Explanation
//        For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.

package Assignment1;

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n;
        while(row<=n){
            int i=1;
            while(i<space){
                System.out.print(" ");
                i++;
            }
            if(row==1 || row==n){
                int j=1;
                while(j<=n){
                    System.out.print("*");
                    j++;
                }
            }
            else
            {
                int j=1;
                while(j<=n){
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            row++;
            space--;
            System.out.println();
        }
    }
}
