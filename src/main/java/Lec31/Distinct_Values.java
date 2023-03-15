package Lec31;

import java.util.*;

public class Distinct_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            List<List<Integer>> res = new ArrayList<>();
            subset(arr, 0, new ArrayList<>(), res);
            System.out.println(res);
//            Set<Integer> hs = new HashSet<>();
//            for(List<Integer> i:res){
//                Collections.sort(i, Collections.reverseOrder());
//                int a = i.get(0);
//                int b = i.get(1);
//                hs.add(a-b);
//            }
//            System.out.println(hs.size());
        }
    }
    private static void subset(int[] arr, int idx, List<Integer> temp, List<List<Integer>> res){
        if(temp.size()>=2){
            res.add(new ArrayList<>(temp));
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            temp.add(arr[i]);
            subset(arr, i+1, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}
