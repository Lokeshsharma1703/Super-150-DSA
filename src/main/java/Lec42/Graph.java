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

    public boolean hasPath(int src, int des, HashSet<Integer> visited){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int neighbour : map.get(src).keySet()){
            if(!visited.contains(neighbour)) {
                boolean res = hasPath(neighbour, des, visited);
                if (res) {
                    return res;
                }
            }
        }
        visited.remove(src);
        return false;
    }
}
