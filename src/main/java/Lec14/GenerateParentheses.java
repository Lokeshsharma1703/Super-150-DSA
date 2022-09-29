package Lec14;

import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list= generateParenthesis(n);
        System.out.println(list);
    }
    private static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "",ans);
        return ans;
    }
    private static void generate(int n, int open, int close, String res,List<String> ans){
        if(open==n && close==n){
            ans.add(res);
            return;
        }
        if(open<n){
            generate(n, open+1, close, res+"(",ans);
        }
        if(close < open){
            generate(n, open, close+1, res+")",ans);
        }
    }
}
