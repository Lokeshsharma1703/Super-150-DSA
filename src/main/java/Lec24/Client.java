package Lec24;

public class Client {
    public static void main(String[] args) {
        // case 1
//        P obj = new P();
//        System.out.println(obj.d);  // 1
//        System.out.println(obj.d1); // 10
//        obj.fun();
//        obj.fun1();



        // case 2
//        P obj = new C();
//        System.out.println(obj.d);  // 1
//        System.out.println(obj.d1); // 10
////        System.out.println(obj.d2);  //error  not accessible in runtime
//        System.out.println(((C)(obj)).d2);
//        System.out.println(((C)(obj)).d);
//        obj.fun();
//        obj.fun1();
////        obj.fun2(); // error
//        ((C)(obj)).fun2();



        // case 3   (not possible)
//        C obj = new P();  // not allowed
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(obj.d2);



        // case 4
//        C obj = new C();
//        System.out.println(obj.d);  // 2
//        System.out.println(obj.d1); // 10
//        System.out.println(obj.d2); // 20
//        System.out.println(((P)(obj)).d); // 1
//        obj.fun();
//        obj.fun1();
//        obj.fun2();
    }
}
