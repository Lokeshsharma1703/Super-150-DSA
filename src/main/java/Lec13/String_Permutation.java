package Lec13;

import java.util.Scanner;
public class String_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        printPermutation(s,"");
        printNonDuplicatePermutation(s,"");
    }
    private static void printPermutation(String s, String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String s1 = s.substring(0,i);
            String s2 = s.substring(i+1);
            printPermutation(s1+s2, res+ch);
        }
    }
    private static void printNonDuplicatePermutation(String s, String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean flag = false;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==ch){
                    flag = true;
                    break;
                }
            }
            if(flag==false) {
                String s1 = s.substring(0, i);
                String s2 = s.substring(i + 1);
                printNonDuplicatePermutation(s1 + s2, res + ch);
            }
        }
    }
}
