package Lec16;
import java.util.*;
public class CombinationSumIII {
    public static void main(String[] args) {
        int n = 9;
        int k = 3;
        int[] candidates = {1,2,3,4,5,6,7,8,9};
        int[] freq = new int[9];
        boolean[] visited = new boolean[candidates.length];
        for(int i=0;i<candidates.length;i++){
            freq[candidates[i]-1]++;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findCombination(candidates, freq, visited, n, k, 0, temp, res);
        System.out.println(res);
    }
    private static void findCombination(int[] candidates,int[] freq, boolean[] visited, int target, int k, int index, List<Integer> temp, List<List<Integer>> res){
        if(target==0 && temp.size()==k){
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
                findCombination(candidates, freq, visited, target, k, index, temp, res);
                temp.remove(temp.size()-1);
                target+=candidates[i];
                freq[candidates[i]-1]++;
                visited[i] = false;
            }
        }
    }
}
