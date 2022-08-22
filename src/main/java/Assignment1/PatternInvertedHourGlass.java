//Take N as input. For a value of N=5, we wish to draw the following pattern :
//
//        5                   5
//        5 4               4 5
//        5 4 3           3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2 1 0 1 2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3           3 4 5
//        5 4               4 5
//        5                   5
//        Input Format
//        Take N as input.
//
//        Constraints
//        Output Format
//        Pattern should be printed with a space between every two values.
//
//        Sample Input
//        5
//        Sample Output
//        5                   5
//        5 4               4 5
//        5 4 3           3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2 1 0 1 2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3           3 4 5
//        5 4               4 5
//        5                   5

        package Assignment1;
import java.util.Scanner;
public class PatternInvertedHourGlass {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row = 0;
        int start = n;
        int digits = 1;
        int space = (2*n)-1;
        while(row<=2*n){
            int curr = start;
            int i=1;
            while(i<=digits){
                System.out.print(curr+" ");
                curr--;
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            if(row==n){
                curr++;
            }
            while(curr<n){
                System.out.print(++curr +" ");
            }
            row++;
            if(row<=n){
                digits++;
                space-=2;
            }
            else{
                digits--;
                space+=2;
            }
            System.out.println();
        }
	}
}
