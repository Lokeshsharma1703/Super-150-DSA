package Lec24;

public class Method_Overloading {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(add(5,8,7));
        System.out.println(add(2,9,4,8));
    }
}
