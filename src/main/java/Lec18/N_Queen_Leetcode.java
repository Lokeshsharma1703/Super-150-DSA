package Lec18;
import java.util.*;
public class N_Queen_Leetcode {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        findPosition(board, n, 0, res);
        System.out.println(res);
    }
    private static void findPosition(char[][] board, int n, int row, List<List<String>> res){
        if(n==0){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String st = "";
                for(int j=0;j<board[0].length;j++){
                    st = st+board[i][j];
                }
                temp.add(st);
            }
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                findPosition(board, n-1, row+1, res);
                board[row][col] = '.';
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col){
        int r = row;
        // vertical
        while (r>=0){
            if(board[r][col]=='Q'){
                return false;
            }
            r--;
        }

        // left diagonal
        r = row;
        int c = col;
        while (r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }

        // right diagonal
        r = row;
        c = col;
        while (r>=0 && c<board.length){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
