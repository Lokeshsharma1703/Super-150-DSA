//Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
//
//        Input Format
//        Constraints
//        2 < N <= 1000000000
//
//        Output Format
//        Sample Input
//        3
//        Sample Output
//        Prime
//        Explanation
//        The output is case specific

package Assignment1;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count = 0;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
