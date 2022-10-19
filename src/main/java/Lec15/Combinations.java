package Lec15;

import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        boolean[] board = new boolean[n];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Printanswer(board, k, 0, temp, res, 0);
        System.out.println(res);
    }
    private static void Printanswer(boolean[] board, int tq, int qpsf, List<Integer> temp, List<List<Integer>> res, int index){
        if(qpsf==tq){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<board.length;i++){
            if(board[i]==false){
                board[i] = true;
                temp.add(i+1);
                Printanswer(board, tq, qpsf+1, temp, res, i+1);
                temp.remove(temp.size()-1);
                board[i] = false; //undo step / backtrack step
            }
        }
    }
//    private static void printCombination(boolean[] board, int k, int qspf, int index, List<Integer> temp, List<List<Integer>> res){
//        if(qspf==k){
//            res.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=index;i<board.length;i++){
//            if(board[i]==false){
//                board[i] = true;
//                temp.add(i+1);
//                printCombination(board, k, qspf+1, index+1, temp, res);
//                temp.remove(temp.size()-1);
//                board[i] = false;
//            }
//        }
//    }
}
