package Lec5;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] leftmax = new int[nums.length];
        leftmax[0] = 1;
        for(int i=1;i<leftmax.length;i++){
            leftmax[i] = leftmax[i-1] * nums[i-1];
        }
        int[] rightmax = new int[nums.length];
        rightmax[rightmax.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            rightmax[i] = rightmax[i+1] * nums[i+1];
        }
        int sum = 0;
        for(int i=0;i<leftmax.length;i++){
            sum+=Math.min(leftmax[i],rightmax[i])-nums[i];
        }

        for(int i=0;i<leftmax.length;i++){
            leftmax[i] = leftmax[i]*rightmax[i];
        }
        return leftmax;
    }
}
