package Lec8;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reveseWords(s));
    }
    private static String reveseWords(String s){
        s=s.trim();
        String[] arr = s.split("\s+");
        String res = "";
        for(int i=arr.length-1;i>0;i--) {
            res += arr[i] + " ";
        }
        res=res.trim();
        return res;
    }
}
