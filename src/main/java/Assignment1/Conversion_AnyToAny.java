//Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.
//
//        Input Format
//        Constraints
//        0 < N <= 1000000000
//
//        Output Format
//        Sample Input
//        8
//        2
//        33
//        Sample Output
//        11011
//        Explanation
//        All input output is as integers and in separate lines.

package Assignment1;

import java.util.Scanner;

public class Conversion_AnyToAny {
    public static int convertToAnyBase(int sb, int db, int sn){
        int num = 0;
        if(sb==10 || db==10){
            int mul = 1;
            while(sn>0){
                int rem = sn%db;
                num+=rem*mul;
                sn/=db;
                mul*=sb;
            }
        }
        else{
            int mul = 1;
            int temp = 0;
            while(sn>0){
                int rem = sn%10;
                temp+=rem*mul;
                sn/=10;
                mul*=sb;
            }
            mul = 1;
            while(temp>0){
                int rem = temp%db;
                num+=rem*mul;
                temp/=db;
                mul*=10;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();
        System.out.println(convertToAnyBase(sb,db,sn));
    }
}
