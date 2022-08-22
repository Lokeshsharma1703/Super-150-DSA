//You will be given a number N. You have to code a hollow diamond looking pattern.
//
//        The output for N=5 is given in the following image.
//
//        *********
//        **** ****
//        ***   ***
//        **     **
//        *       *
//        **     **
//        ***   ***
//        **** ****
//        *********
//
//        Input Format
//        The input has only one single integer N.
//
//        Constraints
//        Output Format
//        Output the given pattern.
//
//        Sample Input : 5
//
//        Sample Output :
//        *********
//        **** ****
//        ***   ***
//        **     **
//        *       *
//        **     **
//        ***   ***
//        **** ****
//        *********
//        Explanation
//        Write a code to print above given pattern. No space between any two characters.

package Assignment1;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 0;
        int star = 2*n;
        int space = 1;
        while(row<(2*n)-1){
            if(row==0 || row==2*(n-1)){
                int i=1;
                while(i<star){
                    System.out.print("*");
                    i++;
                }
                row++;
                star-=2;
            }
            else{
                int j=1;
                while(j<=star/2){
                    System.out.print("*");
                    j++;
                }
                int k = 1;
                while(k<=space){
                    System.out.print(" ");
                    k++;
                }
                int l = 1;
                while(l<=star/2){
                    System.out.print("*");
                    l++;
                }
                if(row<n-1){
                    row++;
                    star-=2;
                    space+=2;
                }
                else
                {
                    row++;
                    star+=2;
                    space-=2;
                }
            }
            System.out.println();
        }
    }
}
