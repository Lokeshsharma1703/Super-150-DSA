package Lec53;

import java.util.*;

public class Longest_Duplicate_Substring {
    public static void main(String[] args) {
        System.out.println(longestDupSubstring("banana"));
    }

    public static String longestDupSubstring(String s){
        int low = 0;
        int high = s.length();

        String res = "";

        while (low <= high){
            int mid = (low + high)/2;
            String temp = solve(s, mid);

            if(temp.length() > 0){
                low = mid+1;
                res = temp;
            }
            else{
                high = mid-1;
            }
        }

        return res;
    }

    private static String solve(String s, int mid){
        long mod = 1000_000_007;
        long pow = 1;
        long hashValue = 0;
        int prime = 31;

        for (int ei = mid-1; ei >= 0; ei--) {
            hashValue = (hashValue + ((s.charAt(ei)-'a'+1) * pow) % mod) % mod;
            if(ei > 0){
                pow = (pow * prime) % mod;
            }
        }

        HashMap<Long, List<Integer>> mp = new HashMap<>();
        mp.put(hashValue, new ArrayList<>());
        mp.get(hashValue).add(0);

        for(int ei = mid, si=0; ei < s.length(); ei++, si++){
            hashValue = (hashValue - (((s.charAt(si)-'a'+1)*pow) % mod) + mod) % mod;
            hashValue = (hashValue * prime) % mod;
            hashValue = (hashValue + (s.charAt(ei)-'a'+1)) % mod;

            if(mp.containsKey(hashValue)){
                String curr = s.substring(si+1, ei+1);
                for(int st : mp.get(hashValue)){
                    if(curr.equals(s.substring(st, st+mid))){
                        return curr;
                    }
                }
                mp.get(hashValue).add(si+1);
            }
            else{
                mp.put(hashValue, new ArrayList<>());
                mp.get(hashValue).add(si+1);
            }
        }

        return "";
    }
}
