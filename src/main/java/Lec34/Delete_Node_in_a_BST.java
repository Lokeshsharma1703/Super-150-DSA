package Lec34;

public class Delete_Node_in_a_BST {
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }

        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else {
            // 1 or 0 child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else {
                TreeNode temp = root.right;
                while (temp.left!=null){
                    temp = temp.left;
                }
                root.val = temp.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
}
