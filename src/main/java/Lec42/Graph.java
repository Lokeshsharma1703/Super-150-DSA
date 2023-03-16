package Lec42;

import java.util.*;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Graph(int v){
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean ConatainsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2);
    }

    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }

    public int noOfEdges(){
        int sum = 0;
        for(int key : map.keySet()){
            sum += map.get(key).size();
        }
        return sum/2;
    }

    public void removeEdge(int v1, int v2){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
    }

    public void removeVertex(int v1){
        for(int key : map.get(v1).keySet()){
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }

    public void display(){
        for(int key : map.keySet()){
            System.out.println(key +" "+map.get(key));
        }
    }

    public boolean hasPath(int src, int des, HashSet<Integer> visited, String path){
        if(src==des){
            path += des;
            System.out.println(path);
            return true;
        }
        visited.add(src);
        for(int neighbour : map.get(src).keySet()){
            if(!visited.contains(neighbour)) {
                boolean res = hasPath(neighbour, des, visited, path + src+" -> ");
                if (res) {
                    return res;
                }
            }
        }
        visited.remove(src);
        return false;
    }

    public boolean bfs(int src, int des){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        while (!q.isEmpty()){
            int remove = q.poll();

            if(visited.contains(remove)){
                continue;
            }

            visited.add(remove);

            if(remove == des){
                return true;
            }

            for(int neighbours : map.get(remove).keySet()){
                if(!visited.contains(neighbours)){
                    q.add(neighbours);
                }
            }
        }

        return false;
    }

    public boolean dfs(int src, int des){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(src);
        while (!st.isEmpty()){
            int remove = st.pop();

            if(visited.contains(remove)){
                continue;
            }

            visited.add(remove);

            if(remove == des){
                return true;
            }

            for(int neighbours : map.get(remove).keySet()){
                if(!visited.contains(neighbours)){
                    st.push(neighbours);
                }
            }
        }

        return false;
    }

    public void bft(){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int src : map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            q.offer(src);
            while (!q.isEmpty()) {
                int remove = q.poll();

                if (visited.contains(remove)) {
                    continue;
                }

                visited.add(remove);

                System.out.print(remove + " ");

                for (int neighbours : map.get(remove).keySet()) {
                    if (!visited.contains(neighbours)) {
                        q.add(neighbours);
                    }
                }
            }
        }
    }

    public void dft(){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int src : map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            st.push(src);
            while (!st.isEmpty()) {
                int remove = st.pop();

                if (visited.contains(remove)) {
                    continue;
                }

                visited.add(remove);

                System.out.print(remove+" ");

                for (int neighbours : map.get(remove).keySet()) {
                    if (!visited.contains(neighbours)) {
                        st.push(neighbours);
                    }
                }
            }
        }
    }
}
