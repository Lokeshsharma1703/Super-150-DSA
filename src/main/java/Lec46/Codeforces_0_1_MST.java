package Lec46;

//https://codeforces.com/problemset/problem/1242/B

import java.util.*;

public class Codeforces_0_1_MST {

    private static HashMap<Integer, List<Integer>> map = new HashMap<>();

    public Codeforces_0_1_MST(int v){
        for (int i = 1; i <= v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int v1, int v2){
        map.get(v1).add(v2);
        map.get(v2).add(v1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Codeforces_0_1_MST graph = new Codeforces_0_1_MST(n);

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        System.out.println(primsAlgo(n));

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

    private static int primsAlgo(int n){
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

            for(int ngbr=1; ngbr<=n; ngbr++){
                if(!visited.contains(ngbr)){
                    int cst = 0;
                    if(map.get(rem.vtx).contains(ngbr)){
                        cst = 1;
                    }
                    PrimsPair nnp = new PrimsPair(ngbr, rem.vtx, cst);
                    pq.add(nnp);
                }
            }
        }

        return totalCost;
    }
}
