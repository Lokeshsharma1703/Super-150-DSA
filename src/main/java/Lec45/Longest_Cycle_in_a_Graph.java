package Lec45;

import java.util.LinkedList;
import java.util.Queue;

public class Longest_Cycle_in_a_Graph {
    public static void main(String[] args) {
        System.out.println(longestCycle(new int[]{3,3,4,2,3}));
    }
    public static int longestCycle(int[] edges) {
        int[] in = new int[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if(edges[i] != -1){
                in[edges[i]]++;
            }
        }

        boolean[] visited = new boolean[edges.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < edges.length; i++) {
            if(in[i]==0){
                q.offer(i);
            }
        }

        while (!q.isEmpty()){
            int rem = q.poll();

            visited[rem] = true;

            int ngbr = edges[rem];
            if(ngbr != -1){
                in[ngbr]--;
                if(in[ngbr]==0){
                    q.offer(ngbr);
                }
            }
        }

        int res = -1;
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]){
                int count = 1;
                int ngbr = edges[i];
                visited[i] = true;
                while (ngbr != i){
                    visited[ngbr] = true;
                    ngbr = edges[ngbr];
                    count++;
                }
                res = Math.max(res, count);
            }
        }

        return res;
    }
}
