package Lec52;

import Lec40.HashMap;

public class House_Robber_III {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main(String[] args) {
        System.out.println(rob(new TreeNode()));
    }

    public static int rob(TreeNode root) {
        HashMap<TreeNode, Integer> dp = new HashMap<>();
        return house_rob(root, dp);
    }

    private static int house_rob(TreeNode root, HashMap<TreeNode, Integer> dp){
        if(root==null){
            return 0;
        }

        if(dp.containsKey(root)){
            return dp.get(root);
        }

        int res = root.val;
        if(root.left!=null){
            res += house_rob(root.left.left, dp) + house_rob(root.left.right, dp);
        }
        if(root.right!=null){
            res += house_rob(root.right.left ,dp) + house_rob(root.right.right, dp);
        }

        int dontrob = house_rob(root.left, dp) + house_rob(root.right, dp);
        dp.put(root, Math.max(res, dontrob));
        return Math.max(res, dontrob);
    }
}
