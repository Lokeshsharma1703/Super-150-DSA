package Lec16;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findCombination(candidates, target, 0, temp, res);
        System.out.println(res);
    }
    private static void findCombination(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            target-=candidates[i];
            temp.add(candidates[i]);
            index=i;
            findCombination(candidates, target, index, temp, res);
            temp.remove(temp.size()-1);
            target+=candidates[i];
        }
    }
}
