package Lec27;

import java.util.*;

public class Sum4 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int target = 8;
        List<List<Integer>> res = fourSum(nums, target);
        System.out.println(res);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length==0){
            return res;
        }
        Arrays.sort(nums);
        sum4(nums, 0, 0, target, new ArrayList<>(), res);
        return res;
    }
    private static void sum4(int[] nums, int index, int curr, int target, List<Integer> temp, List<List<Integer>> res){
        if(curr==target && temp.size()==4){
            res.add(new ArrayList<>(temp));
            return;
        }
        else if(temp.size()==4){
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(nums[i]+nums[nums.length-1]*(3-temp.size())+curr<target){
                continue;
            }
            if(nums[i]*(4-temp.size())+curr>target){
                return;
            }
            temp.add(nums[i]);
            sum4(nums, i+1, curr+nums[i], target, temp, res);
            temp.remove(temp.size()-1);
            while (i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }
        }
    }
}
