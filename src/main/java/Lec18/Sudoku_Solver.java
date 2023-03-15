package Lec18;

public class Sudoku_Solver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        sudokuSolver(board, 0, 0);
    }
    private static void sudokuSolver(char[][] board, int row, int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            display(board);
            return;
        }
        if(board[row][col]!='.'){
            sudokuSolver(board, row, col+1);
        }
        else{
            for(int val = 1;val<=9;val++){
                if(isPossible(board, row, col, val)){
                    board[row][col] = (char)(val+'0');
                    sudokuSolver(board, row, col+1);
                    board[row][col] = '.';
                }
            }
        }
    }
    private static boolean isPossible(char[][] board, int row, int col, int val){
        // Horizontal
        for(int c=0;c<9;c++){
            if(board[row][c]==(char)(val+'0')){
                return false;
            }
        }

        // Vertical
        for(int r=0;r<9;r++){
            if(board[r][col]==(char)(val+'0')){
                return false;
            }
        }

        // 3*3 matrix
        int r = row-row%3;
        int c = col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==(char)(val+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    private static void display(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
