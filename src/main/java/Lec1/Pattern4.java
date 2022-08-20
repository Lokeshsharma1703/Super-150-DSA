package Lec1;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n;
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
            space--;
            star++;
            System.out.println();
        }
    }
}
