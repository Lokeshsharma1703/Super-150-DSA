package Lec26;

import java.util.Stack;

public class Maximum_Score_of_a_Good_Subarray {
    public static void main(String[] args) {
        int[] heights = {1,4,3,7,4,5};
        System.out.println(largestRectangleArea(heights, 3));
    }
    private static int largestRectangleArea(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[i]<nums[st.peek()]){
                int h = nums[st.pop()];
                int r = i;
                if(r-1>=k){
                    if(st.isEmpty()){
                        maxArea = Math.max(maxArea, h*r);
                    }
                    else{
                        int l = st.peek();
                        if(l+1<=k){
                            maxArea = Math.max(maxArea, h*(r-l-1));
                        }
                    }
                }
            }
            st.push(i);
        }
        int r = nums.length;
        while (!st.isEmpty()){
            int h = nums[st.pop()];
            if(r-1>=k){
                if(st.isEmpty()){
                    maxArea = Math.max(maxArea, h*r);
                }
                else{
                    int l = st.peek();
                    if(l+1<=k){
                        maxArea = Math.max(maxArea, h*(r-l-1));
                    }
                }
            }
        }
        return maxArea;
    }
}
