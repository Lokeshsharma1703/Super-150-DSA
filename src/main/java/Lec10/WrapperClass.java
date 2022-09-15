package Lec10;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        System.out.println(a);
        System.out.println(a1);

        a1 = a;//Autoboxing

        int x = 156;
        Integer y = 156;
        x=y;//Unboxing
        System.out.println(x==y);

        Integer c = 16;
        Integer c1 = 16;
        Integer d = 167;
        Integer d1 = 167;
        System.out.println(c==c1);
        System.out.println(d==d1);
    }
}
