package Lec15;

import java.util.Scanner;

public class Queen_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] board = new boolean[n];
        int tq = 2;
        Printanswer(board, tq, 0, "");
    }
    //qpsf(queen place so far)
    private static void Printanswer(boolean[] board, int tq, int qpsf, String res){
        if(qpsf==tq){
            System.out.println(res);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i] = true;
                Printanswer(board, tq, qpsf+1, res+"b"+i+"q"+qpsf);
                board[i] = false; //undo step / backtrack step
            }
        }
    }
}
