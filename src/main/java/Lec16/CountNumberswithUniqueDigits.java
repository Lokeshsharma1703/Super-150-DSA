package Lec16;

public class CountNumberswithUniqueDigits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countNumbers(n));
    }
    private static int countNumbers(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        int p = 9;
        int res = 0;
        for(int i=2;i<=n;i++){
            p = p*(11-i);
            res+=p;
        }
        return res+10;
    }
}
