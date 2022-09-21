package Lec11;

public class factorial_tail {
    public static void main(String[] args) {
        System.out.println(fact(5,1));
    }
    private static int fact(int n, int f){
        if(n==1){
            return f;
        }
        f*=n;
        return fact(n-1, f);
    }
}
