package Lec30;

public class Symmetric_Tree {
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
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root, root);
    }

    private static boolean symmetric(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        if(node1.val != node2.val){
            return false;
        }

        boolean lft = symmetric(node1.left, node2.right);
        boolean rgt = symmetric(node1.right, node2.left);

        return lft && rgt;
    }
}
