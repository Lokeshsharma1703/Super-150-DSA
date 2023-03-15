package Lec29;

import java.util.Scanner;

public class Quick_Sort_codeforces {
    public static void main(String[] args) {
        Scanner daidai = new Scanner(System.in);
        int bataBhai = daidai.nextInt();
        while (bataBhai-->0){


            int itneThe = daidai.nextInt();
            int kitnechahiye = daidai.nextInt();
            int[] kyaChahiye = new int[itneThe];
            for (int ajhfg = 0; ajhfg < itneThe; ajhfg++) {
               kyaChahiye[ajhfg] = daidai.nextInt();
            }



            yeJarooriHai(itneThe, kitnechahiye, kyaChahiye);
        }
    }
    public  static void yeJarooriHai(int itneThe, int kitnechahiye, int[] kyaChahiye){
        long erg = 0;
        long dghhu = 1;
        for(int aksdhofu=0;aksdhofu<kyaChahiye.length;aksdhofu++){
            if(kyaChahiye[aksdhofu]==dghhu){
                erg++;
                dghhu++;
            }
        }
        long pakadLo = itneThe-erg;
        if(pakadLo%kitnechahiye==0){
            System.out.println(pakadLo/kitnechahiye);
        }
        else{
            System.out.println(pakadLo/kitnechahiye + 1);
        }
    }
}
