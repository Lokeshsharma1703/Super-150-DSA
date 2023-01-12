package Lec30;

public class Flip_Equivalent_Binary_Trees {
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }

        boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);

        return flip || noflip;
    }
}
