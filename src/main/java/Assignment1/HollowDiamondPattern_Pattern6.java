//Take N (number of rows), print the following pattern (for N = 5).
//
//		* * * * *
//		* *   * *
//		*       *
//		* *   * *
//		* * * * *
//		Input Format
//		Constraints
//		0 < N < 10 (where N is an odd number)
//
//		Output Format
//		Sample Input
//		5
//		Sample Output
//		*	*	*	*	*
//		*	*	    	*	*
//		* 	            		*
//		* 	*       	*	*
//		* 	*	*   	*   	*
//		Explanation
//		Each '*' is separated from other by a tab.

package Assignment1;
import java.util.*;
public class HollowDiamondPattern_Pattern6 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int row = 0;
		int star = n+1;
		int space = 1;
		while(row<n){
			if(row==0 || row==n-1){
				int i=1;
				while(i<star){
					System.out.print("* ");
					i++;
				}
				row++;
				star-=2;
			}
			else{
				int j=1;
				while(j<=star/2){
					System.out.print("* ");
					j++;
				}
				int k = 1;
				while(k<=space){
					System.out.print("  ");
					k++;
				}
				int l = 1;
				while(l<=star/2){
					System.out.print("* ");
					l++;
				}
				if(row<n/2){
					row++;
					star-=2;
					space+=2;
				}
				else
				{
					row++;
					star+=2;
					space-=2;
				}
			}
			System.out.println();
		}
	}
}
