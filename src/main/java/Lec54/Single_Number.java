package Lec54;

public class Single_Number {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int res = 0;

        for(int i : nums){
            res = res ^ i;
        }

        return res;
    }
}
