package Lec1;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n;
        int star = 1;
        while(row<=n){
            int i=1;
            while (i<space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            space--;
            star = (row*2)-1;
            System.out.println();
        }
    }
}
