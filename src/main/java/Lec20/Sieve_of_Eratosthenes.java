package Lec20;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 100;
        primeSeive(n);
    }
    private static void primeSeive(int n){
        // if any index is set to false than that index is said to be 'prime' index
        // if any index is set to true than that index is said to be 'not prime' index
        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        for(int i=2;i< arr.length;i++){
            if(arr[i]==false){
                for (int j = 2; i*j <= n; j++) {
                    arr[i*j] = true;   // not prime set kiye ho
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
