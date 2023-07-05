package Lec57;

public class Minimize_XOR {
    public static void main(String[] args) {
        System.out.println(minimizeXor(3, 5));
    }

    public static int minimizeXor(int num1, int num2) {
        int count = setBit(num2);

        int res = 0;
        for (int i = 31; i >= 0 && count > 0; i--) {
            if((num1&(1<<i)) != 0){
                res += (1<<i);
                count--;
            }
        }

        for (int i = 0; i < 32 && count > 0; i++) {
            if((num1&(1<<i)) == 0){
                res += (1<<i);
                count--;
            }
        }

        return res;
    }

    public static int setBit(int num){
        int count = 0;
        while(num > 0){
            num = (num & (num-1));
            count++;
        }

        return count;
    }
}
