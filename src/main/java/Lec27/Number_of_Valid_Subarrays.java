package Lec27;

import java.util.Stack;

public class Number_of_Valid_Subarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(validSubArray(arr));
    }
    private static int validSubArray(int[] arr){
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]<st.peek()){
                st.pop();
            }
            st.push(arr[i]);
            res+=st.size();
        }
        return res;
    }
}
