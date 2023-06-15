package Lec54;

public class Single_Number_III {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};
        int[] res = singleNumber(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public static int[] singleNumber(int[] nums) {
        int res = 0;

        for(int i : nums){
            res = res ^ i;
        }

        int mask = (res & (~(res-1)));
        int a = 0;
        for(int i=0; i<nums.length; i++){
            if((mask & nums[i])!=0){
                a ^= nums[i];
            }
        }
        int b = res ^ a;

        return new int[]{a, b};
    }
}
