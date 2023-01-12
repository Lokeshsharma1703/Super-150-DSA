package Lec26;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        int[] heights = {1,5,4,3};
        System.out.println(largestRectangleArea(heights));
    }
    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[i]<heights[st.peek()]){
                int h = heights[st.pop()];
                int r = i;
                if(st.isEmpty()){
                    maxArea = Math.max(maxArea, h*r);
                }
                else{
                    int l = st.peek();
                    maxArea = Math.max(maxArea, h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r = heights.length;
        while (!st.isEmpty()){
            int h = heights[st.pop()];
            if(st.isEmpty()){
                maxArea = Math.max(maxArea, h*r);
            }
            else{
                int l = st.peek();
                maxArea = Math.max(maxArea, h*(r-l-1));
            }
        }
        return maxArea;
    }
}
