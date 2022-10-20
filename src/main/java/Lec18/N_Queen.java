package Lec18;

import java.util.*;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queenProblem(board, n, 0);
    }
    private static void queenProblem(boolean[][] board, int tq, int row){
        if(tq==0){
            display(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                queenProblem(board, tq-1, row+1);
                board[row][col] = false;
            }
        }
    }
    private static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static boolean isSafe(boolean[][] board, int row, int col){
        int r = row;
        //vertical
        while (r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }

        //left diagonal
        r = row;
        int c = col;
        while (r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }

        //right diagonal
        r = row;
        c = col;
        while (r>=0 && c<board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
