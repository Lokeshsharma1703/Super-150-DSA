package Lec15;

import java.util.Scanner;

public class Queen_Combination {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        Printanswer(board, tq, 0, "", 0);
    }
    //qpsf(queen place so far)
    private static void Printanswer(boolean[] board, int tq, int qpsf, String res, int index){
        if(qpsf==tq){
            System.out.println(res);
            return;
        }
        for(int i=index;i<board.length;i++){
            if(board[i]==false){
                board[i] = true;
//                Printanswer(board, tq, qpsf+1, res+"b"+i+"q"+qpsf, i+1);
                Printanswer(board, tq, qpsf+1, res+(i+1), i+1);
                board[i] = false; //undo step / backtrack step
            }
        }
    }
}
