package Lec21;

import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
//        System.out.println(Math.random());
        int low = 10;
        int high = 100;
//        generate 40 numbers between the range
        Random r = new Random();
        for (int i = 0; i < 40; i++) {
            int rn = r.nextInt(high-low+1)+low;
            System.out.print(rn+" ");
        }
    }
}
