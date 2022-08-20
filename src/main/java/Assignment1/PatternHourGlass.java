//Take N as input. For a value of N=5, we wish to draw the following pattern :
//
//                          5 4 3 2 1 0 1 2 3 4 5
//                            4 3 2 1 0 1 2 3 4 
//                              3 2 1 0 1 2 3 
//                                2 1 0 1 2 
//                                  1 0 1 
//                                    0 
//                                  1 0 1 
//                                2 1 0 1 2 
//                              3 2 1 0 1 2 3 
//                            4 3 2 1 0 1 2 3 4 
//                          5 4 3 2 1 0 1 2 3 4 5
//Input Format
//Take N as input.
//
//Constraints
//N <= 20
//
//Output Format
//Pattern should be printed with a space between every two values.
//
//Sample Input
//5
//Sample Output
// 5 4 3 2 1 0 1 2 3 4 5
//   4 3 2 1 0 1 2 3 4 
//     3 2 1 0 1 2 3 
//       2 1 0 1 2 
//         1 0 1 
//           0 
//         1 0 1 
//       2 1 0 1 2 
//     3 2 1 0 1 2 3 
//   4 3 2 1 0 1 2 3 4 
// 5 4 3 2 1 0 1 2 3 4 5

package Assignment1;
import java.util.Scanner;
public class PatternHourGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int d = n;
		int space = 1;
		int count = 0;
		while(row<(2*n)+1) {
			int i=1;
			while(i<space) {
				System.out.print("  ");
				i++;
			}
			int j=0;
			int cd = d;
			while(j<=(2*n)-(2*count)) {
				System.out.print(cd+" ");
				if(j<d)
					cd--;
				else
					cd++;
				j++;
			}
			if(row<n) {
				row++;
				space++;
				d--;
				count++;
			}
			else {
				row++;
				space--;
				d++;
				count--;
			}
			System.out.println();
		}
	}
}
