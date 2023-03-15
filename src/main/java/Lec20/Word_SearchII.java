package Lec20;

import java.util.*;

public class Word_SearchII {
    public static void main(String[] args) {
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };
        String[] words = {"oath","pea","eat","rain"};
        List<String> res = new ArrayList<>();
        for(String s:words) {
            boolean f = true;
            for (int i = 0; i < board.length && f; i++) {
                for (int j = 0; j < board[0].length && f; j++) {
                    if (board[i][j] == s.charAt(0)) {
                        boolean ans = searchWord(board, i, j, s, 0);
                        if (ans) {
                            res.add(s);
                            f= false;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
    private static boolean searchWord(char[][] board, int i, int j, String word, int index){
        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>= board.length || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        board[i][j] = '_';
        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};
        for (int k = 0; k < r.length; k++) {
            boolean ans = searchWord(board, i+r[k], j+c[k], word, index+1);
            if(ans==true){
                board[i][j] = word.charAt(index);
                return ans;
            }
        }
        board[i][j] = word.charAt(index);
        return false;
    }
}
