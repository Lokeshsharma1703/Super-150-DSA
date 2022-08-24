//Take the following as input.
//
//        A number (N1)
//        A number (N2)
//        Write a function which prints all armstrong numbers between N1 and N2 (inclusive).
//
//        371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3
//
//        Input Format
//        Constraints
//        0 < N1 < 100 N1 < N2 < 10000
//
//        Output Format
//        Sample Input
//        400
//        1000
//        Sample Output
//        407
//        Explanation
//        Each number in output is in separate line.

package Assignment1;

import java.util.Scanner;

public class PrintArmstrongNumbers {

    public static int count(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static boolean isArmstrong(int n, int len){
        int temp = 0;
        int num = n;
        while(num>0){
            temp+=Math.pow(num%10, len);
            num/=10;
        }
        return temp==n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
            if(isArmstrong(i, count(i))){
                System.out.println(i);
            }
        }
    }
}
