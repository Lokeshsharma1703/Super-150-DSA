package Lec32;

public class Lowest_Common_Ancestor_ofaBinaryTree {
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode lft = lowestCommonAncestor(root.left, p, q);
        TreeNode rgt = lowestCommonAncestor(root.right, p, q);
        if(lft!=null && rgt!=null){
            return root;
        }
        else if(lft!=null){
            return lft;
        }
        else{
            return rgt;
        }
    }
}
