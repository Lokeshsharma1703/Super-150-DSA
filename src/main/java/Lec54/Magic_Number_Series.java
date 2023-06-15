package Lec54;

import java.util.Scanner;

public class Magic_Number_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findMagicNumber(n));
    }

    private static int findMagicNumber(int n){
        int res = 0;
        int mul = 5;
        while(n > 0){
            if((n & 1) != 0){
                res += mul;
            }
            mul *= 5;
            n >>= 1;
        }

        return res;
    }
}
