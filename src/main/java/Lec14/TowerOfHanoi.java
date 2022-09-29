package Lec14;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTowerOfHanoi(n, "A", "B", "C");
    }
    private static void printTowerOfHanoi(int n, String src, String helper, String des){
        if(n==0){
            return;
        }
        printTowerOfHanoi(n-1, src, des, helper);
        System.out.println("Move "+n+"th disk from "+src+" to "+des);
        printTowerOfHanoi(n-1, helper, src, des);
    }
}
