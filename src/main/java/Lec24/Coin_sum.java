package Lec24;

import java.util.*;

public class Coin_sum {
    public static void main(String[] args) {
        int n = 3;
        List<List<Integer>> res = new ArrayList<>();
        printPermutations(n, n, new ArrayList<>(), res);
        System.out.println(res);
    }
    private static void printPermutations(int n, int index, List<Integer> temp, List<List<Integer>> res){
        if(n==0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i>=1;i--){
            if(n-i>=0){
                temp.add(i);
                printPermutations(n-i, i, temp, res);
                temp.remove(temp.size()-1);
            }
        }
    }
}
