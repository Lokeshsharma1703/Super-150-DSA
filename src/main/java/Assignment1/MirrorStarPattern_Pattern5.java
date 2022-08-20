//Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).
//
//      *
//   *  *  *  
//*  *  *  *  *  
//   *  *  *
//      *
//Input Format
//Constraints
//0 < N < 10 (only odd numbers allowed)
//
//Output Format
//Sample Input
//5
//Sample Output
//      *
//    * * *
//  * * * * *
//    * * *
//      *
//Explanation
//Each '*' is separated from other by a tab.

package Assignment1;
import java.util.Scanner;
public class MirrorStarPattern_Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n/2;
		int star = 1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<=n/2) {
				row++;
				space--;
				star+=2;
			}
			else {
				row++;
				space++;
				star-=2;
			}
			System.out.println();
		}
	}
}
