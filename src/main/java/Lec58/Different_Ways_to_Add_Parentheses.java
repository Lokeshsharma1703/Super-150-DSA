package Lec58;

import java.util.*;

public class Different_Ways_to_Add_Parentheses {
    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("2*3-4*5"));
    }

    public static List<Integer> diffWaysToCompute(String expression) {

        if(expression.indexOf('+')==-1 && expression.indexOf('-')==-1 && expression.indexOf('*')==-1){
            List<Integer> res = new ArrayList<>();
            res.add(Integer.parseInt(expression));
            return res;
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(isOperator(ch)){
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for(int li : left){
                    for(int ri : right){
                        res.add(calculate(li, ri, ch));
                    }
                }
            }
        }

        return res;
    }

    public static int calculate(int a, int b, char op){
        if(op=='+'){
            return a+b;
        }
        else if(op=='-'){
            return a-b;
        }
        else{
            return a*b;
        }
    }

    private static boolean isOperator(char ch){
        return (ch=='+' || ch=='-' || ch=='*');
    }
}
