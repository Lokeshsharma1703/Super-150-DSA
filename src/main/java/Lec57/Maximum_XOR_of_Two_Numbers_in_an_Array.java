package Lec57;

public class Maximum_XOR_of_Two_Numbers_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {14,70,53,83,49,91,36,80,92,51,66,70};

        System.out.println(findMaximumXOR(arr));
    }

    public static int findMaximumXOR(int[] nums) {
        Node root = new Node();
        for(int ele : nums){
            insert(root, ele);
        }

        int xor = Integer.MIN_VALUE;
        for(int i : nums){
            xor = Math.max(xor, getMaxXOR(root, i));
        }

        return xor;
    }

    public static int getMaxXOR(Node root, int val){
        Node curr = root;
        int res = 0;

        for (int i = 31; i >= 0; i--) {
            int bit = (val & (1<<i));

            if(bit==0){
                if(curr.one != null){
                    res += (1<<i);
                    curr = curr.one;
                }
                else{
                    curr = curr.zero;
                }
            }
            else{
                if(curr.zero != null){
                    res += (1<<i);
                    curr = curr.zero;
                }
                else{
                    curr = curr.one;
                }
            }
        }

        return res;
    }

    public static class Node{
        Node zero;
        Node one;
    }

    public static void insert(Node root, int val){
        Node curr = root;
        for(int i=31; i>=0; i--){
            if((val & (1<<i))==0){
                if(curr.zero != null){
                    curr = curr.zero;
                }else{
                    Node nn = new Node();
                    curr.zero = nn;
                    curr = curr.zero;
                }
            }
            else{
                if(curr.one != null){
                    curr = curr.one;
                }
                else{
                    Node nn = new Node();
                    curr.one = nn;
                    curr = curr.one;
                }
            }
        }
    }
}
