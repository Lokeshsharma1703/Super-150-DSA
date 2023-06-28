package Lec55;

import java.util.Scanner;

//  https://codeforces.com/problemset/problem/1325/D


public class Ehab_the_Xorcist {

    //  p+q = p^q + 2(p&q)       =>   v = u + 2(p&q)
    // [v, x, x] = u
    // x = (u-v)/2
    // u==v   =>  0, 1
    // u > v => -1    ,  (v-u)%2!=0  => -1


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long u = sc.nextLong();
        long v = sc.nextLong();

        if(u>v || (v-u)%2!=0){
            System.out.println(-1);
        }
        else if(u==v){
            if(v==0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
                System.out.println(v);
            }
        }
        else{
            long x = (v-u)/2;
            if((u&x)==0){
                System.out.println(2);
                System.out.println(u+x+" "+x);
            }
            else{
                System.out.println(3);
                System.out.println(u+" "+x+" "+x);
            }
        }
    }
}
