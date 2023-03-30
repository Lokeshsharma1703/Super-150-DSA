package Lec46;

import java.util.*;

//https://www.spoj.com/problems/MST/

public class Prims {

    private static HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Prims(int v){
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Prims graph = new Prims(n);
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.addEdge(u, v, w);
        }

        primsAlgo();
    }

    static class PrimsPair{
        int vtx;
        int src;
        int cost;

        public PrimsPair(int vtx, int src, int cost) {
            this.vtx = vtx;
            this.src = src;
            this.cost = cost;
        }

        @Override
        public String toString(){
            return this.vtx+" "+this.src+" @ "+this.cost;
        }
    }

    private static void primsAlgo(){
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost - o2.cost;
            }
        });

        pq.offer(new PrimsPair(1, 1, 0));

        HashSet<Integer> visited = new HashSet<>();

        int totalCost = 0;

        while (!pq.isEmpty()){
            PrimsPair rem = pq.poll();
            if(visited.contains(rem.vtx)){
                continue;
            }
            visited.add(rem.vtx);
//            System.out.println(rem);
            totalCost += rem.cost;

            for(int ngbr : map.get(rem.vtx).keySet()){
                if(!visited.contains(ngbr)){
                    PrimsPair nnp = new PrimsPair(ngbr, rem.vtx, map.get(rem.vtx).get(ngbr));
                    pq.add(nnp);
                }
            }
        }

        System.out.println(totalCost);
    }
}
