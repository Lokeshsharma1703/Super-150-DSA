package Lec17;

import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(candidates, target, new ArrayList<>(), 0, res);
        System.out.println(res);
    }
    private static void combinationSum(int[] candidates, int target, List<Integer> temp, int index, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i!=index && candidates[i]==candidates[i-1]){
                continue;
            }
            if(target>=candidates[i]){
                temp.add(candidates[i]);
                combinationSum(candidates, target-candidates[i], temp, i+1, res);
                temp.remove(temp.size()-1);
            }
        }
    }
}
