package Lec5;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,4,1,6,8,4,9,5,2,4};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static  void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j = 0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
