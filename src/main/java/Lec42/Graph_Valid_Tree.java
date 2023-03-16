package Lec42;

// https://leetcode.ca/all/261.html

import java.util.*;

public class Graph_Valid_Tree {
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{0,3},{1,4}};
        System.out.println(validTree(5, edges));
    }
    public static boolean validTree(int n, int[][] edges){
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            mp.get(edges[i][0]).add(edges[i][1]);
            mp.get(edges[i][1]).add(edges[i][0]);
        }

        return bft(mp);
    }

    public static boolean bft(HashMap<Integer, ArrayList<Integer>> map){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int src : map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            count++;
            q.offer(src);
            while (!q.isEmpty()) {
                int remove = q.poll();

                if (visited.contains(remove)) {
                    return false;
                }

                visited.add(remove);

                System.out.print(remove + " ");

                for (int neighbours : map.get(remove)) {
                    if (!visited.contains(neighbours)) {
                        q.add(neighbours);
                    }
                }
            }
        }

        return count==1;
    }
}
