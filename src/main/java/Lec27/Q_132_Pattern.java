package Lec27;

import java.util.Stack;

public class Q_132_Pattern {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(find132pattern(arr));
    }
    private static boolean find132pattern(int[] nums){
        int[] minArr = new int[nums.length];
        minArr[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            minArr[i] = Math.min(minArr[i-1], nums[i]);
        }
        Stack<Integer> st = new Stack<>();
        for(int j = nums.length-1;j>=0;j--){
            int ith = minArr[j];
            while (!st.isEmpty() && ith>=nums[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty() && nums[j]>nums[st.peek()]){
                return true;
            }
            st.push(j);
        }
        return false;
    }
}
