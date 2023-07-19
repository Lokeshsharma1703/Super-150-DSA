package Lec61;

import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {
    public static void main(String[] args) {

    }

    public class TreeNode {
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

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<VerticalNode>> mp = new TreeMap<>();
        Queue<VerticalNode> q = new LinkedList<>();
        q.offer(new VerticalNode(root, 0, 0));

        while(!q.isEmpty()){
            VerticalNode curr = q.poll();

            if(!mp.containsKey(curr.verticalLevel)){
                mp.put(curr.verticalLevel, new ArrayList<>());
            }
            mp.get(curr.verticalLevel).add(curr);

            if(curr.node.left!=null){
                q.add(new VerticalNode(curr.node.left, curr.horizontalLevel+1, curr.verticalLevel-1));
            }

            if(curr.node.right!=null){
                q.add(new VerticalNode(curr.node.right, curr.horizontalLevel+1, curr.verticalLevel+1));
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int key : mp.keySet()){
            List<VerticalNode> temp = mp.get(key);
            Collections.sort(temp, new Comparator<VerticalNode>() {
                @Override
                public int compare(VerticalNode o1, VerticalNode o2){
                    if(o1.horizontalLevel==o2.horizontalLevel){
                        return o1.node.val - o2.node.val;
                    }

                    return 0;
                }
            });

            List<Integer> curr = new ArrayList<>();
            for(VerticalNode p : temp){
                curr.add(p.node.val);
            }

            res.add(new ArrayList<>(curr));
        }

        return res;
    }

    class VerticalNode{
        TreeNode node;
        int horizontalLevel;
        int verticalLevel;

        public VerticalNode(TreeNode node, int horizontalLevel, int verticalLevel) {
            this.node = node;
            this.horizontalLevel = horizontalLevel;
            this.verticalLevel = verticalLevel;
        }
    }
}
