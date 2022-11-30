package Lec26;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(smallestNumber(s));
    }
    private static String smallestNumber(String pattern) {
        int[] res = new int[pattern.length()+1];
        int count = 1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < res.length; i++) {
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                res[i] = count++;
                while (!st.isEmpty()){
                    res[st.pop()] = count++;
                }
            }
            else {
                st.push(i);
            }
        }
        String str = "";
        for(int i:res){
            str+=i;
        }
        return str;
    }
}
