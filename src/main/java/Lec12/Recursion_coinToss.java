package Lec12;

public class Recursion_coinToss {
    public static void main(String[] args) {
        int n = 3;
        coinToss(n, "HT","");
    }
    private static void coinToss(int n, String s, String res){
        if(n==0){
            System.out.println(res);
            return;
        }
        coinToss(n-1, s, res+s.charAt(0));
        coinToss(n-1, s, res+s.charAt(1));
    }
}
