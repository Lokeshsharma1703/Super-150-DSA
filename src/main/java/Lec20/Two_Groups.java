package Lec20;

import java.util.Scanner;

public class Two_Groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum+=sc.nextInt();
            }
            System.out.println(Math.abs(sum));
        }
    }
}
