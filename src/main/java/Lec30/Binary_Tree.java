package Lec30;

import java.util.Scanner;

public class Binary_Tree {
    private class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public Binary_Tree(){
        root = createTree();
    }

    private Node createTree(){
        int item = sc.nextInt();
        Node node = new Node(item);
        boolean hasLeftChild = sc.nextBoolean();
        if(hasLeftChild){
            node.left = createTree();
        }
        boolean hasRightChild = sc.nextBoolean();
        if(hasRightChild){
            node.right = createTree();
        }
        return node;
    }

    private void display(Node node){
        if(node==null){
            return;
        }
        String s = "";
        s = "<--"+s+node.val+"-->";
        if(node.left!=null){
            s = node.left.val+s;
        }else{
            s = "."+s;
        }
        if(node.right!=null){
            s = s+node.right.val;
        }
        else{
            s = s+".";
        }
        System.out.println(s);
        display(node.left);
        display(node.right);
    }

    public void display(){
        display(root);
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

    public boolean search(int item){
        return search(root, item);
    }

    private boolean search(Node node, int item){
        if(node==null){
            return false;
        }
        if(node.val==item){
            return true;
        }
        boolean left = search(node.left, item);
        boolean right = search(node.right, item);

        return left || right;
    }

    private int maxValue(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int lft = maxValue(node.left);
        int rgt = maxValue(node.right);
        return Math.max(Math.max(lft, rgt), node.val);
    }

    public int maxValue(){
        return maxValue(root);
    }

    private int height(Node node){
        if(node==null){
            return -1;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        return Math.max(lheight, rheight)+1;
    }

    public int height(){
        return height(root);
    }
}
