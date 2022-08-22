//Take N (number of rows), print the following pattern (for N = 4).
//
//		1           1
//		1 2       2 1
//		1 2 3   3 2 1
//		1 2 3 4 3 2 1
//		Input Format
//		Constraints
//		0 < N < 10
//
//		Output Format
//		Sample Input
//		4
//		Sample Output
//		1						1
//		1	2				2	1
//		1	2	3		3	2	1
//		1	2	3	4	3	2	1

package Assignment1;
import java.util.Scanner;

public class PatternMountain
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int row = 1;
		int start = 1;
		int space = ((n-1)*2)-1;
		while(row<=n){
			int curr = 1;
			int i=1;
			while(i<=row){
				System.out.print(curr+" ");
				curr++;
				i++;
			}
			int j=1;
			while(j<=space){
				System.out.print("  ");
				j++;
			}
			if(row==n){
				curr--;
			}
			while(curr>1){
				System.out.print(--curr +" ");
			}
			row++;
			space-=2;
			System.out.println();
		}
	}
}