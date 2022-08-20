//Take N as input, Calculate it's reverse also Print the reverse.
//
//Input Format
//Constraints
//0 <= N <= 1000000000
//
//Output Format
//Sample Input
//123456789
//Sample Output
//987654321
//Explanation
//You've to calculate the reverse in a number, not just print the reverse.

package Assignment1;
import java.util.Scanner;
public class PrintReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long rev = 0;
		while(num>0) {
			rev = rev*10 + (num%10);
			num/=10;
		}
		System.out.print(rev);
	}
}
