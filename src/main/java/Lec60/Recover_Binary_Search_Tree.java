package Lec60;

import java.util.ArrayList;
import java.util.List;

public class Recover_Binary_Search_Tree {
    public static void main(String[] args) {

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
        }
    }

    public void recoverTree(TreeNode root) {
        // approach 1
//        List<TreeNode> arr = new ArrayList<>();
//        inOrder(root, arr);
//
//        TreeNode first = null;
//        TreeNode second = null;
//        for(int i=0; i<arr.size()-1; i++){
//            if(arr.get(i).val > arr.get(i+1).val){
//                first = arr.get(i);
//                break;
//            }
//        }
//        for(int i=arr.size()-1; i>0; i--){
//            if(arr.get(i).val < arr.get(i-1).val){
//                second = arr.get(i);
//                break;
//            }
//        }
//
//        int temp = first.val;
//        first.val = second.val;
//        second.val = temp;


        // approach 2
        dfs(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

    }

    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;

    private void dfs(TreeNode root){
        if(root == null){
            return;
        }

        dfs(root.left);

        if(prev != null && prev.val > root.val){
            if(first == null){
                first = prev;
            }
            else {
                second = root;
            }
        }
        prev = root;
        dfs(root.right);
    }

    private static void inOrder(TreeNode root, List<TreeNode> arr){
        if(root == null){
            return;
        }

        inOrder(root.left, arr);
        arr.add(root);
        inOrder(root.right, arr);
    }
}
