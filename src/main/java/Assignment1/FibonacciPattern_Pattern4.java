//Take N (number of rows), print the following pattern (for N = 4)
//        0
//        1 1
//        2 3 5
//        8 13 21 34
//
//        Input Format
//        Constraints
//        0 < N < 100
//
//        Output Format
//        Sample Input
//        4
//        Sample Output
//        0
//        1    1
//        2    3     5
//        8   13    21    34
//        Explanation
//        Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers. Kth row contains , next k fibonacci numbers.

package Assignment1;

import java.util.Scanner;

public class FibonacciPattern_Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int row = 1;
        int pos = 1;
        while(row<=n){
            int i=1;
            while(i<=row){
                if(pos==1){
                    System.out.print(a+" ");
                    pos++;
                    i++;
                }
                else if(pos==2){
                    System.out.print(b+" ");
                    pos++;
                    i++;
                }
                else
                {
                    int c = a+b;
                    System.out.print(c+" ");
                    a = b;
                    b = c;
                    i++;
                    pos++;
                }
            }
            row++;
            System.out.println();
        }
    }
}
