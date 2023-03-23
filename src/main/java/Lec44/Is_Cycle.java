package Lec44;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Cycle{
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Is_Cycle(int v){
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

    public boolean isCycle(){
        int[] in = indegree();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < in.length; i++) {
            if(in[i]==0){
                q.offer(i);
            }
        }

        int count=0;

        while (!q.isEmpty()){
            int removeVtx = q.poll();
            count++;
            for(int ngbr : map.get(removeVtx).keySet()){
                in[ngbr]--;
                if(in[ngbr]==0){
                    q.offer(ngbr);
                }
            }
        }

        return count!=map.size();
    }




    public static void main(String[] args) {
        Is_Cycle t = new Is_Cycle(7);
        t.addEdge(1, 2, 0);
        t.addEdge(1, 4, 0);
        t.addEdge(2, 3, 0);
        t.addEdge(3, 6, 0);
        t.addEdge(4, 3, 0);
        t.addEdge(4, 6, 0);
        t.addEdge(4, 5, 0);
        t.addEdge(5, 7, 0);
        t.addEdge(5, 6, 0);
        t.addEdge(7, 6, 0);
        System.out.println(Arrays.toString(t.indegree()));
        System.out.println(t.isCycle());
        t.addEdge(3, 1, 0);
        System.out.println(t.isCycle());
    }
}
