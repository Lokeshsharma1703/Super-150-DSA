package Lec44;

import java.util.*;

public class Topological_Sort {

    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Topological_Sort(int v){
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
    }

    public int[] indegree(){
        int[] in = new int[map.size()+1];
        for(int key : map.keySet()){
            for(int nbrs : map.get(key).keySet()){
                in[nbrs]++;
            }
        }
        return in;
    }

    public void topologicalSort(){
        int[] in = indegree();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < in.length; i++) {
            if(in[i]==0){
                q.offer(i);
            }
        }

        while (!q.isEmpty()){
            int removeVtx = q.poll();
            System.out.print(removeVtx+" ");
            for(int ngbr : map.get(removeVtx).keySet()){
                in[ngbr]--;
                if(in[ngbr]==0){
                    q.offer(ngbr);
                }
            }
        }
    }




    public static void main(String[] args) {
        Topological_Sort t = new Topological_Sort(7);
        t.addEdge(1, 2, 0);
        t.addEdge(1, 4, 0);
        t.addEdge(2, 3, 0);
        t.addEdge(3, 6, 0);
        t.addEdge(1, 2, 0);
        t.addEdge(4, 3, 0);
        t.addEdge(4, 6, 0);
        t.addEdge(4, 5, 0);
        t.addEdge(5, 7, 0);
        t.addEdge(5, 6, 0);
        t.addEdge(7, 6, 0);
        System.out.println(Arrays.toString(t.indegree()));
        t.topologicalSort();

    }
}
