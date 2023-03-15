package Lec21;

import java.util.Arrays;

public class EqualString {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        int N = 1;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Arrays.sort(c3);
        boolean f1 = true;
        for(int i=0;i<N;i++){
            if(c1[i]!=c2[i]){
                f1 = false;
            }
        }
        boolean f2 = true;
        for(int i=0;i<N;i++){
            if(c2[i]!=c3[i]){
                f2 = false;
            }
        }
        boolean f3 = true;
        for(int i=0;i<N;i++){
            if(c1[i]!=c3[i]){
                f3 = false;
            }
        }
        System.out.println((f1==true?f1:f2)==true?(f1==true?f1:f2):f3);
    }
}
