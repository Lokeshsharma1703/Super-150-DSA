package Lec17;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans = searchWord(board, i, j, word, 0);
                    if(ans==true){
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    private static boolean searchWord(char[][] board, int i, int j, String word, int index){
        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        board[i][j] = '_';
        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};
        for(int k=0;k<c.length;k++){
            boolean ans = searchWord(board, i+r[k], j+c[k], word, index+1);
            if(ans==true){
                return ans;
            }
        }
        board[i][j] = word.charAt(index);
        return false;
    }
}
