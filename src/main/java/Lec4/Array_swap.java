package Lec4;

public class Array_swap {
    public static void main(String[] args) {
        int[] arr = {5,3,6,9,8};
        System.out.println(arr[0]+" "+arr[1]);
        Swap(arr[0],arr[1]);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
