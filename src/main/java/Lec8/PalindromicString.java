package Lec8;

import java.util.Locale;
import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkPalindrome(s));
    }
    private static boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
