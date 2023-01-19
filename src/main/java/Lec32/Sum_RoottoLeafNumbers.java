package Lec32;

public class Sum_RoottoLeafNumbers {
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
    public int sumNumbers(TreeNode root) {
        return Sum(root, 0);
    }
    private int Sum(TreeNode root, int sum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return sum*10 + root.val;
        }
        int lft = Sum(root.left, (sum*10)+root.val);
        int rgt = Sum(root.right, (sum*10)+root.val);
        return lft+rgt;
    }
}
