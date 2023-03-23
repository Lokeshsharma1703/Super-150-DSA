package Lec44;

import java.util.*;

public class Course_Schedule_II {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOrder(4, new int[][]{{1,0}, {2,0}, {3,1}, {3,2}})));
        System.out.println(Arrays.toString(findOrder(1, new int[][]{})));
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<numCourses; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length; i++){
            int v1 = prerequisites[i][0];
            int v2 = prerequisites[i][1];
            map.get(v2).add(v1);
        }

        return topologicalSort(map, numCourses);
    }
    public static int[] indegree(HashMap<Integer, List<Integer>> map){
        int[] in = new int[map.size()];
        for(int key : map.keySet()){
            for(int nbrs : map.get(key)){
                in[nbrs]++;
            }
        }
        return in;
    }

    public static int[] topologicalSort(HashMap<Integer, List<Integer>> map, int n){
        int[] in = indegree(map);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < in.length; i++) {
            if(in[i]==0){
                q.offer(i);
            }
        }

        int[] res = new int[n];
        int i=0;
        int count = 0;
        while (!q.isEmpty()){
            int removeVtx = q.poll();
            res[i++] = removeVtx;
            count++;
            for(int ngbr : map.get(removeVtx)){
                in[ngbr]--;
                if(in[ngbr]==0){
                    q.offer(ngbr);
                }
            }
        }

        return count==map.size() ? res : new int[0];
    }
}
