package Lec33;

public class BinaryTree_By_InOrder_PreOrder {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
    }

    private TreeNode createTree(int[] inOrder, int ilo, int ihi, int[] preOrder, int plo, int phi){
        if(ilo > ihi || plo > phi){
            return null;
        }

        TreeNode nn = new TreeNode(preOrder[plo]);

        int idx = search(inOrder, preOrder[plo], ilo, ihi);
        int net = idx-ilo;
        nn.left = createTree(inOrder, ilo, idx-1, preOrder, plo+1, phi+net);
        nn.right = createTree(inOrder, idx+1, ihi, preOrder, plo+net+1, phi);
        return nn;
    }

    private int search(int[] inOrder, int ele, int start, int end){
        for(int i=start;i<=end;i++){
            if(inOrder[i]==ele){
                return i;
            }
        }
        return -1;
    }
}