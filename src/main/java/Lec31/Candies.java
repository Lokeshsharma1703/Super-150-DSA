package Lec31;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner dede = new Scanner(System.in);
        int bata = dede.nextInt();
        while (bata-->0){
            int kitnaBada = dede.nextInt();
            int prifffit = dede.nextInt();


            int[] pahla = new int[kitnaBada];
            for (int uuv = 0; uuv < kitnaBada; uuv++) {
                pahla[uuv] = dede.nextInt();
            }



            int[] dusra = new int[prifffit];
            for (int uuv = 0; uuv < prifffit; uuv++) {
                dusra[uuv] = dede.nextInt();
            }



            int jaroorat = 0;

            for (int uuv = 0; uuv < prifffit; uuv++) {
                int jodle = 0;
                for (int aab = 0; aab < kitnaBada; aab++) {
                    jodle = jodle + (pahla[aab]/(uuv+1));
                }
                jaroorat = Math.max(jaroorat, jodle*dusra[uuv]);
            }
            System.out.println(jaroorat);
        }
    }
}
