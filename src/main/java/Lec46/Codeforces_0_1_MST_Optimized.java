package Lec46;

import java.util.*;

//https://codeforces.com/problemset/problem/1242/B

public class Codeforces_0_1_MST_Optimized {

    static TreeSet<Integer>[] arr;
    static TreeSet<Integer> visited = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new TreeSet[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new TreeSet<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;

            arr[u].add(v);
            arr[v].add(u);
        }

        for (int i = 0; i < n; i++) {
            visited.add(i);
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            if(visited.remove(i)){
                res++;
                dfs(i);
            }
        }

        System.out.println(res-1);
    }

    private static void dfs(int src){
        List<Integer> ngbr = new ArrayList<>();
        for (int i : visited) {
            if(!arr[src].contains(i)){
                ngbr.add(i);
           }
        }

        for (int i : ngbr) {
            visited.remove(i);
        }

        for (int i : ngbr) {
            dfs(i);
        }
    }
}
