package Lec55;

public class Subsequence_Bit_Masking {
    public static void main(String[] args) {

        String str = "abc";
        subSequence(str);
    }

    private static void subSequence(String s){
        int n = s.length();
        for (int i = 0; i < (1<<n); i++) {
            pattern(i, s);
        }
    }

    private static void pattern(int i, String s){
        int pos = 0;
        while(i > 0){
            if((i & 1) != 0){
                System.out.print(s.charAt(pos));
            }
            i >>= 1;
            pos++;
        }
        System.out.println();
    }
}
