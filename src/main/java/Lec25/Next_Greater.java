package Lec25;

import java.util.Stack;

public class Next_Greater {
    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 3, 5, 4, 8, 7};
        nGreaterElement(arr);
    }
    private static void nGreaterElement(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            res[st.pop()] = -1;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
