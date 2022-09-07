package Lec7;

public class Spiral_2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25}};
        printSpiralArray(arr);
    }
    private static void printSpiralArray(int[][] arr){
        int row_min = 0;
        int row_max = arr.length-1;
        int column_min = 0;
        int column_max = arr[0].length-1;
        int count = 0;
        int total = arr.length * arr[0].length;
        while (count<total){
            for(int i=column_min;i<=column_max && count<total;i++){
                System.out.print(arr[row_min][i]+" ");
                count++;
            }
            row_min++;
            for(int i=row_min;i<=row_max && count<total;i++){
                System.out.print(arr[i][column_max]+" ");
                count++;
            }
            column_max--;
            for(int i=column_max;i>=column_min && count<total;i--){
                System.out.print(arr[row_max][i]+" ");
                count++;
            }
            row_max--;
            for(int i=row_max;i>=row_min && count<total;i--){
                System.out.print(arr[i][column_min]+" ");
                count++;
            }
            column_min++;
        }
    }
}
