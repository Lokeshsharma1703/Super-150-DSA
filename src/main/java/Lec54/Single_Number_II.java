package Lec54;

public class Single_Number_II {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,99, -2, 99, 99};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int[] bit = new int[32];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int pos = 0;
            while(num > 0){
                if((num & 1) > 0){
                    bit[pos]++;
                }
                pos++;
                num >>= 1;
            }
        }

        for (int i = 0; i < bit.length; i++) {
            bit[i] %= 3;
        }

        int num = 0;

        for (int i = 0; i < bit.length; i++) {
            if (bit[i] > 0) {
                num = num + (int) Math.pow(2, i);
            }
        }

        return num;
    }
}
