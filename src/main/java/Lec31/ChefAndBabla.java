package Lec31;

import java.util.*;

public class ChefAndBabla {
    public static void main(String[] args) {
        Scanner dede = new Scanner(System.in);
        int bata = dede.nextInt();
        while (bata-->0){
            int kitnaBada = dede.nextInt();
            int[] space = new int[kitnaBada];
            for (int uuv = 0; uuv < kitnaBada; uuv++) {
                space[uuv] = dede.nextInt();
            }
            System.out.println(kyaHoGya(space));
        }
    }
    private static int kyaHoGya(int[] spaceee){
        List<Integer> pahle = new ArrayList<>();
        List<Integer> dusra = new ArrayList<>();
        boolean jhandaa = false;
        for(int uuv:spaceee){
            if(uuv<0){
                pahle.add(uuv);
            }
            else if(uuv>0){
                dusra.add(uuv);
            }
            else {
                 jhandaa = true;
            }
        }
        if(jhandaa){
            return -1;
        }
        if(!pahle.isEmpty() && dusra.isEmpty()){
            Collections.sort(pahle);
            return Math.abs(pahle.get(pahle.size()-1))-1;
        }
        else if(pahle.isEmpty() && !dusra.isEmpty()){
            Collections.sort(dusra);
            return dusra.get(0)-1;
        }
        else{
            Collections.sort(pahle);
            Collections.sort(dusra);
            int a = Math.abs(pahle.get(pahle.size()-1))-1;
            int b = dusra.get(0)-1;
            return Math.min(a,b);
        }
    }
}
