package Lec12;

import java.util.Scanner;

public class Recursion_coinTossnothavingtwoheads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coinToss(n, "HT","");
    }
    private static void coinToss(int n, String s, String res){
        if(n==0){
            System.out.println(res);
            return;
        }
        if(res.length()>0 && res.charAt(res.length()-1)=='H'){
            coinToss(n-1, s, res+s.charAt(1));
        }
        else {
            coinToss(n-1, s, res+s.charAt(0));
            coinToss(n-1, s, res+s.charAt(1));
        }
    }
}
