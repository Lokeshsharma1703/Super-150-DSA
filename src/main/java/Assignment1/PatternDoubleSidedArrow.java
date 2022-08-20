//Take N as input. For a value of N=7, we wish to draw the following pattern :
//
//                            1 
//                        2 1   1 2 
//                    3 2 1       1 2 3 
//                4 3 2 1           1 2 3 4 
//                    3 2 1       1 2 3 
//                        2 1   1 2 
//                            1 
//Input Format
//Take N as input.
//
//Constraints
//N is odd number.
//
//Output Format
//Pattern should be printed with a space between every two values.
//
//Sample Input
//7
//Sample Output
//            1 
//        2 1   1 2 
//    3 2 1       1 2 3 
//4 3 2 1           1 2 3 4 
//    3 2 1       1 2 3 
//        2 1   1 2 
//            1 
//Explanation
//Catch the pattern and print it accordingly.


package Assignment1;
import java.util.Scanner;
public class PatternDoubleSidedArrow {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int space_between = 0;
		int digits = 1;
		while(row<=n)
		{
			int i=0;
			while(i<space) {
				System.out.print("  ");
				i++;
			}
			int j=digits;
			while(j>0) {
				System.out.print(j+" ");
				j--;
			}
			int k=0;
			while(k<space_between) {
				System.out.print("  ");
				k++;
			}
			if(row!=1 && row!=n) {
				int l = 1;
				while(l<=digits) {
					System.out.print(l+" ");
					l++;
				}
			}
			if(row<(n/2)+1)
			{
				if(row!=1 && row!=n)
	                space_between+=2;
	            else
	                space_between++;
				row++;
				space-=2;
				digits++;
			}
			else
			{
				if(row!=1 && row!=n)
	                space_between-=2;
	            else
	                space_between--;
				row++;
				space+=2;
				digits--;
			}
			System.out.println();
		}
	}
}
