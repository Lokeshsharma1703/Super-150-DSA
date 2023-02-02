package Lec34;

public class Binary_Tree_Cameras {
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
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        int c = countCamera(root);
        if(c==-1){
            camera++;
        }
        return camera;
    }
    private int countCamera(TreeNode root){
        if(root==null){
            return 1;
        }

        int lft = countCamera(root.left);
        int rgt = countCamera(root.right);

        if(lft == -1 || rgt == -1){
            camera++;
            return 2;
        }
        if(lft == 1 && rgt == 1){
            return -1;
        }
        else{
            return 1;
        }
    }
}
