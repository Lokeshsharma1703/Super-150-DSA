package Lec4;

public class Array_demo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr);
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = -4;
        arr[3] = 98;
        arr[4] = 32;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] other = arr;
        System.out.println(other[2]);
    }
}
