package Lec15;

public class Coin_Permutation {
    public static void main(String[] args) {
        int[] coins = {2,3,5,7};
        int amount = 10;
        permutation(coins, amount, "");
    }

    //with backtracking
    private static void permutation(int[] coins, int amount, String res){
        if(amount==0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                amount-=coins[i];
                permutation(coins, amount,res+coins[i]);
                amount+=coins[i];  //backtrack step
            }
        }
    }


    //without backtracking
//    private static void permutation(int[] coins, int amount, String res){
//        if(amount==0){
//            System.out.println(res);
//            return;
//        }
//        for(int i=0;i<coins.length;i++){
//            if(amount>=coins[i]){
//                permutation(coins, amount-coins[i],res+coins[i]);
//            }
//        }
//    }
}
