package Lec1;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = 1;
        while (row<=n){
            int j=1;
            while(j<space)
            {
                System.out.print("  ");
                j++;
            }
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            row++;
            space++;
            star--;
            System.out.println();
        }
    }
}
