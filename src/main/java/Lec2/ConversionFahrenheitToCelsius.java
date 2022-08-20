package Lec2;

import java.util.Scanner;

public class ConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int diff = sc.nextInt();
        int res = 0;
        for(int i=min;i<=max;i+=diff){
            res = (int)((5/9.0)*(i-32));
            System.out.println(i+"\t"+res);
        }
    }
}
