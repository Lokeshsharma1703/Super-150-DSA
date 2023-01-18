package Lec31;

import java.util.*;

public class Level_Order_Traversal {
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
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        List<Integer> ll = new ArrayList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        while (!q.isEmpty()){
            TreeNode rv = q.remove();
            ll.add(rv.val);
            if(rv.left!=null){
                q1.add(rv.left);
            }
            if(rv.right!=null){
                q1.add(rv.right);
            }
            if(q.isEmpty()){
                res.add(ll);
                ll = new ArrayList<>();
                q = q1;
                q1 = new LinkedList<>();
            }
        }
        return res;
    }
}
