package Lec27;

import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(arr, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    private static int[] maxSlidingWindow(int[] nums, int k){
        Deque<Integer> dq = new LinkedList<Integer>();
        int[] res = new int[nums.length-k+1];
        int j=1;
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        res[0] = nums[dq.getFirst()];
        for(int i=k;i<nums.length;i++){
            while (!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
            if(!dq.isEmpty() && dq.getFirst()==i-k){
                dq.removeFirst();
            }
            res[j++] = nums[dq.getFirst()];
        }
        return res;
    }
}
