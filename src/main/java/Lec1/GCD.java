package Lec1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int dividand = sc.nextInt();
        while(dividand % divisor != 0 ){
            int rem = dividand % divisor;
            dividand = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
}
