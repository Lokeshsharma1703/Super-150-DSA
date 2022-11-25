package Lec25;

import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
    private static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int ele = st.pop();
        Reverse(st);
        Insert(st, ele);
    }
    private static void Insert(Stack<Integer> st, int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int ele = st.pop();
        Insert(st, item);
        st.push(ele);
    }
}
