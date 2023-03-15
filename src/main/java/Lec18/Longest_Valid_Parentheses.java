package Lec18;
import java.util.*;
public class Longest_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()(()";
        Stack st = new Stack<>();
        st.push(-1);
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else {
                    res = Math.max(res,i- (int)st.peek());
                }
            }
        }
        System.out.println(res);
    }
}
