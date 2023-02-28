package Lec39;

import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(arr);
        System.out.println(res);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> mp = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            String key = generateKey(s);
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(s);
        }

        List<List<String>> res = new ArrayList<>();
        for(String key : mp.keySet()){
            res.add(mp.get(key));
        }

        return res;
    }
    private static String generateKey(String s){
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i+" ");
        }

        return sb.toString();
    }
}
