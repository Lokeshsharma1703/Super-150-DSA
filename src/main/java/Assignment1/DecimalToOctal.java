//Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.
//
//        Input Format
//        Constraints
//        0 < N <= 1000000000
//
//        Output Format
//        Sample Input
//        63
//        Sample Output
//        77
//        Explanation
//        Both input and output are integers

package Assignment1;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = (int)n%8;
            sum+=rem*mul;
            n/=8;
            mul*=10;
        }
        System.out.println(sum);
    }
}
