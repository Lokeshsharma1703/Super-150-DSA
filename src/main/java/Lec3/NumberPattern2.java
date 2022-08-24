package Lec3;

import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n;
        int star = 1;
        while(row<=n){
            int d = 1;
            int i=1;
            while (i<space){
                System.out.print("\t");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print(d +"\t");
                if(j<=star/2)
                    d++;
                else
                    d--;
                j++;
            }
            row++;
            space--;
            star = (row*2)-1;
            System.out.println();
        }
    }
}
