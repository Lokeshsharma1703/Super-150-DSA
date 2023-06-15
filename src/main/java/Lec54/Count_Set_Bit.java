package Lec54;

public class Count_Set_Bit {
    public static void main(String[] args) {
//        int n = 67;
//        int count = 0;
//        while(n>0){
//            if((n & 1) > 0){
//                count++;
//            }
//            n>>=1;
//        }
//
//        System.out.println(count);

        System.out.println(countSetBit(67));
    }

    private static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            n = n&(n-1);
            count++;
        }

        return count;
    }
}
