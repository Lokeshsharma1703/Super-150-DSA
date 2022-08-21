//Take N as input. Print all prime numbers from 2 to N.
//
//        Input Format
//        Constraints
//        1 <= N <= 1000
//
//        Output Format
//        Sample Input
//        10
//        Sample Output
//        2
//        3
//        5
//        7
//        Explanation
//        Each output should be on separate line. A prime number is that number which is divisible by one or itself.

package Assignment1;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            int count = 0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
