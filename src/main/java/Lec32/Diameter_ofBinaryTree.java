package Lec32;

import Lec30.Binary_Tree;
import javafx.scene.control.DialogPane;

public class Diameter_ofBinaryTree {
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

    class DiaPair{
        int height = -1;
        int d = 0;
    }
    public DiaPair diameter(TreeNode root){
        if(root==null){
            return new DiaPair();
        }
        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);
        DiaPair sdp = new DiaPair();
        int sd = ldp.height + rdp.height + 2;
        sdp.d = Math.max(sd, Math.max(ldp.d, rdp.d));
        sdp.height = Math.max(ldp.height, rdp.height)+1;
        return sdp;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }


//    O(n^2)

//    public int diameterOfBinaryTree(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        int ld = diameterOfBinaryTree(root.left);
//        int rd = diameterOfBinaryTree(root.right);
//        int sd = height(root.left) + height(root.right) + 2;
//        return Math.max(sd, Math.max(ld, rd));
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
