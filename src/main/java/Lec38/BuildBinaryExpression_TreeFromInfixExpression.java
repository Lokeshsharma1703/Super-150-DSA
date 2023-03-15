package Lec38;

// https://leetcode.ca/all/1597.html
// https://www.codingninjas.com/codestudio/problems/build-binary-expression-tree-from-infix-expression_1281854

import java.util.*;

public class BuildBinaryExpression_TreeFromInfixExpression {
    private static class BinaryTreeNode {
        char data;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(){}
        BinaryTreeNode(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        String s = "5*(9-4)/7+6";
        BinaryTreeNode node = binaryExpressionTree(s);
    }
    public static BinaryTreeNode binaryExpressionTree(String s) {
        return null;
    }
    private static String getPostfix(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                sb.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while (st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
            }
            else{
                while (!st.isEmpty() && getValue(st.peek())>=getValue(ch)){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static int getValue(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        return -1;
    }
}
