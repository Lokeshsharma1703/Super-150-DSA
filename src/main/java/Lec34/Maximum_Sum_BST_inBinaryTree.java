package Lec34;

public class Maximum_Sum_BST_inBinaryTree {
    private class TreeNode {
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
    private class Pair{
        boolean isBST = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum = 0;  // bst sum
        long res = 0;  // bt sum
    }
    public int maxSumBST(TreeNode root) {
        return (int)maxSum(root).sum;
    }
    private Pair maxSum(TreeNode root){
        if(root==null){
            return new Pair();
        }
        Pair lft = maxSum(root.left);
        Pair rgt = maxSum(root.right);
        Pair curr = new Pair();
        curr.min = Math.min(lft.min, Math.min(root.val, rgt.min));
        curr.max = Math.max(lft.max, Math.max(root.val, rgt.max));
        if(lft.isBST && rgt.isBST && lft.max< root.val && rgt.min> root.val){
            curr.isBST = true;
            curr.res = lft.res + rgt.res + root.val;
            curr.sum = Math.max(curr.res, Math.max(lft.sum, rgt.sum));
        }
        else{
            curr.isBST = false;
            curr.res = 0;
            curr.sum = Math.max(lft.sum, rgt.sum);
        }
        return curr;
    }
}
