package Lec63;

import java.util.*;

public class Word_Ladder {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("hot");
        ls.add("dot");
        ls.add("dog");
        ls.add("lot");
        ls.add("log");
        ls.add("cog");
        System.out.println(ladderLength("hit", "cog", ls));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for(String s : wordList){
            set.add(s);
        }

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord, 1));

        while(!q.isEmpty()){
            Pair p = q.poll();
            String s = p.str;

            if (s.equals(endWord)) {
                return p.level;
            }

            for(int i=0; i<s.length(); i++){
                for(char ch='a'; ch<='z'; ch++){
                    char[] arr = s.toCharArray();
                    arr[i] = ch;
                    String temp = new String(arr);
                    if(set.contains(temp)){
                        set.remove(temp);
                        q.offer(new Pair(temp, p.level+1));
                    }
                }
            }
        }

        return 0;
    }

    static class Pair{
        String str;
        int level;

        public Pair(String str, int level) {
            this.str = str;
            this.level = level;
        }
    }
}
