package Assignment1;
import java.util.Scanner;
public class PatternMountain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int digits = 1;
		int space = 2*(n-1);
		while(row<=n) {
			int i=1;
			while(i<=row) {
				System.out.print(i++ +" ");
			}
			int j=1;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
			while(i>1) {
				System.out.print(--i +" ");
			}
			row++;
			space-=2;
			digits++;
			System.out.println();
		}
	}
}
