package Lec32;

import Assignment1.PrintArmstrongNumbers;
import Lec30.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder_to_Tree {
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
    TreeNode root;
    Scanner sc = new Scanner(System.in);
    public LevelOrder_to_Tree(){
        this.root = createTree();
    }
    public TreeNode createTree(){
        Queue<TreeNode> q = new LinkedList<>();
        int item = sc.nextInt();
        TreeNode nn = new TreeNode(item);
        root = nn;
        q.add(nn);
        while (!q.isEmpty()){
            TreeNode rv = q.remove();
            int child1 = sc.nextInt();
            int child2 = sc.nextInt();
            if(child1!=-1){
                TreeNode n1 = new TreeNode(child1);
                rv.left = n1;
                q.add(n1);
            }
            if(child2!=-1){
                TreeNode n2 = new TreeNode(child2);
                rv.right = n2;
                q.add(n2);
            }
        }
        return root;
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        LevelOrder_to_Tree obj = new LevelOrder_to_Tree();
        obj.preOrder();
    }
}
