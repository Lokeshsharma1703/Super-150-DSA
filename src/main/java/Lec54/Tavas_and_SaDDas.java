package Lec54;

// https://codeforces.com/problemset/problem/535/B

import java.util.Scanner;

public class Tavas_and_SaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        System.out.println(index(n));
    }

    private static int index(String s){
        int n = s.length();
        int idx = (1 << n) - 2;

        int pos = 0;
        for (int i = n-1; i >= 0; i--) {
            if(s.charAt(i)=='7'){
                idx += (1 << pos);
            }
            pos++;
        }

        return idx+1;
    }
}
