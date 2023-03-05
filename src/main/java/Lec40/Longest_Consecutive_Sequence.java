package Lec40;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(mp.containsKey(nums[i]-1)){
                mp.put(nums[i], false);
            }
            else{
                mp.put(nums[i], true);
            }

            if(mp.containsKey(nums[i]+1)){
                mp.put(nums[i]+1, false);
            }
        }

        int res = 0;
        for(int key : mp.keySet()){
            if(mp.get(key)==true){
                int count = 0;
                while(mp.containsKey(key)){
                    count++;
                    key++;
                }
                res = Math.max(res, count);
            }
        }

        return res;
    }
}
