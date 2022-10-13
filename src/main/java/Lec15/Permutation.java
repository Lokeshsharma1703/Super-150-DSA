package Lec15;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] arr = {-10,1,10};
        boolean[] freq = new boolean[arr.length];
        permutation(arr, freq, 0, temp, ans);
        System.out.println(ans);
    }

    private static void permutation(int[] nums, boolean[] freq, int qspf, List<Integer> res, List<List<Integer>> ans) {
        if (qspf == nums.length) {
            ans.add(new ArrayList<>(res));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (freq[i] == false) {
                freq[i] = true;
                res.add(nums[i]);
                permutation(nums, freq, qspf + 1, res, ans);
                res.remove(res.size()-1);
                freq[i] = false;
            }
        }
    }
}
