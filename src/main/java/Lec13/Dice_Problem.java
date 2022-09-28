package Lec13;

import java.util.Scanner;

public class Dice_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice = sc.nextInt();
        int des = sc.nextInt();
        printPath(0, des, dice,"");
    }
    private static void printPath(int curr, int end, int noOfDice, String res){
        if(curr==end){
            System.out.println(res);
            return;
        }
        if(curr>end){
            return;
        }
//        printPath(curr+1, end, res+1);
//        printPath(curr+2, end, res+2);
//        printPath(curr+3, end, res+3);
        for(int dice = 1;dice<=noOfDice;dice++){
            printPath(curr+dice, end, noOfDice,res+dice);
        }
    }
}
