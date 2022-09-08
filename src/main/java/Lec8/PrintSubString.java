package Lec8;

import javafx.concurrent.ScheduledService;

import java.util.Scanner;

public class PrintSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subString(s);
    }
    private static void subString(String s){
        for(int i=1;i<=s.length();i++){
            for(int j=i;j<=s.length();j++){
                int k = j-i;
                System.out.println(s.substring(k,j));
            }
        }
    }
}
