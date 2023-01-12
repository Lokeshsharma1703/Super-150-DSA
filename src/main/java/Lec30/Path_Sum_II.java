package Lec30;

import java.util.*;

public class Path_Sum_II {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        findCombination(root, targetSum, new ArrayList<>(), res);
        return res;
    }

    private static void findCombination(TreeNode root, int targetSum, List<Integer> temp, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val) {
            res.add(new ArrayList<>(temp));
        }
        findCombination(root.left, targetSum - root.val, temp, res);
        findCombination(root.right, targetSum - root.val, temp, res);
        temp.remove(temp.size() - 1);
    }
}
