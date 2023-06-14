package Lec53;

public class Hashing {
    public static void main(String[] args) {
        String s = "apple";

        System.out.println(hashing(s));
    }

    public static int hashing(String s){
        long mod = 1000_000_007;
        long pow = 1;

        long res = 0;
        int prime = 31;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            res = (res + ((ch-'a'+1)*pow) % mod) % mod;
            res = (res + mod) % mod;
            pow = (pow * prime) % mod;
        }

        return (int)res;
    }
}
