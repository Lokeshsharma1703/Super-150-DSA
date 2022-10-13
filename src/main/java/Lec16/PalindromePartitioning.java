package Lec16;

import java.util.*;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "nitin";
        List<List<String>> result = new ArrayList<>();
        List<String> res = new ArrayList<>();
        partitions(s,res, result);
        System.out.println(result);
    }
    private static void partitions(String ques, List<String> ans, List<List<String>> result){
        if(ques.length()==0){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int cut = 1;cut<=ques.length();cut++){
            String s = ques.substring(0,cut);
            if(isPalindrome(s)) {
                ans.add(s);
                partitions(ques.substring(cut), ans, result);
                ans.remove(ans.size()-1);  //backtrack step
            }
        }
    }
    private static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
