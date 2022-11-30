package Lec26;

import java.util.Stack;

public class Maximal_Rectangle {
    public static void main(String[] args) {
        char[][] matrix =  {{'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        int[] res = new int[matrix[0].length];
        int area = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]=='1'){
                    res[j]++;
                }
                else{
                    res[j] = 0;
                }
            }
            area = Math.max(area, largestRectangleArea(res));
        }
        System.out.println(area);
    }
    private static int largestRectangleArea(int[] heights){
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
