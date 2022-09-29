package Lec14;

import java.util.*;
import java.util.Scanner;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> res = lexicalOrder(n);
        System.out.println(res);
    }
    private static List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<Integer>();
        printLexicalOrder(n, 0, ans);
        return ans;
    }
    private static void printLexicalOrder(int n, int curr,List<Integer> res){
        if(curr>n){
            return;
        }
        res.add(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for (;i<=9;i++){
            printLexicalOrder(n, curr*10+i, res);
        }
    }
}
