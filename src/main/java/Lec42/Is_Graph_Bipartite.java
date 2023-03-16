package Lec42;

import java.util.*;

public class Is_Graph_Bipartite {

    public static void main(String[] args) {
        int[][] graph = {{1,2,3}, {0,2}, {0,1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }

    static class BipartitePair{
        int vtx;
        int lv;

        public BipartitePair(int vtx, int lv) {
            this.vtx = vtx;
            this.lv = lv;
        }
    }

    public static boolean isBipartite(int[][] graph) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        for(int src = 0; src<graph.length; src++) {
            if(visited.containsKey(src)){
                continue;
            }
            q.offer(new BipartitePair(src, 0));
            while (!q.isEmpty()) {
                BipartitePair remove = q.poll();

                if (visited.containsKey(remove.vtx)) {
                    if(visited.get(remove.vtx) != remove.lv){
                        return false;
                    }
                    continue;
                }

                visited.put(remove.vtx, remove.lv);

                for (int neighbours : graph[remove.vtx]) {
                    if (!visited.containsKey(neighbours)) {
                        q.add(new BipartitePair(neighbours, remove.lv+1));
                    }
                }
            }
        }
        return true;
    }

}
