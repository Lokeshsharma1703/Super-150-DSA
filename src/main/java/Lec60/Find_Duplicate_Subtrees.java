package Lec60;

import java.util.*;

public class Find_Duplicate_Subtrees {
    public static void main(String[] args) {

    }

    static class TreeNode {
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

    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Set<TreeNode> st = new HashSet<>();
        HashMap<String, TreeNode> mp = new HashMap<>();

        dfs(root, st, mp);

        return new ArrayList<>(st);
    }

    private static String dfs(TreeNode root, Set<TreeNode> st, HashMap<String, TreeNode> mp){
        if(root == null){
            return "x";
        }

        String curr = root.val + "#" + dfs(root.left, st, mp) + "#" + dfs(root.right, st, mp);

        if(mp.containsKey(curr)){
            st.add(mp.get(curr));
        }
        else{
            mp.put(curr, root);
        }

        return curr;
    }
}
