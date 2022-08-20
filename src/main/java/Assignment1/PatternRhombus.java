//Take N (number of rows), print the following pattern (for N = 3).
//
//                         1
//                       2 3 2
//                     3 4 5 4 3
//                       2 3 2
//                         1
//Input Format
//Constraints
//0 < N < 10
//
//Output Format
//Sample Input
//3
//Sample Output
//                1
//	2	3	2
//3	4	5	4	3
//	2	3	2
//		1
//Explanation
//Each number is separated from other by a tab.

package Assignment1;
import java.util.Scanner;
public class PatternRhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n;
		int digits = 1;
		int start = 1;
		while(row<2*n) {
			int i=1;
			while(i<space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int d = start;
			while(j<2*start) {
				System.out.print(d+" ");
				if(j<start)
					d++;
				else
					d--;
				j++;
			}
			if(row<n)
			{
				row++;
				space--;
				digits+=2;
				start++;
			}
			else
			{
				row++;
				space++;
				digits-=2;
				start--;
			}
			System.out.println();
		}
	}
}
