package Lec54;

public class Set_Bit_or_Not {
    public static void main(String[] args) {
        int n = 84;
        int pos = 4;

        System.out.println(setOrNot(n, pos));
    }
    private static boolean setOrNot(int n, int pos){
        int mask = (1<<pos);

        if((n & mask) > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
