package Lec58;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum_XOR_With_an_Element_From_Array {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[][] queries = {{3,1}, {1,3}, {5,6}};

        int[] res = maximizeXor(nums, queries);
        for(int i : res){
            System.out.print(i+" ");
        }
    }

    public static int[] maximizeXor(int[] nums, int[][] queries) {
        Pair[] query = new Pair[queries.length];
        for(int i=0; i<queries.length; i++){
            query[i] = new Pair(queries[i][0], queries[i][1], i);
        }

        Arrays.sort(query, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.mi - o2.mi;
            }
        });
        Arrays.sort(nums);

        int[] res = new int[queries.length];
        Node root = new Node();
        int j = 0;

        for (int i = 0; i < res.length; i++) {
            while (j<nums.length && nums[j] <= query[i].mi){
                insert(root, nums[j]);
                j++;
            }
            if(j==0){
                res[query[i].qi] = -1;
            }
            else{
                res[query[i].qi] = getMaxXOR(root, query[i].xi);
            }
        }

        return res;
    }

    static class Pair{
        int xi;
        int mi;
        int qi;

        public Pair(int xi, int mi, int qi) {
            this.xi = xi;
            this.mi = mi;
            this.qi = qi;
        }
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
}
