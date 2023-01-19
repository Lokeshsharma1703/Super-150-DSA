package Lec32;

public class Balanced_BinaryTree {
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



//    O(n^2)

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean lft = isBalanced(root.left);
        boolean rgt = isBalanced(root.right);
        boolean curr = Math.abs(height(root.left)-height(root.right))<=1;
        return lft && rgt && curr;
    }
    private int height(TreeNode node){
        if(node==null){
            return -1;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        return Math.max(lheight, rheight)+1;
    }
}
