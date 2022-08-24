package Lec3;

public class Fun_demo2 {
    static int val = 100;
    public static void main(String[] args) {
        System.out.println("hello");
        int a = 5;
        int b = 7;
        System.out.println(val);
        System.out.println(addition(b,a));
        System.out.println(val);
        System.out.println("bye");
    }
    public static int addition(int a, int b){
        int val = 90;
        int c = a+b;
        val+=4;
        Fun_demo2.val+=4;
        System.out.println(val);
        return c;
    }
}
