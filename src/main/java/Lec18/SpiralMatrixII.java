package Lec18;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        int[][] res = new int[n][n];
        int count = 0;
        int rmin = 0;
        int rmax = n-1;
        int cmin = 0;
        int cmax = n-1;
        int total = n*n;
        int num = 1;
        while (count<total){
            for(int i=cmin;i<=cmax && count<total;i++){
                res[rmin][i] = num++;
                count++;
            }
            rmin++;
            for(int i=rmin;i<=rmax && count<total;i++){
                res[i][cmax] = num++;
                count++;
            }
            cmax--;
            for(int i=cmax;i>=cmin && count<total;i--){
                res[rmax][i] = num++;
                count++;
            }
            rmax--;
            for(int i=rmax;i>=rmin && count<total;i--){
                res[i][cmin] = num++;
                count++;
            }
            cmin++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
