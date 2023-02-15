package Lec36;

public class Distribute_Coins_in_BinaryTree {
    public class TreeNode {
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
    int moves = 0;
    public int distributeCoins(TreeNode root) {
        distribute(root);
        return moves;
    }
    private int distribute(TreeNode root){
        if(root==null){
            return 0;
        }
        int lft = distribute(root.left);
        int rgt = distribute(root.right);

        moves += Math.abs(lft)+Math.abs(rgt);
        return lft + rgt + root.val + -1;
    }
}
