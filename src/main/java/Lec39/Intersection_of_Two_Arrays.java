package Lec39;

import java.util.*;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] res = intersection(arr1, arr2);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            mp.put(nums1[i], mp.getOrDefault(nums1[i], 0)+1);
        }

        for(int i=0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i]) && mp.get(nums2[i])>0){
                list.add(nums2[i]);
                mp.put(nums2[i], mp.get(nums2[i])-1);
            }
        }

        int[] res = new int[list.size()];
        int i=0;
        for(int ele : list){
            res[i++] = ele;
        }

        return res;
    }
}
