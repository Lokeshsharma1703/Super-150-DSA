package Lec11;

public class Recursion_Basics {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    private static int fact(int n){
        if(n==1)
            return 1;
        return fact(n-1)*n;
    }
}
