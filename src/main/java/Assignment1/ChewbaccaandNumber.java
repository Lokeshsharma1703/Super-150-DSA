//Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.
//
//Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.
//
//Input Format
//The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.
//
//Constraints
//x <= 100000000000000000
//
//Output Format
//Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.
//
//Sample Input
//4545
//Sample Output
//4444
//Explanation
//There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.

package Assignment1;
import java.util.Scanner;
public class ChewbaccaandNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count = 0;
		long temp = n;
		while(temp>0) {
			temp/=10;
			count++;
		}
		temp = n;
		long[] arr = new long[count];
		for(int i=arr.length-1;i>=0;i--) {
			arr[i] = temp%10;
			temp/=10;
		}
		for(int i=0;i<arr.length;i++) {
			int digit = (int)arr[i];
			if(digit>4) {
				if(i==0 && digit==9)
					continue;
				arr[i] = 9-digit;
			}
		}
		long res = 0;
		for(int i=0;i<arr.length;i++) {
			res=res*10+arr[i];
		}
		System.out.print(res);
	}
}
