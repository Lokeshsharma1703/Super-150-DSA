package Lec44;

import java.util.*;

public class DSU {

    class Node{
        int vtx;
        Node parent;
        int rank;
        public Node(){}
        public Node(int vtx, Node parent, int rank) {
            this.vtx = vtx;
            this.parent = parent;
            this.rank = rank;
        }
    }

    HashMap<Integer, Node> map = new HashMap<>();

    public void createSet(int v){
        Node node = new Node();
        node.vtx = v;
        node.parent = node;
        node.rank = 0;
        map.put(v, node);
    }

    public int find(int v){
        Node nn = find(map.get(v));
        return find(nn).vtx;
    }

    private Node find(Node nn){
        if(nn.parent==nn){
            return nn;
        }
        Node node = find(nn.parent);
        nn.parent = node;     // path compression
        return node;
    }

    public void union(int v1, int v2){
        Node re1 = find(map.get(v1));
        Node re2 = find(map.get(v2));

        if(re1.rank==re2.rank){
            re1.parent = re2;
            re2.rank++;
        }
        else if(re1.rank < re2.rank){
            re1.parent = re2;
        }
        else{
            re2.parent = re1;
        }
    }



}
