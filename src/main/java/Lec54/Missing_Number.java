package Lec54;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int xor = 0;

        for(int i=1;i<=nums.length;i++){
            xor = xor ^ i;
        }

        for(int i : nums){
            xor = xor ^ i;
        }

        return xor;
    }
}
