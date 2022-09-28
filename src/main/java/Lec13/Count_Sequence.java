package Lec13;

public class Count_Sequence {
    static int count = 0;
    public static void main(String[] args) {
        String s = "abc";
        subSequence(s,"");
        System.out.println(count);
        System.out.println(countSubSequence(s,""));
    }
    private static void subSequence(String s, String res){
        if(s.length()==0){
            count++;
            return;
        }
        subSequence(s.substring(1), res);
        subSequence(s.substring(1), res+s.charAt(0));
    }
    private static int countSubSequence(String s, String res){
        if(s.length()==0){
            count++;
            return 1;
        }
        int res1 = countSubSequence(s.substring(1), res);
        int res2 = countSubSequence(s.substring(1), res+s.charAt(0));
        return res1+res2;
    }
}
