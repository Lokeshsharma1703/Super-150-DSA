package Lec29;

import java.util.Scanner;

public class Greatest_Convex {
    public static void main(String[] args) {
        Scanner dedeee = new Scanner(System.in);
        int bata_bhai = dedeee.nextInt();
        while(bata_bhai-->0){
            int yeHai = dedeee.nextInt();
            System.out.println(kaamKaAdmiHai(yeHai));
        }
    }
    public static int kaamKaAdmiHai(int ye){
        return ye-1;
    }
}
