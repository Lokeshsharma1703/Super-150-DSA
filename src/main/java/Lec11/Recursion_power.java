package Lec11;

public class Recursion_power {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    private static int power(int a, int b){
        if(b==0){
            return 1;
        }
        return a*power(a,b-1);
    }
}
