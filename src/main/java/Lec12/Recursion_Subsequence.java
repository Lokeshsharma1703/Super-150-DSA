package Lec12;

public class Recursion_Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        subSequence(s,"");
    }
    private static void subSequence(String s, String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        subSequence(s.substring(1), res);
        subSequence(s.substring(1), res+s.charAt(0));
    }
}
