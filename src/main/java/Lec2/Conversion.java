package Lec2;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter source base : ");
        int sb = sc.nextInt();
        System.out.print("Enter destination base : ");
        int db = sc.nextInt();
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%db;
            sum+=mul*rem;
            n/=db;
            mul*=sb;
        }
        System.out.print(sum);
    }
}
