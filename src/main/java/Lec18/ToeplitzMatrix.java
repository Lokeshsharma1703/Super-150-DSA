package Lec18;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };
        boolean flag = true;
        int row = matrix.length-1;
        int col = 0;
        while(row>=0){
            if(row< matrix.length-1){
                int r = row+1;
                int c = col+1;
                while(r< matrix.length && c<matrix[0].length){
                    if(matrix[r-1][c-1]!=matrix[r][c]){
                        flag = false;
                        break;
                    }
                    r++;
                    c++;
                }
            }
            row--;
        }
        row=0;
        col = 1;
        while (col<matrix[0].length){
            if(col<matrix[0].length-1){
                int r = row+1;
                int c = col+1;
                while (r< matrix.length && c<matrix[0].length){
                    if(matrix[r-1][c-1]!=matrix[r][c]){
                        flag = false;
                        break;
                    }
                    r++;
                    c++;
                }
            }
            col++;
        }
        System.out.println(flag);
    }
}
