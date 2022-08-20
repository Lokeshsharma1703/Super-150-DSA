package Lec2;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = (byte)134;
        byte b1 = (byte)300;
        short s = 78;
        int i = 87;
        b = (byte)i;
        System.out.println(b);
        System.out.println(b1);
        long ll = 458123265;
        long l = 6488888875464685465l;
        System.out.println(ll);
        System.out.println(l);
        float f= 8.9f;
        System.out.println(f);
        double d = 7.0258;
        System.out.println(d);
//        long l1 = sc.nextLong();
//        System.out.println(l1);
        char ch = 'a';
        int n = ch;
        System.out.println(n);
        ch++;
        System.out.println(ch);
        ch+=1;
        System.out.println(ch);
    }
}
