package Assignment1;
import java.util.*;
public class HollowDiamondPattern_Pattern6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = (n/2)+1;
		int space = 1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<space) {
				System.out.print("# ");
				j++;
			}
			if(row<(n/2)+1) {
				row++;
				star--;
				space++;
			}
			else
			{
				row++;
				star++;
				space--;
			}
			System.out.println();
		}
	}
}
