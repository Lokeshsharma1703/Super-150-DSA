package Assignment1;
import java.util.Scanner;

public class PatternMountain
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}

			for (int j= i*2 ; j < rows*2; j++)
			{
				System.out.print(" ");
			}
			for (int l = i; l >= 1; l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}