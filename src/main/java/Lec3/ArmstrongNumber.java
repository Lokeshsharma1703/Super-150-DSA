package Lec3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int count(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    public static boolean isArmstrong(int n, int len){
        int temp = 0;
        int num = n;
        while(num>0){
            temp+=Math.pow(num%10, len);
            num/=10;
        }
        return temp==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n,count(n)));
    }
}
