//Take N (number of rows), print the following pattern (for N = 6)
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//
//Input Format
//Constraints
//0 < N < 100
//
//Output Format
//Sample Input
//6
//Sample Output
//1  
//1	1  
//1	2	1  
//1	3	3	1  
//1	4	6	4	1  
//1	5	10	10	5	1
//Explanation
//Each number is separated from other by a tab.

package Assignment1;
import java.util.Scanner;
public class PascalTriangle_Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][0] = 1;
				arr[i][i] = 1;
			}
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n-1;j++)
			{
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
