package Lec16;

import java.util.*;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean[] freq = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        permutation(nums, freq, 0, temp, res);
        System.out.println(res);
    }
    private static void permutation(int[] arr, boolean[] freq, int qspf, List<Integer> temp, List<List<Integer>> res){
        if(qspf==arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(freq[i]==false){
                if(i>0 && arr[i]==arr[i-1] && !freq[i-1]){
                    continue;
                }
                freq[i] = true;
                temp.add(arr[i]);
                permutation(arr, freq, qspf+1, temp, res);
                temp.remove(temp.size()-1);
                freq[i] = false;
            }
        }
    }
}
