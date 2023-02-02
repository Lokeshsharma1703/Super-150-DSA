package Lec34;

public class Binary_SearchTree {
    private class Node{
        int val;
        Node left;
        Node right;
        Node(){}
        Node(int val){
            this.val = val;
        }
    }

    private Node root;

    public Binary_SearchTree(int[] inOrder){
        this.root = createTree(inOrder, 0, inOrder.length-1);
    }

    public Node createTree(int[] inOrder, int low, int high){
        if(high<low){
            return null;
        }
        int mid = (low+high)/2;
        Node nn = new Node(inOrder[mid]);
        nn.left = createTree(inOrder, low, mid-1);
        nn.right = createTree(inOrder, mid+1, high);
        return nn;
    }

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Binary_SearchTree obj = new Binary_SearchTree(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90});
        obj.inOrder(obj.root);
    }
}
