package Lec1;

public class post_preincrement {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(x++);
        System.out.println(x);
        int c = x + x++ + 8 + x + x--;
        System.out.println(c);
        System.out.println(--c);
        x = 9;
        int p = 11 + x++ + ++x + --x + x-- + 7 + x + 1;
        System.out.println(p);
    }
}
