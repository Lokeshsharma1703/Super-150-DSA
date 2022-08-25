package Lec4;

public class Swap_Demo {
    public static void main(String[] args) {
        int[] arr = {2,8,7,5,9};
        int[] other = {7,4,4,9,5};
        System.out.println(arr[0]+" "+other[1]);
        Swap(arr,other);
        System.out.println(arr[0]+" "+other[1]);
    }
    public static void Swap(int[] arr, int[] other){
        int[] temp = arr;
        arr = other;
        other = temp;
    }
}
