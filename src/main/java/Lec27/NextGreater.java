package Lec27;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        temperatures = nextGreater(temperatures);
        for (int i: temperatures){
            System.out.print(i+" ");
        }
    }
    private static int[] nextGreater(int[] temperature){
        int[] res = new int[temperature.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<temperature.length;i++){
            while (!st.isEmpty() && temperature[i]>temperature[st.peek()]){
                res[st.peek()] = i-st.pop();
            }
            st.push(i);
        }
        return res;
    }
}
