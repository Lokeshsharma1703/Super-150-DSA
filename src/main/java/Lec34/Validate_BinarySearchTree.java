package Lec34;

public class Validate_BinarySearchTree {
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
    }
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isBST;
    }
    private Pair validBST(TreeNode root){
        if(root==null){
            return new Pair();
        }
        Pair lft = validBST(root.left);
        Pair rgt = validBST(root.right);
        Pair curr = new Pair();
        curr.min = Math.min(lft.min, Math.min(root.val, rgt.min));
        curr.max = Math.max(lft.max, Math.max(root.val, rgt.max));
        if(lft.isBST && rgt.isBST && lft.max< root.val && rgt.min> root.val){
            curr.isBST = true;
        }
        else{
            curr.isBST = false;
        }
        return curr;
    }
}
