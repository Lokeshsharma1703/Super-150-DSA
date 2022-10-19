package Lec15;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        printSubsets(nums, 0, temp, res);
        System.out.println(res);
    }
    private static void printSubsets(int[] nums, int index, List<Integer> temp, List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])
                continue;
            temp.add(nums[i]);
            printSubsets(nums, i+1, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}
