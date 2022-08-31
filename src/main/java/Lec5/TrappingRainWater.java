package Lec5;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<leftmax.length;i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        rightmax[rightmax.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        int sum = 0;
        for(int i=0;i<leftmax.length;i++){
            sum+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return sum;
    }
}
