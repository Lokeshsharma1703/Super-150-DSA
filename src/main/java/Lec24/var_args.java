package Lec24;

public class var_args {
    public static int add(int ...a){
        int sum = 0;
        for (int i: a) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(3,7,8,9,4));
        System.out.println(add(2,3,9,8,6,7,54,23));
    }
}
