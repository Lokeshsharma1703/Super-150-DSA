package Lec4;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int n = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n--] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
