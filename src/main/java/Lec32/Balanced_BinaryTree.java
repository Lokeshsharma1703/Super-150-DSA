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


//    O(n)
    private class Pair{
        int height = -1;
        boolean balanced = true;
    }
    public boolean isBalanced(TreeNode root){
        return isBalances(root).balanced;
    }
    public Pair isBalances(TreeNode root){
        if(root==null){
            return new Pair();
        }
        Pair lft = isBalances(root.left);
        Pair rgt = isBalances(root.right);
        Pair curr = new Pair();
        curr.balanced = Math.abs(lft.height-rgt.height)<=1;
        curr.height = Math.max(lft.height, rgt.height)+1;
        return curr;
    }




//    O(n^2)

//    public boolean isBalanced(TreeNode root) {
//        if(root==null){
//            return true;
//        }
//        boolean lft = isBalanced(root.left);
//        boolean rgt = isBalanced(root.right);
//        boolean curr = Math.abs(height(root.left)-height(root.right))<=1;
//        return lft && rgt && curr;
//    }
//    private int height(TreeNode node){
//        if(node==null){
//            return -1;
//        }
//        int lheight = height(node.left);
//        int rheight = height(node.right);
//        return Math.max(lheight, rheight)+1;
//    }
}
