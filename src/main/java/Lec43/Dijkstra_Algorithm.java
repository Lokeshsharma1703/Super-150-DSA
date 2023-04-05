package Lec43;

import java.util.*;


public class Dijkstra_Algorithm {

    static HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Dijkstra_Algorithm(int v){
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    private static class Dijkstra_Pair{
        int vtx;
        String path;
        int cost;

        public Dijkstra_Pair(int vtx, String path, int cost) {
            this.vtx = vtx;
            this.path = path;
            this.cost = cost;
        }

        @Override
        public String toString(){
            return this.vtx+" vai "+this.path+" @ "+this.cost;
        }
    }

    public static void dijkstraAlgorithm(){
        PriorityQueue<Dijkstra_Pair> pq = new PriorityQueue<>(new Comparator<Dijkstra_Pair>() {
            @Override
            public int compare(Dijkstra_Pair o1, Dijkstra_Pair o2) {
                return o1.cost - o2.cost;
            }
        });

        Set<Integer> visited = new HashSet<>();

        pq.add(new Dijkstra_Pair(1, "1", 0));

        while (!pq.isEmpty()){
            Dijkstra_Pair removePair = pq.remove();

            if(visited.contains(removePair.vtx)){
                continue;
            }

            visited.add(removePair.vtx);

            System.out.println(removePair);

            for(int neighbours : map.get(removePair.vtx).keySet()){
                if(!visited.contains(neighbours)){
                    int cost = removePair.cost + map.get(removePair.vtx).get(neighbours);
                    pq.add(new Dijkstra_Pair(neighbours, removePair.path+neighbours, cost));
                }
            }
        }

    }

    public static void main(String[] args) {
        Dijkstra_Algorithm graph = new Dijkstra_Algorithm(9);
        graph.addEdge(1,4,6);
        graph.addEdge(1,2,10);
        graph.addEdge(2,3,7);
        graph.addEdge(3,4,5);
        graph.addEdge(4,5,1);
        graph.addEdge(5,6,4);
        graph.addEdge(7,5,3);
        dijkstraAlgorithm();
    }

}
