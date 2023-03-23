package Lec44;

import java.util.*;

//https://leetcode.ca/all/269.html#:~:text=There%20is%20a%20new%20alien,rules%20of%20this%20new%20language.

public class Alien_Dictionary {
    public static void main(String[] args) {
        System.out.println(findOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}, 5));
//        System.out.println(findOrder(new String[]{"z", "x", "z"}, 3));
    }
    public static String findOrder(String [] dict, int N) {

        HashMap<Character, List<Character>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = dict[i];
            for (int j = 0; j < s.length(); j++) {
                if(!map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), new ArrayList<>());
                }
            }
        }

        for (int i = 0; i < N-1; i++) {
            String s1 = dict[i];
            String s2 = dict[i+1];
            if(s1.startsWith(s2) && s1.length()>s2.length()){
                return "";
            }

            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                if(s1.charAt(j)!=s2.charAt(j)){
                    map.get(s1.charAt(j)).add(s2.charAt(j));
                    break;
                }
            }
        }

        return topologicalSort(map);

    }

    public static String topologicalSort(HashMap<Character, List<Character>> map){
        int[] in = indegree(map);
        Queue<Character> q = new LinkedList<>();

        for (char ch : map.keySet()) {
            if(in[ch-'a']==0){
                q.offer(ch);
            }
        }

        int count = 0;
        StringBuilder sb = new StringBuilder();

        while (!q.isEmpty()){
            char ch = q.poll();
            sb.append(ch);
            count++;
            for(char ngbr : map.get(ch)){
                in[ngbr-'a']--;
                if(in[ngbr-'a']==0){
                    q.offer(ngbr);
                }
            }
        }

        return count==map.size() ? sb.toString() : "";
    }

    public static int[] indegree(HashMap<Character, List<Character>> map){
        int[] in = new int[26];
        for(char key : map.keySet()){
            for(char nbrs : map.get(key)){
                in[nbrs-'a']++;
            }
        }
        return in;
    }
}
