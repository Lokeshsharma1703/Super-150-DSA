package Lec30;

public class BinaryTree_Client {
    public static void main(String[] args) {
        Binary_Tree bt = new Binary_Tree();
//        bt.display();
        bt.preOrder();
        bt.postOrder();
        bt.inOrder();
        System.out.println(bt.search(30));
        System.out.println(bt.maxValue());
        System.out.println(bt.height());
//        10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
    }
}
