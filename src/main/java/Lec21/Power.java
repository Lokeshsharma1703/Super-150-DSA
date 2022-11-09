package Lec21;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
    private static int power(int a, int b){
        if(b==0){
            return 1;
        }
        int res = power(a,b/2);
        res = res*res;
        if(b%2==1){
            res = res*a;
        }
        return res;
    }
}
