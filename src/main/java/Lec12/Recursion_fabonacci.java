package Lec12;

public class Recursion_fabonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fabonacci(5));
    }
    private static int fabonacci(int n){
        if(n==0 || n==1)
            return n;
        int f1 = fabonacci(n-1);
        int f2 = fabonacci(n-2);
        return f1+f2;
    }
}
