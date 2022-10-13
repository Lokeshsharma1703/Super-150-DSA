package Lec16;

import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        Arrays.sort(candidates);
        int target = 8;
        int[] freq = new int[50];
        boolean[] visited = new boolean[candidates.length];
        for(int i=0;i<candidates.length;i++){
            freq[candidates[i]-1]++;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findCombination(candidates, freq, visited, target, 0, temp, res);
        System.out.println(res);
    }
    private static void findCombination(int[] candidates,int[] freq, boolean[] visited, int target, int index, List<Integer> temp, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>0 && candidates[i]==candidates[i-1] && !visited[i-1]){
                continue;
            }
            if(freq[candidates[i]-1]>0 && visited[i]==false){
                visited[i] = true;
                freq[candidates[i]-1]--;
                target-=candidates[i];
                temp.add(candidates[i]);
                index=i;
                findCombination(candidates, freq, visited, target, index, temp, res);
                temp.remove(temp.size()-1);
                target+=candidates[i];
                freq[candidates[i]-1]++;
                visited[i] = false;
            }
        }
    }
}
