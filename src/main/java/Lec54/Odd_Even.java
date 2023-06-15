package Lec54;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 53;

        if((n & 1) > 0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
