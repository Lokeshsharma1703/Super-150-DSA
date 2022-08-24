package Lec3;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n;
        int star = 1;
        int d = 1;
        while(row<=n){
            int i=1;
            while (i<space){
                System.out.print("\t");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print(d++ +"\t");
                j++;
            }
            row++;
            space--;
            star = (row*2)-1;
            System.out.println();
        }
    }
}
